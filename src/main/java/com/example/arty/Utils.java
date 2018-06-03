package com.example.arty;

import org.joda.time.DateTime;

import java.util.Locale;

class Utils {
    String getCurrentTime(){
        return new DateTime().toString("yyyy-MM-dd HH:mm:ss",Locale.CHINESE);
    }
}
