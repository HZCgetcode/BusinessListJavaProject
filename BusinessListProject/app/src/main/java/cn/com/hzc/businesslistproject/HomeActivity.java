package cn.com.hzc.businesslistproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 首页
 * @author 开源
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 使用普通的方式渲染界面
        setContentView(R.layout.activity_home);
    }
}
