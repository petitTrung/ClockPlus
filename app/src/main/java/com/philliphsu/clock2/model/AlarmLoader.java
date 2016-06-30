package com.philliphsu.clock2.model;

import android.content.Context;

import com.philliphsu.clock2.Alarm;

/**
 * Created by Phillip Hsu on 6/30/2016.
 */
public class AlarmLoader extends DataLoader<Alarm> {

    private long mAlarmId;

    public AlarmLoader(Context context, long alarmId) {
        super(context);
        mAlarmId = alarmId;
    }

    @Override
    public Alarm loadInBackground() {
        return DatabaseManager.getInstance(getContext()).getAlarm(mAlarmId);
    }
}