package com.teducn.cn.weatherforecast.entity;

import java.util.List;

/**
 * Created by pjy on 2017/7/25.
 * 在as中可以集成一个GsonFormat框架
 * 使用该框架可以通过json字符串快速封装实体类
 */

public class WeatherBean {


    /**
     * reason : 查询成功!
     * result : {"data":{"realtime":{"city_code":"101010100","city_name":"北京","date":"2017-07-25","time":"09:00:00","week":2,"moon":"六月初三","dataUptime":1500946501,"weather":{"temperature":"28","humidity":"68","info":"多云","img":"1"},"wind":{"direct":"南风","power":"2级","offset":null,"windspeed":null}},"life":{"date":"2017-7-25","info":{"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"],"ganmao":["少发","各项气象条件适宜，无明显降温过程，发生感冒机率较低。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行低强度运动；若坚持户外运动，须注意选择避雨防滑并携带雨具。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}},"weather":[{"date":"2017-07-25","info":{"day":["3","阵雨","30","南风","微风","05:08","出门记得带伞，行走驾驶做好防滑准备"],"night":["2","阴","22","北风","微风","19:34","出门记得带伞，行走驾驶做好防滑准备"]},"week":"二","nongli":"闰六月初三"},{"date":"2017-07-26","info":{"dawn":["2","阴","22","北风","微风","19:34"],"day":["8","中雨","24","南风","微风","05:09","出门记得带伞，行走驾驶做好防滑准备"],"night":["3","阵雨","20","北风","微风","19:33","出门记得带伞，行走驾驶做好防滑准备"]},"week":"三","nongli":"闰六月初四"},{"date":"2017-07-27","info":{"dawn":["3","阵雨","20","北风","微风","19:33"],"day":["2","阴","27","南风","微风","05:10"],"night":["1","多云","22","北风","微风","19:32"]},"week":"四","nongli":"闰六月初五"},{"date":"2017-07-28","info":{"dawn":["1","多云","22","北风","微风","19:32"],"day":["4","雷阵雨","28","南风","微风","05:11"],"night":["2","阴","22","北风","微风","19:31"]},"week":"五","nongli":"闰六月初六"},{"date":"2017-07-29","info":{"dawn":["2","阴","22","北风","微风","19:31"],"day":["1","多云","29","南风","微风","05:11"],"night":["1","多云","21","北风","微风","19:30"]},"week":"六","nongli":"闰六月初七"},{"date":"2017-07-30","info":{"night":["0","晴","21","","微风","19:30"],"day":["0","晴","31","","微风","07:30"]},"week":"日","nongli":"闰六月初八"},{"date":"2017-07-31","info":{"night":["0","晴","22","东南风","微风","19:30"],"day":["0","晴","32","东南风","微风","07:30"]},"week":"一","nongli":"闰六月初九"}],"f3h":{"temperature":[{"jg":"20170725080000","jb":"28"},{"jg":"20170725110000","jb":"23"},{"jg":"20170725140000","jb":"28"},{"jg":"20170725170000","jb":"28"},{"jg":"20170725200000","jb":"28"},{"jg":"20170725230000","jb":"28"},{"jg":"20170726020000","jb":"26"},{"jg":"20170726050000","jb":"25"},{"jg":"20170726080000","jb":"22"}],"precipitation":[{"jg":"20170725080000","jf":"0.1"},{"jg":"20170725110000","jf":"1.6"},{"jg":"20170725140000","jf":"1.6"},{"jg":"20170725170000","jf":"0"},{"jg":"20170725200000","jf":"0"},{"jg":"20170725230000","jf":"0"},{"jg":"20170726020000","jf":"0"},{"jg":"20170726050000","jf":"0"},{"jg":"20170726080000","jf":"0"}]},"pm25":{"key":"Beijing","show_desc":0,"pm25":{"curPm":"48","pm25":"22","pm10":"51","level":1,"quality":"优","des":"空气很好，可以外出活动"},"dateTime":"2017年07月25日09时","cityName":"北京"},"jingqu":"","jingqutq":"","date":"","isForeign":"0"}}
     * error_code : 0
     */

    private String reason;
    private Result result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class Result {
        /**
         * data : {"realtime":{"city_code":"101010100","city_name":"北京","date":"2017-07-25","time":"09:00:00","week":2,"moon":"六月初三","dataUptime":1500946501,"weather":{"temperature":"28","humidity":"68","info":"多云","img":"1"},"wind":{"direct":"南风","power":"2级","offset":null,"windspeed":null}},"life":{"date":"2017-7-25","info":{"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"],"ganmao":["少发","各项气象条件适宜，无明显降温过程，发生感冒机率较低。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行低强度运动；若坚持户外运动，须注意选择避雨防滑并携带雨具。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}},"weather":[{"date":"2017-07-25","info":{"day":["3","阵雨","30","南风","微风","05:08","出门记得带伞，行走驾驶做好防滑准备"],"night":["2","阴","22","北风","微风","19:34","出门记得带伞，行走驾驶做好防滑准备"]},"week":"二","nongli":"闰六月初三"},{"date":"2017-07-26","info":{"dawn":["2","阴","22","北风","微风","19:34"],"day":["8","中雨","24","南风","微风","05:09","出门记得带伞，行走驾驶做好防滑准备"],"night":["3","阵雨","20","北风","微风","19:33","出门记得带伞，行走驾驶做好防滑准备"]},"week":"三","nongli":"闰六月初四"},{"date":"2017-07-27","info":{"dawn":["3","阵雨","20","北风","微风","19:33"],"day":["2","阴","27","南风","微风","05:10"],"night":["1","多云","22","北风","微风","19:32"]},"week":"四","nongli":"闰六月初五"},{"date":"2017-07-28","info":{"dawn":["1","多云","22","北风","微风","19:32"],"day":["4","雷阵雨","28","南风","微风","05:11"],"night":["2","阴","22","北风","微风","19:31"]},"week":"五","nongli":"闰六月初六"},{"date":"2017-07-29","info":{"dawn":["2","阴","22","北风","微风","19:31"],"day":["1","多云","29","南风","微风","05:11"],"night":["1","多云","21","北风","微风","19:30"]},"week":"六","nongli":"闰六月初七"},{"date":"2017-07-30","info":{"night":["0","晴","21","","微风","19:30"],"day":["0","晴","31","","微风","07:30"]},"week":"日","nongli":"闰六月初八"},{"date":"2017-07-31","info":{"night":["0","晴","22","东南风","微风","19:30"],"day":["0","晴","32","东南风","微风","07:30"]},"week":"一","nongli":"闰六月初九"}],"f3h":{"temperature":[{"jg":"20170725080000","jb":"28"},{"jg":"20170725110000","jb":"23"},{"jg":"20170725140000","jb":"28"},{"jg":"20170725170000","jb":"28"},{"jg":"20170725200000","jb":"28"},{"jg":"20170725230000","jb":"28"},{"jg":"20170726020000","jb":"26"},{"jg":"20170726050000","jb":"25"},{"jg":"20170726080000","jb":"22"}],"precipitation":[{"jg":"20170725080000","jf":"0.1"},{"jg":"20170725110000","jf":"1.6"},{"jg":"20170725140000","jf":"1.6"},{"jg":"20170725170000","jf":"0"},{"jg":"20170725200000","jf":"0"},{"jg":"20170725230000","jf":"0"},{"jg":"20170726020000","jf":"0"},{"jg":"20170726050000","jf":"0"},{"jg":"20170726080000","jf":"0"}]},"pm25":{"key":"Beijing","show_desc":0,"pm25":{"curPm":"48","pm25":"22","pm10":"51","level":1,"quality":"优","des":"空气很好，可以外出活动"},"dateTime":"2017年07月25日09时","cityName":"北京"},"jingqu":"","jingqutq":"","date":"","isForeign":"0"}
         */

        private Data data;

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        public static class Data {
            /**
             * realtime : {"city_code":"101010100","city_name":"北京","date":"2017-07-25","time":"09:00:00","week":2,"moon":"六月初三","dataUptime":1500946501,"weather":{"temperature":"28","humidity":"68","info":"多云","img":"1"},"wind":{"direct":"南风","power":"2级","offset":null,"windspeed":null}}
             * life : {"date":"2017-7-25","info":{"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"],"ganmao":["少发","各项气象条件适宜，无明显降温过程，发生感冒机率较低。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行低强度运动；若坚持户外运动，须注意选择避雨防滑并携带雨具。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}}
             * weather : [{"date":"2017-07-25","info":{"day":["3","阵雨","30","南风","微风","05:08","出门记得带伞，行走驾驶做好防滑准备"],"night":["2","阴","22","北风","微风","19:34","出门记得带伞，行走驾驶做好防滑准备"]},"week":"二","nongli":"闰六月初三"},{"date":"2017-07-26","info":{"dawn":["2","阴","22","北风","微风","19:34"],"day":["8","中雨","24","南风","微风","05:09","出门记得带伞，行走驾驶做好防滑准备"],"night":["3","阵雨","20","北风","微风","19:33","出门记得带伞，行走驾驶做好防滑准备"]},"week":"三","nongli":"闰六月初四"},{"date":"2017-07-27","info":{"dawn":["3","阵雨","20","北风","微风","19:33"],"day":["2","阴","27","南风","微风","05:10"],"night":["1","多云","22","北风","微风","19:32"]},"week":"四","nongli":"闰六月初五"},{"date":"2017-07-28","info":{"dawn":["1","多云","22","北风","微风","19:32"],"day":["4","雷阵雨","28","南风","微风","05:11"],"night":["2","阴","22","北风","微风","19:31"]},"week":"五","nongli":"闰六月初六"},{"date":"2017-07-29","info":{"dawn":["2","阴","22","北风","微风","19:31"],"day":["1","多云","29","南风","微风","05:11"],"night":["1","多云","21","北风","微风","19:30"]},"week":"六","nongli":"闰六月初七"},{"date":"2017-07-30","info":{"night":["0","晴","21","","微风","19:30"],"day":["0","晴","31","","微风","07:30"]},"week":"日","nongli":"闰六月初八"},{"date":"2017-07-31","info":{"night":["0","晴","22","东南风","微风","19:30"],"day":["0","晴","32","东南风","微风","07:30"]},"week":"一","nongli":"闰六月初九"}]
             * f3h : {"temperature":[{"jg":"20170725080000","jb":"28"},{"jg":"20170725110000","jb":"23"},{"jg":"20170725140000","jb":"28"},{"jg":"20170725170000","jb":"28"},{"jg":"20170725200000","jb":"28"},{"jg":"20170725230000","jb":"28"},{"jg":"20170726020000","jb":"26"},{"jg":"20170726050000","jb":"25"},{"jg":"20170726080000","jb":"22"}],"precipitation":[{"jg":"20170725080000","jf":"0.1"},{"jg":"20170725110000","jf":"1.6"},{"jg":"20170725140000","jf":"1.6"},{"jg":"20170725170000","jf":"0"},{"jg":"20170725200000","jf":"0"},{"jg":"20170725230000","jf":"0"},{"jg":"20170726020000","jf":"0"},{"jg":"20170726050000","jf":"0"},{"jg":"20170726080000","jf":"0"}]}
             * pm25 : {"key":"Beijing","show_desc":0,"pm25":{"curPm":"48","pm25":"22","pm10":"51","level":1,"quality":"优","des":"空气很好，可以外出活动"},"dateTime":"2017年07月25日09时","cityName":"北京"}
             * jingqu :
             * jingqutq :
             * date :
             * isForeign : 0
             */

            private Realtime realtime;
            private Life life;
            private F3h f3h;
            private Pm25X pm25;
            private String jingqu;
            private String jingqutq;
            private String date;
            private String isForeign;
            private List<WeatherX> weather;

            public Realtime getRealtime() {
                return realtime;
            }

            public void setRealtime(Realtime realtime) {
                this.realtime = realtime;
            }

            public Life getLife() {
                return life;
            }

            public void setLife(Life life) {
                this.life = life;
            }

            public F3h getF3h() {
                return f3h;
            }

            public void setF3h(F3h f3h) {
                this.f3h = f3h;
            }

            public Pm25X getPm25() {
                return pm25;
            }

            public void setPm25(Pm25X pm25) {
                this.pm25 = pm25;
            }

            public String getJingqu() {
                return jingqu;
            }

            public void setJingqu(String jingqu) {
                this.jingqu = jingqu;
            }

            public String getJingqutq() {
                return jingqutq;
            }

            public void setJingqutq(String jingqutq) {
                this.jingqutq = jingqutq;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getIsForeign() {
                return isForeign;
            }

            public void setIsForeign(String isForeign) {
                this.isForeign = isForeign;
            }

            public List<WeatherX> getWeather() {
                return weather;
            }

            public void setWeather(List<WeatherX> weather) {
                this.weather = weather;
            }

            public static class Realtime {
                /**
                 * city_code : 101010100
                 * city_name : 北京
                 * date : 2017-07-25
                 * time : 09:00:00
                 * week : 2
                 * moon : 六月初三
                 * dataUptime : 1500946501
                 * weather : {"temperature":"28","humidity":"68","info":"多云","img":"1"}
                 * wind : {"direct":"南风","power":"2级","offset":null,"windspeed":null}
                 */

                private String city_code;
                private String city_name;
                private String date;
                private String time;
                private int week;
                private String moon;
                private int dataUptime;
                private Weather weather;
                private Wind wind;

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public int getWeek() {
                    return week;
                }

                public void setWeek(int week) {
                    this.week = week;
                }

                public String getMoon() {
                    return moon;
                }

                public void setMoon(String moon) {
                    this.moon = moon;
                }

                public int getDataUptime() {
                    return dataUptime;
                }

                public void setDataUptime(int dataUptime) {
                    this.dataUptime = dataUptime;
                }

                public Weather getWeather() {
                    return weather;
                }

                public void setWeather(Weather weather) {
                    this.weather = weather;
                }

                public Wind getWind() {
                    return wind;
                }

                public void setWind(Wind wind) {
                    this.wind = wind;
                }

                public static class Weather {
                    /**
                     * temperature : 28
                     * humidity : 68
                     * info : 多云
                     * img : 1
                     */

                    private String temperature;
                    private String humidity;
                    private String info;
                    private String img;

                    public String getTemperature() {
                        return temperature;
                    }

                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }

                    public String getHumidity() {
                        return humidity;
                    }

                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }

                    public String getInfo() {
                        return info;
                    }

                    public void setInfo(String info) {
                        this.info = info;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }
                }

                public static class Wind {
                    /**
                     * direct : 南风
                     * power : 2级
                     * offset : null
                     * windspeed : null
                     */

                    private String direct;
                    private String power;
                    private Object offset;
                    private Object windspeed;

                    public String getDirect() {
                        return direct;
                    }

                    public void setDirect(String direct) {
                        this.direct = direct;
                    }

                    public String getPower() {
                        return power;
                    }

                    public void setPower(String power) {
                        this.power = power;
                    }

                    public Object getOffset() {
                        return offset;
                    }

                    public void setOffset(Object offset) {
                        this.offset = offset;
                    }

                    public Object getWindspeed() {
                        return windspeed;
                    }

                    public void setWindspeed(Object windspeed) {
                        this.windspeed = windspeed;
                    }
                }
            }

            public static class Life {
                /**
                 * date : 2017-7-25
                 * info : {"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"],"ganmao":["少发","各项气象条件适宜，无明显降温过程，发生感冒机率较低。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行低强度运动；若坚持户外运动，须注意选择避雨防滑并携带雨具。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}
                 */

                private String date;
                private Info info;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public Info getInfo() {
                    return info;
                }

                public void setInfo(Info info) {
                    this.info = info;
                }

                public static class Info {
                    private List<String> chuanyi;
                    private List<String> ganmao;
                    private List<String> kongtiao;
                    private List<String> xiche;
                    private List<String> yundong;
                    private List<String> ziwaixian;

                    public List<String> getChuanyi() {
                        return chuanyi;
                    }

                    public void setChuanyi(List<String> chuanyi) {
                        this.chuanyi = chuanyi;
                    }

                    public List<String> getGanmao() {
                        return ganmao;
                    }

                    public void setGanmao(List<String> ganmao) {
                        this.ganmao = ganmao;
                    }

                    public List<String> getKongtiao() {
                        return kongtiao;
                    }

                    public void setKongtiao(List<String> kongtiao) {
                        this.kongtiao = kongtiao;
                    }

                    public List<String> getXiche() {
                        return xiche;
                    }

                    public void setXiche(List<String> xiche) {
                        this.xiche = xiche;
                    }

                    public List<String> getYundong() {
                        return yundong;
                    }

                    public void setYundong(List<String> yundong) {
                        this.yundong = yundong;
                    }

                    public List<String> getZiwaixian() {
                        return ziwaixian;
                    }

                    public void setZiwaixian(List<String> ziwaixian) {
                        this.ziwaixian = ziwaixian;
                    }
                }
            }

            public static class F3h {
                private List<Temperature> temperature;
                private List<Precipitation> precipitation;

                public List<Temperature> getTemperature() {
                    return temperature;
                }

                public void setTemperature(List<Temperature> temperature) {
                    this.temperature = temperature;
                }

                public List<Precipitation> getPrecipitation() {
                    return precipitation;
                }

                public void setPrecipitation(List<Precipitation> precipitation) {
                    this.precipitation = precipitation;
                }

                public static class Temperature {
                    /**
                     * jg : 20170725080000
                     * jb : 28
                     */

                    private String jg;
                    private String jb;

                    public String getJg() {
                        return jg;
                    }

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public String getJb() {
                        return jb;
                    }

                    public void setJb(String jb) {
                        this.jb = jb;
                    }
                }

                public static class Precipitation {
                    /**
                     * jg : 20170725080000
                     * jf : 0.1
                     */

                    private String jg;
                    private String jf;

                    public String getJg() {
                        return jg;
                    }

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public String getJf() {
                        return jf;
                    }

                    public void setJf(String jf) {
                        this.jf = jf;
                    }
                }
            }

            public static class Pm25X {
                /**
                 * key : Beijing
                 * show_desc : 0
                 * pm25 : {"curPm":"48","pm25":"22","pm10":"51","level":1,"quality":"优","des":"空气很好，可以外出活动"}
                 * dateTime : 2017年07月25日09时
                 * cityName : 北京
                 */

                private String key;
                private int show_desc;
                private Pm25 pm25;
                private String dateTime;
                private String cityName;

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public int getShow_desc() {
                    return show_desc;
                }

                public void setShow_desc(int show_desc) {
                    this.show_desc = show_desc;
                }

                public Pm25 getPm25() {
                    return pm25;
                }

                public void setPm25(Pm25 pm25) {
                    this.pm25 = pm25;
                }

                public String getDateTime() {
                    return dateTime;
                }

                public void setDateTime(String dateTime) {
                    this.dateTime = dateTime;
                }

                public String getCityName() {
                    return cityName;
                }

                public void setCityName(String cityName) {
                    this.cityName = cityName;
                }

                public static class Pm25 {
                    /**
                     * curPm : 48
                     * pm25 : 22
                     * pm10 : 51
                     * level : 1
                     * quality : 优
                     * des : 空气很好，可以外出活动
                     */

                    private String curPm;
                    private String pm25;
                    private String pm10;
                    private int level;
                    private String quality;
                    private String des;

                    public String getCurPm() {
                        return curPm;
                    }

                    public void setCurPm(String curPm) {
                        this.curPm = curPm;
                    }

                    public String getPm25() {
                        return pm25;
                    }

                    public void setPm25(String pm25) {
                        this.pm25 = pm25;
                    }

                    public String getPm10() {
                        return pm10;
                    }

                    public void setPm10(String pm10) {
                        this.pm10 = pm10;
                    }

                    public int getLevel() {
                        return level;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public String getQuality() {
                        return quality;
                    }

                    public void setQuality(String quality) {
                        this.quality = quality;
                    }

                    public String getDes() {
                        return des;
                    }

                    public void setDes(String des) {
                        this.des = des;
                    }
                }
            }

            public static class WeatherX {
                /**
                 * date : 2017-07-25
                 * info : {"day":["3","阵雨","30","南风","微风","05:08","出门记得带伞，行走驾驶做好防滑准备"],"night":["2","阴","22","北风","微风","19:34","出门记得带伞，行走驾驶做好防滑准备"]}
                 * week : 二
                 * nongli : 闰六月初三
                 */

                private String date;
                private InfoX info;
                private String week;
                private String nongli;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoX getInfo() {
                    return info;
                }

                public void setInfo(InfoX info) {
                    this.info = info;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getNongli() {
                    return nongli;
                }

                public void setNongli(String nongli) {
                    this.nongli = nongli;
                }

                public static class InfoX {
                    private List<String> day;
                    private List<String> night;

                    public List<String> getDay() {
                        return day;
                    }

                    public void setDay(List<String> day) {
                        this.day = day;
                    }

                    public List<String> getNight() {
                        return night;
                    }

                    public void setNight(List<String> night) {
                        this.night = night;
                    }
                }
            }
        }
    }
}
