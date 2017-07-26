package com.teducn.cn.weatherforecast.ui;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.natasa.progressviews.CircleSegmentBar;
import com.teducn.cn.weatherforecast.R;
import com.teducn.cn.weatherforecast.adapter.WeatherAdapter;
import com.teducn.cn.weatherforecast.entity.WeatherBean;
import com.teducn.cn.weatherforecast.http.HttpWeatherManager;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.chart.PointStyle;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_Menu;
    TextView textView_CityName;
    ImageView imageView_Chart;

    DrawerLayout drawerLayout_Weather;

    RecyclerView recycleView_Weather;
    WeatherAdapter adapter = null;

    NavigationView navegationView_Weather;
    SwipeRefreshLayout refreshLayout_Weather;

    TextView textView_Update;
    TextView textView_Week;
    TextView textView_Quality;
    CircleSegmentBar circleBar_Temp;
    Handler handler = null;
    Runnable runnable = null;

    FrameLayout frameLayout_ChartLine = null;

    List<WeatherBean.Result.Data.WeatherX> weathers; // 连续七天天气温度

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialUI();
        initialRealTime();
        setListener();
    }

    private void initialRealTime() {
        textView_Update = (TextView) findViewById(R.id.textView_RealTime_Update);
        textView_Quality = (TextView) findViewById(R.id.textView_RealTime_Quality);
        textView_Week = (TextView) findViewById(R.id.textView_RealTime_Week);
        circleBar_Temp = (CircleSegmentBar) findViewById(R.id.circleBar_Temp);

        circleBar_Temp.setCircleViewPadding(5);
        circleBar_Temp.setWidth(280);
        circleBar_Temp.setWidthProgressBackground(30);
        circleBar_Temp.setWidthProgressBarLine(25);
        circleBar_Temp.setStartPositionInDegrees(90);
        circleBar_Temp.setLinearGradientProgress(true);
    }

    private void setListener() {
        imageView_Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout_Weather.isDrawerOpen(Gravity.LEFT)) {
                    drawerLayout_Weather.closeDrawer(Gravity.LEFT);
                } else {
                    drawerLayout_Weather.openDrawer(Gravity.LEFT);
                }
            }
        });
        navegationView_Weather.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.beijing:
                        textView_CityName.setText("北京");
                        loadWeather(true);
                        break;
                    case R.id.shanghai:
                        textView_CityName.setText("上海");
                        loadWeather(true);
                        break;
                    case R.id.guangzhou:
                        textView_CityName.setText("广州");
                        loadWeather(true);
                        break;
                    case R.id.shenzhen:
                        textView_CityName.setText("深圳");
                        loadWeather(true);
                        break;
                    case R.id.nanjing:
                        textView_CityName.setText("南京");
                        loadWeather(true);
                        break;
                    case R.id.zhengzhou:
                        textView_CityName.setText("郑州");
                        loadWeather(true);
                        break;
                    case R.id.wuhan:
                        textView_CityName.setText("武汉");
                        loadWeather(true);
                        break;
                }
                drawerLayout_Weather.closeDrawer(Gravity.LEFT);
                return true;
            }
        });
        refreshLayout_Weather.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadWeather(false);
                refreshLayout_Weather.setRefreshing(false);
            }
        });
        imageView_Chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int visibility = frameLayout_ChartLine.getVisibility();
                if (visibility == View.VISIBLE) {
                    frameLayout_ChartLine.setVisibility(View.INVISIBLE);
                } else {
                    frameLayout_ChartLine.setVisibility(View.VISIBLE);
                    GraphicalView view = ChartFactory.getLineChartView(MainActivity.this, getDataSet(), getRenderer());
                    // 把图标添加到fragmentLayout上
                    frameLayout_ChartLine.addView(view);
                }
            }
        });
    }

    private void initialUI() {
        handler = new Handler();

        refreshLayout_Weather = (SwipeRefreshLayout) findViewById(R.id.refresh_Weather);
        navegationView_Weather = (NavigationView) findViewById(R.id.navigation_View);
        drawerLayout_Weather = (DrawerLayout) findViewById(R.id.drawer_Weather);
        textView_CityName = (TextView) findViewById(R.id.textView_Actionbar_Title);
        imageView_Menu = (ImageView) findViewById(R.id.imageView_Actionbar_Left);
        imageView_Chart = (ImageView) findViewById(R.id.imageView_Actionbar_Right);
        frameLayout_ChartLine = (FrameLayout) findViewById(R.id.frameLayout_ChartLine);

        imageView_Menu.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        imageView_Chart.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        navegationView_Weather.setItemIconTintList(null);
        // 设置刷新图标的动画颜色
        refreshLayout_Weather.setColorSchemeResources(R.color.colorPrimaryDark, R.color.colorPrimary, R.color.colorAccent);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        recycleView_Weather = (RecyclerView) findViewById(R.id.recycler_Weather);
        recycleView_Weather.setLayoutManager(manager);
        adapter = new WeatherAdapter(this);
        recycleView_Weather.setAdapter(adapter);
    }

    public void loadWeather(final boolean isClear) {
        String cityName = textView_CityName.getText().toString();
        HttpWeatherManager.loadWeather(this, cityName, new HttpWeatherManager.WeatherLoadListener() {
            @Override
            public void onWeathersLoadEnd(WeatherBean weatherBean) {
                weathers = weatherBean.getResult().getData().getWeather();
                adapter.addWeathers(weathers, isClear);

                String date = weatherBean.getResult().getData().getRealtime().getDate();
                String time = weatherBean.getResult().getData().getRealtime().getTime();
                textView_Update.setText(date + " " + time);
                int weekNumber = weatherBean.getResult().getData().getRealtime().getWeek();
                // 转换星期
                String weekDay = switchWeek(weekNumber);
                textView_Week.setText(weekDay);

                String condition = weatherBean.getResult().getData().getRealtime().getWeather().getInfo();
                String quality = weatherBean.getResult().getData().getPm25().getPm25().getQuality();
                textView_Quality.setText(condition + "|" + "空气质量" + quality);

                String strTemp = weatherBean.getResult().getData().getRealtime().getWeather().getTemperature();
                int temperature = Integer.parseInt(strTemp);
                setTemperature(temperature);
            }
        });
    }

    private void setTemperature(final int temperature) {
        // 初始化handler对象
        handler.removeCallbacksAndMessages(null);
        runnable = new Runnable() {
            int progress = 0;

            @Override
            public void run() {
                progress++;
                if (progress < (100 * temperature) / 50) {
                    circleBar_Temp.setProgress(progress);
                    circleBar_Temp.setText(temperature + "℃");
                }
                handler.postDelayed(runnable, 100);
            }
        };
        // 启动线程
        handler.postDelayed(runnable, 1000);
    }

    private String switchWeek(int weekNumber) {
        String weekDay = "";
        switch (weekNumber) {
            case 1:
                weekDay = "星期一";
                break;
            case 2:
                weekDay = "星期二";
                break;
            case 3:
                weekDay = "星期三";
                break;
            case 4:
                weekDay = "星期四";
                break;
            case 5:
                weekDay = "星期五";
                break;
            case 6:
                weekDay = "星期六";
                break;
            case 7:
                weekDay = "星期日";
                break;
        }
        return weekDay;
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadWeather(true);
    }

    /**
     * 获得图表的渲染器
     *
     * @return
     */
    public XYMultipleSeriesRenderer getRenderer() {
        XYMultipleSeriesRenderer renderer = new XYMultipleSeriesRenderer();
        // 定义折线颜色的数组
        int[] colors = new int[]{Color.GREEN, Color.YELLOW};
        // 定义折线拐点的样式
        PointStyle[] styles = new PointStyle[]{PointStyle.CIRCLE, PointStyle.SQUARE};
        // 设置X轴坐标点的个数
        renderer.setXLabels(7);
        // 设置Y轴坐标点的个数
        renderer.setYLabels(8);
        // 设置图表中显示网格线
        renderer.setShowGrid(true);

        // 设置整个图表标题
        renderer.setChartTitle("温度走势");
        renderer.setChartTitleTextSize(48);
        // X轴的标题
        renderer.setXTitle("未来7天");
        // Y轴的标题
        renderer.setYTitle("温度");
        // 俩个坐标轴标题的字体的大小
        renderer.setAxisTitleTextSize(30);
        // 设置俩个坐标轴的标签的字体的大小
        renderer.setLabelsTextSize(30);
        renderer.setLegendTextSize(26);

        // 设置X轴的数据的最大值
        renderer.setXAxisMax(7.5);
        renderer.setXAxisMin(0.5);
        // 设置Y轴的数据的最大值
        renderer.setYAxisMax(50);
        renderer.setYAxisMin(-15);

        // 设置俩个坐标轴的颜色
        renderer.setAxesColor(Color.LTGRAY);
        renderer.setLabelsColor(Color.LTGRAY);
        // 设置拐点的大小
        renderer.setPointSize(8f);
        renderer.setMargins(new int[]{50, 50, 30, 30});

        int length = colors.length;
        for (int i = 0; i < length; i++) {
            XYSeriesRenderer r = new XYSeriesRenderer();
            // 设置每一条折线的粗细
            r.setLineWidth(6);
            r.setColor(colors[i]);
            r.setPointStyle(styles[i]);
            r.setFillPoints(true);

            // 把子渲染器添加到总的渲染器中
            renderer.addSeriesRenderer(r);
        }
        return renderer;
    }

    public XYMultipleSeriesDataset getDataSet() {
        XYMultipleSeriesDataset dataSet = new XYMultipleSeriesDataset();
        String[] titles = new String[]{"白天温度", "夜晚温度"};
        // 构建X轴的坐标
        List<double[]> x = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            double[] d = new double[]{1, 2, 3, 4, 5, 6, 7};
            x.add(d);
        }

        List<double[]> y = new ArrayList<>();
        double[] days = new double[7];
        double[] nights = new double[7];
        // 获得天气的温度的数据
        for (int i = 0; i < weathers.size(); i++) {
            days[i] = Double.parseDouble(weathers.get(i).getInfo().getDay().get(2));
            nights[i] = Double.parseDouble(weathers.get(i).getInfo().getNight().get(2));
        }
        y.add(days);
        y.add(nights);
        // 创建俩个数据系列
        for (int i = 0; i < titles.length; i++) {
            XYSeries series = new XYSeries(titles[i]);
            double[] xv = x.get(i);
            double[] yv = y.get(i);
            for (int k = 0; k < xv.length; k++) {
                series.add(xv[k], yv[k]);
            }
            // 把子数据序列添加到总的数据集当中去
            dataSet.addSeries(series);
        }
        return dataSet;
    }
}
