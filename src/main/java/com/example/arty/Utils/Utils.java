package com.example.arty.Utils;

import org.joda.time.DateTime;

import java.util.Locale;

public class Utils {
    public String getCurrentTime(){
        return new DateTime().toString("yyyy-MM-dd HH:mm:ss",Locale.CHINESE);
    }
}
