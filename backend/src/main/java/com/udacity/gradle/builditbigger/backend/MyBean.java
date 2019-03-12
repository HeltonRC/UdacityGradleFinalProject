package com.udacity.gradle.builditbigger.backend;

import com.udacity.hrcosta.libjokes.MyJokesClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private MyJokesClass jokesClass;

    public MyBean() {
        jokesClass = MyJokesClass.create();
    }

    public String getData() {
        return jokesClass.getJoke();
    }

//    public void setData(String data) {
//        myData = data;
//    }
}
