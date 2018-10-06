package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;

    @SerializedName("cond")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;

    }

    public class More{
        @SerializedName("text_d")
        public String info;
    }


}
