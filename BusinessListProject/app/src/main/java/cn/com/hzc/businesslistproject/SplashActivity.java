package cn.com.hzc.businesslistproject;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import cn.com.hzc.businesslistproject.databinding.ActivitySplashBinding;

/**
 * 一个简简单单的欢迎界面
 * @author 开源
 */
public class SplashActivity extends AppCompatActivity {
    ActivitySplashBinding activitySplashBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // 隐藏ActionBar
        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        super.onCreate(savedInstanceState);
        // DataBind的方式来加载布局文件
        activitySplashBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash);

        // 设置定时，2秒后执行跳转
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                finish();
            }
        }, 2000);
    }
}
