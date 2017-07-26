package com.teducn.cn.weatherforecast.http;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.teducn.cn.weatherforecast.constant.IURL;
import com.teducn.cn.weatherforecast.entity.WeatherBean;

/**
 * Created by pjy on 2017/7/25.
 */

public class HttpWeatherManager {
    // 获得请求队列
    public static RequestQueue queue = null;

    /**
     * @param context
     * @param cityName 城市名称
     */
    public static void loadWeather(Context context, String cityName, final WeatherLoadListener listener) {
        if (queue == null) {
            queue = Volley.newRequestQueue(context);
        }
        try {
//            cityName = URLEncoder.encode(cityName, "utf-8");
//            String url = IURL.WEATHERURL + cityName + IURL.APPKEY;
            String url = IURL.LOACALWEATHER;
            Log.i("TAG:", url);
            StringRequest request = new StringRequest(url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.i("TAG:", response);
                    Gson gson = new Gson();
                    WeatherBean weatherBean = gson.fromJson(response, WeatherBean.class);
                    listener.onWeathersLoadEnd(weatherBean);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.i("TAG:error", error + "");
                }
            });
            queue.add(request);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public interface WeatherLoadListener {
        void onWeathersLoadEnd(WeatherBean weatherBean);
    }
}
