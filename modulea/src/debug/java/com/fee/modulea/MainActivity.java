package com.fee.modulea;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = new FrameLayout(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
        frameLayout.setId(R.id.action_container);
        setContentView(frameLayout,layoutParams);
        //setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.action_container, new FragmentA())
        .commit();
    }
}
