package com.blackchopper.demo_refreshandloadlayout;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * author  : Black Chopper
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/BlackChopper
 * project :
 */
public class RcAdapter extends RecyclerView.Adapter<RcViewHolder> {
    List<String> data = new ArrayList<>();

    @Override
    public RcViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RcViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, null, false));
    }

    @Override
    public void onBindViewHolder(RcViewHolder holder, int position) {
        holder.bindData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void bindData(List<String> data) {
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    public void clear() {
        data.clear();
        Log.v("TAG", "---------data.Size----->>" + data.size());
    }
}