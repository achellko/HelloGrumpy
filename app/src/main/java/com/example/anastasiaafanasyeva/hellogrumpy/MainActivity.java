package com.example.anastasiaafanasyeva.hellogrumpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHelloTextView = (TextView)findViewById(R.id.textView);
        mNameEditText = (EditText) findViewById(R.id.editText2);
    }

    public void onClick(View view) {
        if(mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Hello Grumpy!");
        } else {
            mHelloTextView.setText("Hello, " + mNameEditText.getText());
        }
    }

    public void onClickAbout (View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}
