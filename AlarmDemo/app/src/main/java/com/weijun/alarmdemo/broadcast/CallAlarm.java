package com.weijun.alarmdemo.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.weijun.alarmdemo.activity.AlarmAlert;

/**
 * 佛祖保佑  永无BUG
 * 作者：weijun
 * 日期：2019/2/19
 * 作用：
 */

public class CallAlarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context, AlarmAlert.class);
        Bundle bundle = new Bundle();
        bundle.putString("STR_CALLER", "");
        intent1.putExtras(bundle);
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);
    }
}
