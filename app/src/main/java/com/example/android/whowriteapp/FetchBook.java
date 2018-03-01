package com.example.android.whowriteapp;


import android.os.AsyncTask;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Neng Lisda Yuni S on 11/6/2017.
 */

public class FetchBook extends AsyncTask<String, Void, String>{
    private TextView mTitleText;
    private TextView mAuthorText;

    public FetchBook(TextView mTitleText, TextView mAuthorText){
        this.mTitleText = mTitleText;
        this.mAuthorText = mAuthorText;
    }


    @Override
    protected String doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onPostExecute(String s){
        super.onPostExecute(s);
    }
}
