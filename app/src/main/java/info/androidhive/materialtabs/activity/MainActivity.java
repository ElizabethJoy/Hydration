package info.androidhive.materialtabs.activity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import java.util.Calendar;

import static info.androidhive.materialtabs.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    private Button btnIconTabs;


    MainActivity inst;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent f = new Intent(MainActivity.this, IconTabsActivity.class);
                startActivity(f);
            }

        };
        t.run();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 11);
        calendar.set(Calendar.MINUTE, 52);
        calendar.set(Calendar.SECOND, 0);









    }


}
