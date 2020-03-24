package cn.com.hzc.businesslistproject.utils;

import android.content.Context;

/**
 * 在初始化的时候接收Context的工具类
 * @author 开源
 */
public class ContextUtils {
    private static Context context;
    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        ContextUtils.context = context;
    }
}
