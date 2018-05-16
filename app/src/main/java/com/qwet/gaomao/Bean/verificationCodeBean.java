package com.qwet.gaomao.Bean;

/**
 * Created by xu on 2018/5/17.
 */

public class verificationCodeBean {

    /**
     * sendSmsResponse : {"requestId":"A997F86F-BB90-4E9C-BC38-6CB404934BDD","bizId":"152811226483955199^0","code":"OK","message":"OK"}
     * warning : Send Message Succeed!!!
     */

    private SendSmsResponseBean sendSmsResponse;
    private String warning;

    public SendSmsResponseBean getSendSmsResponse() {
        return sendSmsResponse;
    }

    public void setSendSmsResponse(SendSmsResponseBean sendSmsResponse) {
        this.sendSmsResponse = sendSmsResponse;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public static class SendSmsResponseBean {
        /**
         * requestId : A997F86F-BB90-4E9C-BC38-6CB404934BDD
         * bizId : 152811226483955199^0
         * code : OK
         * message : OK
         */

        private String requestId;
        private String bizId;
        private String code;
        private String message;

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public String getBizId() {
            return bizId;
        }

        public void setBizId(String bizId) {
            this.bizId = bizId;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
