package com.atilsamancioglu.parselearning;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //set log level
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("5gRrDiD1DT34BDjhW3tJbHuHQN8uMT62fBdh9cPv")
                .clientKey("XS0B1o20ZtDMvpJSt8BSQxmryHLr8w9eu2VEZ7Ly")
                .server("https://parseapi.back4app.com/")
                .build()
        );


    }
}
