package com.fun.dashboardanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final float PERCENT = 60;
    private ImageView ivIndex;
    private TextView tvRatio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivIndex = (ImageView) findViewById(R.id.iv_index);
        tvRatio = (TextView) findViewById(R.id.tv_ratio);
        tvRatio.setText(PERCENT + "");
        ivRotate(PERCENT);
    }

    /**
     * 旋转动画
     * @param percent
     */
    private void ivRotate(double percent) {
        double percentOffset = percent > 100 ? 100 : percent;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180 * ((int) percentOffset / 100f),
                Animation.RELATIVE_TO_SELF, 0.748f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(1500);
        rotateAnimation.setFillAfter(true);
        ivIndex.startAnimation(rotateAnimation);
    }

}
