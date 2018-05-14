package com.qwet.gaomao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.qwet.gaomao.Fragment.SelfCenterFragment;

public class MainActivity extends AppCompatActivity {

    private FrameLayout mFrameLayout;
    private TextView self_center;
    private SelfCenterFragment mSelfCenterFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFBC();
        initFragment();
//        showFrament();
        intClick();
    }

    private void intClick() {
        self_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFrament();
            }
        });
    }

    private void showFrament() {
        getSupportFragmentManager().beginTransaction().replace(R.id.home_fl,mSelfCenterFragment).commit();
    }

    private void initFragment() {
        mSelfCenterFragment = new SelfCenterFragment();
    }

    private void initFBC() {
        mFrameLayout = (FrameLayout) findViewById(R.id.home_fl);
        self_center = (TextView) findViewById(R.id.self_center);
    }


}
