package com.example.android.whowriteapp;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mBookInput;
    TextView mTitleText, mAuthorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBookInput=(EditText) findViewById(R.id.bookInput);
        mTitleText=(TextView) findViewById(R.id.authorText);
        mAuthorText=(TextView) findViewById(R.id.titleText);
    }

    public searchBook(View view){
        String queryString = mBookInput.getText().toString();
    }
}
