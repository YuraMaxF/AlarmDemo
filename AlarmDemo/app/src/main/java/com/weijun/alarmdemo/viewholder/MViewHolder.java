package com.weijun.alarmdemo.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.weijun.alarmdemo.R;
import com.weijun.alarmdemo.view.SwitchView;

/**
 * 佛祖保佑  永无BUG
 * 作者：weijun
 * 日期：2019/2/20
 * 作用：
 */

public class MViewHolder extends RecyclerView.ViewHolder {

    public TextView show;
    public SwitchView sw;
    public TextView tv_delete;

    public MViewHolder(View itemView) {
        super(itemView);
        show = itemView.findViewById(R.id.show);
        sw = itemView.findViewById(R.id.sw);
        tv_delete = itemView.findViewById(R.id.tv_delete);
    }
}
