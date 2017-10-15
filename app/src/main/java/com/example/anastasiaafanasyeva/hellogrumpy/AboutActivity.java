package com.example.anastasiaafanasyeva.hellogrumpy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by Anastasia Afanasyeva on 09-Oct-17.
 */

public class AboutActivity extends Activity{

    private TextView mHelloTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);

        mHelloTextView = (TextView)findViewById(R.id.textAbout);
        mHelloTextView.setText(R.string.about_text);
    }


}
