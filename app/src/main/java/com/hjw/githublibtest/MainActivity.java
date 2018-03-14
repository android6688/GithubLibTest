package com.hjw.githublibtest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hjw.githublibrary.AActivity;
import com.hjw.githublibrary.Utils;


public class MainActivity extends Activity {
    Context mContext;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        ((TextView) findViewById(R.id.tv)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (index > 1) {
                    index = 0;
                }
                if (index == 0) {
                    Intent intent = new Intent(mContext, AActivity.class);
                    startActivity(intent);
                } else if (index == 1) {
                    Utils.showToast(getApplicationContext());
                }
                index++;
            }
        });
    }
}
