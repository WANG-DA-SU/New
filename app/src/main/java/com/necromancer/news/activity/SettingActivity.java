package com.necromancer.news.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.necromancer.news.R;

;

public class SettingActivity extends AppCompatActivity {

    // 默认是日间模式
    private int theme = R.style.AppTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 判断是否有主题存储
        if(savedInstanceState != null){
            theme = savedInstanceState.getInt("theme");
            setTheme(theme);
        }
        setContentView(R.layout.activity_setting);

        Button btn_theme = (Button) findViewById(R.id.btn_theme);
        btn_theme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theme = (theme == R.style.AppTheme) ? R.style.NightAppTheme : R.style.AppTheme;
                SettingActivity.this.recreate();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("theme", theme);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        theme = savedInstanceState.getInt("theme");
    }



}