package neu.edu.cn.mobilesafer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import neu.edu.cn.mobilesafer.R;
import neu.edu.cn.mobilesafer.util.ConstantValues;
import neu.edu.cn.mobilesafer.util.SharePreferenceUtil;
import neu.edu.cn.mobilesafer.util.ToastUtil;

/**
 * Created by neuHenry on 2017/8/18.
 */

public class SetupOverActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean setupOver = SharePreferenceUtil.getBooleanFromSharePreference(getApplicationContext(),
                ConstantValues.SETUP_OVER, false);
        if (setupOver) {
            setContentView(R.layout.activity_setup_over);
            // 初始化布局文件中的View
            initView();
        } else {
            Intent intent = new Intent(getApplicationContext(), SetupFirstActivity.class);
            startActivity(intent);
            finish();
        }
    }

    /**
     * 初始化布局文件中的View
     */
    private void initView() {
        TextView resetSetupTextView = (TextView) findViewById(R.id.reset_setup_text_view);
        resetSetupTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.show(getApplicationContext(), "");
            }
        });
    }
}
