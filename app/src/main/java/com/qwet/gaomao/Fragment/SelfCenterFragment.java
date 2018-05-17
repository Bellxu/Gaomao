package com.qwet.gaomao.Fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.qwet.gaomao.Bean.verificationCodeBean;
import com.qwet.gaomao.Constants;
import com.qwet.gaomao.GaoMaoService;
import com.qwet.gaomao.R;
import com.qwet.gaomao.Utils.RandomCodeUtils;
import com.qwet.gaomao.Utils.ToastUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xu on 2018/5/12.
 */

public class SelfCenterFragment extends Fragment {

    private Button registerbtn;
    private String username;
    private ImageView random;
    private EditText code_edit;
    private EditText pswed;
    private String userpsw;
    private Button get_verification;
    private EditText phone_number;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.selfcenter_fragment, container, false);
        initFBC(view);
        initClick();
        initData(view);
        return view;
    }

    private void initClick() {
        get_verification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String phoneNumber = phone_number.getText().toString().trim();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

                        GaoMaoService service = retrofit.create(GaoMaoService.class);
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
                }).start();
            }
        });
    }

    private void initFBC(View view) {
        get_verification = (Button) view.findViewById(R.id.get_verification);
        phone_number = (EditText) view.findViewById(R.id.phone_number);
    }

    private void initData(View view) {
        registerbtn = view.findViewById(R.id.logon_on);
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupWindow();
            }
        });
    }

    private void PopupWindow() {

        registerbtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                LayoutInflater from = LayoutInflater.from(getActivity());
                final View view = from.inflate(R.layout.searchdialog, null);
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

                //用户名
                EditText nameed = view.findViewById(R.id.mineInfo_name_edit);
                username = nameed.getText().toString().trim();
                //密码
                pswed = view.findViewById(R.id.mineInfo_number_edit);
                userpsw = pswed.getText().toString().trim();
                //随机数
                code_edit = view.findViewById(R.id.mineInfo_code_edit);
                random = view.findViewById(R.id.randomimage);
                random.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        RandomCodeUtils codeUtils = RandomCodeUtils.getInstance();
                        Bitmap bitmap = codeUtils.createBitmap();
                        random.setImageBitmap(bitmap);
                    }
                });


                builder.setTitle("注册").setView(view).setPositiveButton("确定注册", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ToastUtils.ToastShow(getContext(), "点击确定了");
                        //                        register();
                        dialog.dismiss();
                    }
                });

                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.create().show();
            }
        });

    }

    private void register() {
        String Code = code_edit.getText().toString().trim();
        Log.e("codeStr", Code);
        if (null == Code || TextUtils.isEmpty(Code)) {
            Toast.makeText(getContext(), "请输入验证码", Toast.LENGTH_SHORT).show();
        } else {

            String code = RandomCodeUtils.getInstance().getCode();
            Log.e("code", code);
            if (code.equalsIgnoreCase(Code)) {
                Toast.makeText(getContext(), "验证码正确", Toast.LENGTH_SHORT).show();
                //网络请求


            } else {
                Toast.makeText(getContext(), "验证码错误", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
