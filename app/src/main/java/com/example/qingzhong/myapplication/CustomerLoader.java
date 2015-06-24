package com.example.qingzhong.myapplication;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by qingzhong on 8/4/15.
 */
public class CustomerLoader extends AsyncTaskLoader<ArrayList<String>> {


    public CustomerLoader(Context context){

        super(context);

    }

    @Override
    public ArrayList<String> loadInBackground() {
        return null;
    }
}
