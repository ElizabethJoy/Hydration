package info.androidhive.materialtabs.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import info.androidhive.materialtabs.R;

/**
 * Created by csaper6 on 5/15/17.
 */
public class Person extends AppCompatActivity {
    private int hydrationGoal; //their personal hydration level, how many oz
    private int hydration; //how much water they have drank
    private int weight; //in pounds
    private int age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


}
