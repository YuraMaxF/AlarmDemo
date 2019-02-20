package com.weijun.alarmdemo.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.weijun.alarmdemo.R;

/**
 * 佛祖保佑  永无BUG
 * 作者：weijun
 * 日期：2019/2/19
 * 作用：
 */

public class AlarmAlert extends Activity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mediaPlayer = MediaPlayer.create(this, R.raw.in_call_alarm);
        mediaPlayer.start();
        new AlertDialog.Builder(AlarmAlert.this)
                .setIcon(R.drawable.clock)
                .setTitle("闹钟响了")
                .setMessage("时间到了！")
                .setPositiveButton("关掉", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AlarmAlert.this.finish();
                        mediaPlayer.stop();
                    }
                }).show();
    }
}

