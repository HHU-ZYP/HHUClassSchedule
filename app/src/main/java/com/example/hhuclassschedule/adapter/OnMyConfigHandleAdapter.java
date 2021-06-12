package com.example.hhuclassschedule.adapter;

import com.zhuangfei.timetable.TimetableView;

/**
 * 处理配置信息
 */
public class OnMyConfigHandleAdapter {

    public OnMyConfigHandleAdapter() {
    }

    private static final String TAG = "OnMyConfigHandleAdapter";

    public static final String CONFIG_SHOW_WEEKENDS = "config_show_weekends";
    public static final String CONFIG_SHOW_NOT_CUR_WEEK = "config_show_not_cur_week";
    public static final String CONFIG_CUR_WEEK = "config_current_week";
    public static final String CONFIG_SHOW_TIME = "config_show_time";
    public static final String CONFIG_START_DATE = "config_start_date";

    public static final String VALUE_TRUE = "config_value_true";
    public static final String VALUE_FALSE = "config_value_false";

    //应用配置信息
    public void onParseConfig(String key, String value, TimetableView mView) {
        if (mView == null || key == null || value == null) return;
        switch (key) {
            case CONFIG_SHOW_WEEKENDS:
                mView.isShowWeekends(value.equals(VALUE_TRUE));
                break;
            case CONFIG_SHOW_NOT_CUR_WEEK:
                mView.isShowNotCurWeek(value.equals(VALUE_TRUE));
                break;
            case CONFIG_CUR_WEEK:
                mView.changeWeekForce(Integer.parseInt(value));
                break;
            default:
                break;
        }
        mView.updateView();
    }

}
