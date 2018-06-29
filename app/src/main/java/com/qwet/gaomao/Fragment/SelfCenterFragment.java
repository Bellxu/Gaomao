package com.qwet.gaomao.Fragment;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.qwet.gaomao.Bean.LogonOnBean;
import com.qwet.gaomao.Bean.verificationCodeBean;
import com.qwet.gaomao.Constants;
import com.qwet.gaomao.EventBus.SelfCenterEvent;
import com.qwet.gaomao.GaoMaoService;
import com.qwet.gaomao.R;
import com.qwet.gaomao.logOnUser;

import org.greenrobot.eventbus.EventBus;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xu on 2018/5/12.
 */

public class SelfCenterFragment extends Fragment {

    private Button get_verification;
    //注册
    private Button logon_on;
    //登陆
    private Button logon_in;
    private EditText phone_number;
    private EditText verify_code;
    private EditText user_name;
    private EditText password;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.selfcenter_fragment, container, false);
        initFBC(view);
        initClick();
        return view;
    }

    private void initClick() {
        setGet_verificationClick();
        setLogOnClick();
        setLogInClick();
    }

    private void setLogInClick() {
        logon_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post(new SelfCenterEvent("我的"));
            }
        });
    }

    private void setLogOnClick() {
        logon_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String userName = user_name.getText().toString().trim();
                final String passWord = password.getText().toString().trim();
                final String phoneUumber = phone_number.getText().toString().trim();
                final String verifyCode = verify_code.getText().toString().trim();
                if (userName.isEmpty()) {
                    Toast.makeText(getContext(), "用户名", Toast.LENGTH_SHORT).show();
                }
                if (passWord.isEmpty()) {
                    Toast.makeText(getContext(), "密码为空", Toast.LENGTH_SHORT).show();
                }
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        if (!userName.isEmpty() && !passWord.isEmpty()&&!phoneUumber.isEmpty()&&!verifyCode.isEmpty()) {
                            logOnUser logOnUser = new logOnUser();
                            logOnUser.setName(userName);
                            logOnUser.setPassword(passWord);
                            logOnUser.setPhoneNum(phoneUumber);
                            logOnUser.setVerifyCode(verifyCode);
                            Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
                            GaoMaoService service = retrofit.create(GaoMaoService.class);
                            service.logonOn(logOnUser).enqueue(new Callback<LogonOnBean>() {
                                @Override
                                public void onResponse(Call<LogonOnBean> call, Response<LogonOnBean> response) {
                                    int code = response.body().getCode();
                                    String message = response.body().getMessage();
                                    Toast.makeText(getContext(), "code==" + code + "message==" + message, Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onFailure(Call<LogonOnBean> call, Throwable t) {

                                }
                            });
                        }
                    }
                }).start();

            }
        });
    }

    private void setGet_verificationClick() {
        get_verification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String phoneNumber = phone_number.getText().toString().trim();
                if (phoneNumber.isEmpty()) {
                    Toast.makeText(getContext(), "手机为空", Toast.LENGTH_SHORT).show();
                }else {
                startCountDown();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

                        GaoMaoService service = retrofit.create(GaoMaoService.class);
                        if (!phoneNumber.isEmpty()) {
                            Call<verificationCodeBean> call = service.getVerificationCodeBean(phoneNumber);
                            call.enqueue(new Callback<verificationCodeBean>() {
                                @Override
                                public void onResponse(Call<verificationCodeBean> call, Response<verificationCodeBean> response) {
                                    if (response.body().getSendSmsResponse() != null) {
                                        String message = response.body().getSendSmsResponse().getMessage();
                                        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
                                    } else {
                                        String warning = response.body().getWarning();
                                        Toast.makeText(getContext(), warning, Toast.LENGTH_SHORT).show();
                                    }
                                }

                                @Override
                                public void onFailure(Call<verificationCodeBean> call, Throwable t) {
                                }
                            });
                        }
                    }
                }).start();
            }}
        });
    }

    private void startCountDown() {
        new CountDownTimer(60 * 1000, 1000) {

            @Override
            public void onTick(long l) {
                get_verification.setText("(" + l / 1000 + ")");
            }

            @Override
            public void onFinish() {
                get_verification.setText("获取验证码");

            }
        }.start();
    }

    private void initFBC(View view) {
        get_verification = (Button) view.findViewById(R.id.get_verification);
        logon_on = (Button) view.findViewById(R.id.logon_on);
        logon_in = (Button) view.findViewById(R.id.logon_in);
        user_name = (EditText) view.findViewById(R.id.user_name);
        password = (EditText) view.findViewById(R.id.password);
        phone_number = (EditText) view.findViewById(R.id.phone_number);
        verify_code = (EditText) view.findViewById(R.id.verify_code);
    }


}
