package com.qwet.gaomao;

import com.qwet.gaomao.Bean.verificationCodeBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by xu on 2018/5/13.
 */

public interface GaoMaoService {
@GET ("register-send-msg")
    Call<verificationCodeBean> getVerificationCodeBean(@Query("phoneNum")String phoneNum);

}
