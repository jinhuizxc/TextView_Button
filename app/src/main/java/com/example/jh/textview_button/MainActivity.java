package com.example.jh.textview_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.TextView;

/**
 * 文本/button 样式
 *
 * <!-- 实心块,形状颜色 -->
 *     <!-- 形状的边框 -->
 *          <!-- 设置形状的圆角 -->
 *               <!-- 内间距 -->
 * <item android:drawable="@drawable/text_color_shape" android:state_pressed="true"/>
 * <item android:drawable="@drawable/text_shape" android:state_pressed="false"/>
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckedTextView tx = (CheckedTextView) findViewById(R.id.tx);
        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tx.isChecked()){
                    tx.setChecked(false);
                }else{
                    tx.setChecked(true);
                }
            }
        });
    }
}
