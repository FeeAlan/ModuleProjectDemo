package com.fee.moduleprojectdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.spinytech.macore.MaApplication;
import com.spinytech.macore.router.LocalRouter;
import com.spinytech.macore.router.RouterRequest;
import com.spinytech.macore.router.RouterResponse;

public class MainActivity extends AppCompatActivity {
    //private TextView mTextMessage;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getSupportFragmentManager().beginTransaction()
                            .add(R.id.content, getFragment("modulea", "action_fragment_a"))
                            .commit();
                    return true;
                case R.id.navigation_dashboard:
                    getSupportFragmentManager().beginTransaction()
                            .add(R.id.content, getFragment("moduleb", "action_fragment_b"))
                            .commit();
                    return true;
                //case R.id.navigation_notifications:
                //    //mTextMessage.setText(R.string.title_notifications);
                //    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.content, getFragment("modulea", "action_fragment_a"))
                .commit();

    }

    private Fragment getFragment(String provider, String action){
        Fragment fragment = null;
        try {
            RouterResponse route = LocalRouter.getInstance(MaApplication.getMaApplication())
                    .route(MainActivity.this, RouterRequest.obtain(MainActivity.this)
                            .provider(provider)
                            .action(action));
            fragment = (Fragment) route.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fragment;
    }
}
