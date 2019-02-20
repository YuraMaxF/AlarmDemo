package com.weijun.alarmdemo.model;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Z on 2015/11/16.
 */
public class Alarm extends LitePalSupport{

    private int id;
    private Boolean alarmActive = true;
    private String alarmData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getAlarmActive() {
        return alarmActive;
    }

    public void setAlarmActive(Boolean alarmActive) {
        this.alarmActive = alarmActive;
    }

    public String getAlarmData() {
        return alarmData;
    }

    public void setAlarmData(String alarmData) {
        this.alarmData = alarmData;
    }
}
