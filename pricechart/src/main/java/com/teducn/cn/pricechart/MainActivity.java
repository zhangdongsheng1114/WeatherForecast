package com.teducn.cn.pricechart;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.chart.PointStyle;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lineView();
    }

    // 折线图
    private void lineView() {
        // 同样是需要数据dataset和视图渲染器renderer
        XYMultipleSeriesDataset mDataset = new XYMultipleSeriesDataset();
        XYSeries series = new XYSeries("第一条线");
        series.add(1, 6);
        series.add(2, 5);
        series.add(3, 7);
        series.add(4, 4);
        mDataset.addSeries(series);
        XYSeries seriesTwo = new XYSeries("第二条线");
        seriesTwo.add(1, 4);
        seriesTwo.add(2, 6);
        seriesTwo.add(3, 3);
        seriesTwo.add(4, 7);
        mDataset.addSeries(seriesTwo);

        XYMultipleSeriesRenderer mRenderer = new XYMultipleSeriesRenderer();
        // 设置视图表的x轴的当前方向
        mRenderer.setOrientation(XYMultipleSeriesRenderer.Orientation.HORIZONTAL);
        mRenderer.setXTitle("日期");  // 设置X轴的标题
        mRenderer.setYTitle("价格");  // 设置Y轴的标题
        mRenderer.setAxisTitleTextSize(40);  // 设置轴标题文字大小
        mRenderer.setChartTitle("价格走势图");  // 设置图标标题
        mRenderer.setChartTitleTextSize(60);  // 设置图标标题文字大小

        mRenderer.setLabelsTextSize(36);   // 设置标签文字的大小
        mRenderer.setLegendTextSize(40);   // 设置图例文字大小

        mRenderer.setPointSize(20f);   // 设置点的大小
        mRenderer.setYAxisMin(0);  // 设置Y轴起点
        mRenderer.setYAxisMax(30);
        mRenderer.setYLabels(10);  // 设置Y轴刻度个数
        mRenderer.setXAxisMax(5);
        mRenderer.setShowGrid(true);  // 显示网格
        // 将x标签栏目显示如：1，2，3替换为显示1月，2月，3月，4月
        mRenderer.addXTextLabel(1, "1月");
        mRenderer.addXTextLabel(2, "2月");
        mRenderer.addXTextLabel(3, "3月");
        mRenderer.addXTextLabel(4, "4月");
        mRenderer.setXLabels(0);  // 设置只显示如1月，2月等替换后的内容，不显示1，2，3等
        mRenderer.setMargins(new int[]{100, 120, 120, 90});  // 设置视图位置上下左右

        XYSeriesRenderer r = new XYSeriesRenderer();  // 类似于一条线对象
        r.setColor(Color.BLUE);
        r.setPointStyle(PointStyle.CIRCLE); // 设置点的样式
        r.setFillPoints(true);  // 填充点（显示的点是空心还是实心）
        r.setDisplayChartValues(true);  // 将点的值显示出来
        r.setChartValuesSpacing(20);  // 显示点的值与图的距离
        r.setChartValuesTextSize(50);  // 设置点的文字的大小

//        r.setFillBelowLine(true);  // 是否填充折线图的下方
//        r.setFillBelowLineColor(Color.GREEN);  // 设置填充的颜色，如果不设置就默认与线的颜色一致
        r.setLineWidth(6);  // 设置线宽
        mRenderer.addSeriesRenderer(r);

        XYSeriesRenderer rTwo = new XYSeriesRenderer();  // 类似与一条线对象
        rTwo.setColor(Color.GRAY);
        rTwo.setPointStyle(PointStyle.CIRCLE);  // 设置点的样式
        rTwo.setFillPoints(true);  // 填充点（显示是空心还是实心）
        rTwo.setDisplayChartValues(true);  // 将点的值显示出来
        rTwo.setChartValuesSpacing(20);  // 现实的点的值与图的距离
        rTwo.setChartValuesTextSize(50);  // 点的文字的大小

//        rTwo.setFillBelowLine(true);
//        rTwo.setFillBelowLineColor(Color.GREEN);
        rTwo.setLineWidth(6);

        mRenderer.addSeriesRenderer(rTwo);

        GraphicalView view = ChartFactory.getLineChartView(this, mDataset, mRenderer);
        view.setBackgroundColor(Color.BLACK);
        setContentView(view);
    }
}
