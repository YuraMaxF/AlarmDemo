package com.weijun.alarmdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.weijun.alarmdemo.R;
import com.weijun.alarmdemo.model.Alarm;
import com.weijun.alarmdemo.view.SwitchView;
import com.weijun.alarmdemo.viewholder.MViewHolder;

import java.util.List;

/**
 * 佛祖保佑  永无BUG
 * 作者：weijun
 * 日期：2019/2/20
 * 作用：
 */

public class MAdapter extends RecyclerView.Adapter<MViewHolder> {

    private List<Alarm> mDataList;
    private Context mContext;

    private OnDeleteButtonClick onDeleteButtonClick;
    private OnSwitchViewToggleListener onSwitchViewToggleListener;

    public MAdapter(List<Alarm> mDataList, OnDeleteButtonClick onDeleteButtonClick,OnSwitchViewToggleListener onSwitchViewToggleListener) {
        this.mDataList = mDataList;
        this.onDeleteButtonClick = onDeleteButtonClick;
        this.onSwitchViewToggleListener = onSwitchViewToggleListener;
    }

    @Override
    public MViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        return new MViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main,parent,false));
    }

    @Override
    public void onBindViewHolder(final MViewHolder holder, final int position) {
        final Alarm data = mDataList.get(position);
        holder.show.setText(data.getAlarmData());
        holder.tv_delete.setOnClickListener(v -> onDeleteButtonClick.onBtnClicked(position,data,holder.show));
        holder.sw.setOpened(data.getAlarmActive());
        holder.sw.setOnStateChangedListener(new SwitchView.OnStateChangedListener() {
            @Override
            public void toggleToOn(SwitchView view) {
                onSwitchViewToggleListener.toOn(view,data);
            }

            @Override
            public void toggleToOff(SwitchView view) {
                onSwitchViewToggleListener.toOff(view,data);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public interface OnDeleteButtonClick{
        void onBtnClicked(int position, Alarm data, TextView show);
    }

    public interface OnSwitchViewToggleListener{
        void toOn(SwitchView view,Alarm alarm);
        void toOff(SwitchView view,Alarm alarm);
    }
}
