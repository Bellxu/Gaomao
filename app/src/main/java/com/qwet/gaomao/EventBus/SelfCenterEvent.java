package com.qwet.gaomao.EventBus;

/**
 * Created by xu on 2018/6/28.
 */

public class SelfCenterEvent {
    private String message;

    public SelfCenterEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
