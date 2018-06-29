package com.qwet.gaomao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.qwet.gaomao.EventBus.SelfCenterEvent;
import com.qwet.gaomao.Fragment.SelfCenterFragment;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

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
        EventBus.getDefault().register(this);
    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void changetest(SelfCenterEvent event){
        String message = event.getMessage();
        self_center.setText(message);
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }
}
