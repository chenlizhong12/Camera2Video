package com.company.camera2project;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Create by SunnyDay on 2019/03/14
 * SharedPreferences 工具类
 */
public class SPUtil {
    /**
     * 存int值
     *
     * @param context
     * @param key
     * @param value
     */
    public static void putInt(Context context, String key, int value) {
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        sp.edit().putInt(key, value).apply();
    }

    /**
     * 取Int值
     */

    public static int getInt(Context context, String key, int defaultValue) {
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        return sp.getInt(key, defaultValue);
    }
    /**
     * 存布尔值
     *
     * @param context 上下文
     * @param key     存的key
     * @param value   值
     */
    public static void putBoolean(Context context, String key, boolean value) {
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).apply();
    }

    /**
     * 取布尔值
     *
     * @param context      上下文
     * @param key          key
     * @param defaultValue 默认值
     */
    public static boolean getBoolean(Context context, String key, boolean defaultValue) {
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        return sp.getBoolean(key, defaultValue);
    }

    /**
     * 存字符串
     *
     * @param context 上下文
     * @param key     key
     * @param value   值
     */
    public static void putString(Context context, String key, String value) {
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        sp.edit().putString(key, value).apply();
    }

    /**
     * 取布尔值
     *
     * @param context      上下文
     * @param key          key
     * @param defaultValue 默认值
     */
    public static String getString(Context context, String key, String defaultValue) {
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        return sp.getString(key, defaultValue);
    }
}
