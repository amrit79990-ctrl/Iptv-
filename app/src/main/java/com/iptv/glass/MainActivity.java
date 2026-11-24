package com.iptv.glass;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView title = new TextView(this);
        title.setText("IPTV GLASS");
        title.setTextSize(32);
        title.setGravity(Gravity.CENTER);

        setContentView(title);
    }
}
