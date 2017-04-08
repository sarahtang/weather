package com.example.sarahtang.elementweatherapp;

import android.graphics.Color;
import static android.view.View.INVISIBLE;
import static com.example.sarahtang.elementweatherapp.MainActivity.cloudFogView;
import static com.example.sarahtang.elementweatherapp.MainActivity.cloudHvRainView;
import static com.example.sarahtang.elementweatherapp.MainActivity.cloudMoonView;
import static com.example.sarahtang.elementweatherapp.MainActivity.cloudRainView;
import static com.example.sarahtang.elementweatherapp.MainActivity.cloudSnowView;
import static com.example.sarahtang.elementweatherapp.MainActivity.cloudSunView;
import static com.example.sarahtang.elementweatherapp.MainActivity.cloudThunderView;
import static com.example.sarahtang.elementweatherapp.MainActivity.cloudView;
import static com.example.sarahtang.elementweatherapp.MainActivity.moonView;
import static com.example.sarahtang.elementweatherapp.MainActivity.sunView;
import static com.example.sarahtang.elementweatherapp.MainActivity.windView;

/**
 * Created by sarahtang on 3/7/17.
 */

public class Utils {

    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    public static void iconInvisible() {
        //OG = set at invisible
        cloudFogView.setVisibility(INVISIBLE);
        cloudHvRainView.setVisibility(INVISIBLE);
        cloudMoonView.setVisibility(INVISIBLE);
        cloudRainView.setVisibility(INVISIBLE);
        cloudSnowView.setVisibility(INVISIBLE);
        cloudSunView.setVisibility(INVISIBLE);
        cloudThunderView.setVisibility(INVISIBLE);
        cloudView.setVisibility(INVISIBLE);
        moonView.setVisibility(INVISIBLE);
        sunView.setVisibility(INVISIBLE);
        windView.setVisibility(INVISIBLE);
    }

    public static void iconTransparentBG() {
        sunView.setBgColor(Color.TRANSPARENT);
        moonView.setBgColor(Color.TRANSPARENT);
        cloudRainView.setBgColor(Color.TRANSPARENT);
        cloudSnowView.setBgColor(Color.TRANSPARENT);
        cloudHvRainView.setBgColor(Color.TRANSPARENT);
        windView.setBgColor(Color.TRANSPARENT);
        cloudView.setBgColor(Color.TRANSPARENT);
        cloudSunView.setBgColor(Color.TRANSPARENT);
        cloudMoonView.setBgColor(Color.TRANSPARENT);
        cloudSnowView.setBgColor(Color.TRANSPARENT);
        cloudThunderView.setBgColor(Color.TRANSPARENT);
        windView.setBgColor(Color.TRANSPARENT);
        cloudFogView.setBgColor(Color.TRANSPARENT);
    }


}

