package org.androidtown.dietapp.Chart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CalendarView;

import org.androidtown.dietapp.R;

/**
 * Created by zidru on 2017-09-18.
 */

public class ChartActivity extends Activity {
    Button button_to_all;
    private BottomNavigationView bottomNav;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        //button_to_all = (Button) findViewById(R.id.button_to_all_chart);

        CalendarView calendar = (CalendarView) findViewById(R.id.calendar);

        //리스너 선택된 날짜의 정보 전송
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Intent intent = new Intent(ChartActivity.this, ViewCalendarActivity.class);
                intent.putExtra("Year", year);
                intent.putExtra("Month", month);
                intent.putExtra("Day", dayOfMonth);

                startActivity(intent);
            }
        });


        //전체차트로 이동
      /*button_to_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.button_to_all_chart:
                        Intent intent = new Intent(ChartActivity.this, ViewHistoryDataActivity.class);
                        startActivity(intent); break;
                }
            }
        });*/

        bottomNav = (BottomNavigationView)findViewById(R.id.bottom_nav_in_chart);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.action_to_all_view:
                        Intent AuthIntent = new Intent(ChartActivity.this, ViewHistoryDataActivity.class);
                        startActivity(AuthIntent);
                        break;
                    case R.id.action_to_all_view_left:
                        Intent AuthIntent_left = new Intent(ChartActivity.this, ViewHistoryDataActivity.class);
                        startActivity(AuthIntent_left);
                        break;
                    case R.id.action_to_all_view_right:
                        Intent AuthIntent_right = new Intent(ChartActivity.this, ViewHistoryDataActivity.class);
                        startActivity(AuthIntent_right);
                        break;
                }
                return true;
            }
        });

    }
}
