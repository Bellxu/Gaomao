package com.qwet.gaomao;

import com.qwet.gaomao.Bean.verificationCodeBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by xu on 2018/5/13.
 */

public interface GaoMaoService {
@GET ("register-send-msg?phoneNum=18817334366")
    Call<verificationCodeBean> getVerificationCodeBean();

}
