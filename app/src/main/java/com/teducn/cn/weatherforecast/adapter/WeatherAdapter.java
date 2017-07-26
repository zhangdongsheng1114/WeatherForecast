package com.teducn.cn.weatherforecast.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.teducn.cn.weatherforecast.R;
import com.teducn.cn.weatherforecast.entity.WeatherBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarena on 2017/7/25.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    private List<WeatherBean.Result.Data.WeatherX> weathers = new ArrayList<>();
    private Context context;
    LayoutInflater inflater = null;

    public WeatherAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void addWeathers(List<WeatherBean.Result.Data.WeatherX> weatherXList, boolean isClear) {
        if (isClear) {
            this.weathers.clear();
        }
        if (weatherXList != null) {
            this.weathers.addAll(0, weatherXList);
            this.notifyDataSetChanged();
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.weather_item_layout, parent, false);
        ViewHolder holder = new ViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        WeatherBean.Result.Data.WeatherX weatherX = weathers.get(position);
        String condition = weatherX.getInfo().getDay().get(0);
        if ("0".equals(condition)) {
            holder.imageView_Condition.setImageResource(R.drawable.sunny);
        } else if ("1".equals(condition)) {
            holder.imageView_Condition.setImageResource(R.drawable.cloudy);
        } else if ("2".equals(condition)) {
            holder.imageView_Condition.setImageResource(R.drawable.lotcloudy);
        } else if ("3".equals(condition)) {
            holder.imageView_Condition.setImageResource(R.drawable.rain);
        } else {
            holder.imageView_Condition.setImageResource(R.drawable.lotcloudy);
        }

        holder.textView_Condition.setText(weatherX.getInfo().getDay().get(1));

        String day = weatherX.getInfo().getDay().get(2);
        String night = weatherX.getInfo().getNight().get(2);
        holder.textView_Temperature.setText(day + "℃" + "/" + night + "℃");
        holder.textView_Week.setText(weatherX.getWeek());
    }

    @Override
    public int getItemCount() {
        return weathers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView_Condition;
        TextView textView_Condition;
        TextView textView_Temperature;
        TextView textView_Week;
        View weatherItem;

        public ViewHolder(View itemView) {
            super(itemView);
            this.weatherItem = itemView;
            imageView_Condition = (ImageView) itemView.findViewById(R.id.imageView_Weather_Condition);
            textView_Condition = (TextView) itemView.findViewById(R.id.textView_Weather_Condition);
            textView_Temperature = (TextView) itemView.findViewById(R.id.textView_Weather_Temp);
            textView_Week = (TextView) itemView.findViewById(R.id.textView_Weather_Week);
        }
    }
}
