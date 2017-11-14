package org.androidtown.dietapp.Chart;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import org.androidtown.dietapp.R;

/**
 * Created by zidru on 2017-11-14.
 */

public class ViewFriendActivity extends AppCompatActivity{
    private BottomNavigationView bottomNav;
    Intent AuthIntent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_friends);

        bottomNav = (BottomNavigationView)findViewById(R.id.bottom_nav_in_friendview);

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.action_friend_left:
                        break;
                    case R.id.action_add_friend:
                        break;
                    case R.id.action_friend_right:
                        break;
                }
                return true;
            }
        });

    }
}
