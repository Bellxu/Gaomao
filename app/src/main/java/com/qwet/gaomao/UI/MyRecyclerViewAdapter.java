package com.qwet.gaomao.UI;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.qwet.gaomao.Bean.sampleBean;

import java.util.List;

/**
 * Created by xu on 2018/8/14.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter {
    private List<sampleBean> list;
    private  Context context;

    public MyRecyclerViewAdapter(Context context, List<sampleBean> list) {
       this.context= context;
       this.list= list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
