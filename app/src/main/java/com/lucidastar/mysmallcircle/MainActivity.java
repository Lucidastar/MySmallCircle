package com.lucidastar.mysmallcircle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.internal.DebouncingOnClickListener;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_test)
    TextView mTvTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_test)
    private void test(){
        mTvTest.setOnClickListener(new DebouncingOnClickListener() {
            @Override
            public void doClick(View v) {

            }
        });
    }
}
