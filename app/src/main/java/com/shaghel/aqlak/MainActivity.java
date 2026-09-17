package com.shaghel.aqlak;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout screen = new LinearLayout(this);
        screen.setOrientation(LinearLayout.VERTICAL);
        screen.setGravity(Gravity.CENTER);
        screen.setPadding(40, 40, 40, 40);
        screen.setBackgroundColor(Color.rgb(18, 18, 28));

        TextView title = new TextView(this);
        title.setText("شغل عقلك");
        title.setTextColor(Color.WHITE);
        title.setTextSize(38);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("لعبة الألغاز العربية");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(20);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 20, 0, 60);

        TextView start = new TextView(this);
        start.setText("ابدأ اللعب");
        start.setTextColor(Color.WHITE);
        start.setTextSize(24);
        start.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        start.setGravity(Gravity.CENTER);
        start.setPadding(50, 30, 50, 30);
        start.setBackgroundColor(Color.rgb(255, 179, 0));

        screen.addView(title);
        screen.addView(subtitle);
        screen.addView(start);

        setContentView(screen);
    }
}
