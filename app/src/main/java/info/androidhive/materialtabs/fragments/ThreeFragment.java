package info.androidhive.materialtabs.fragments;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.AlarmReceiver;
import info.androidhive.materialtabs.activity.MainActivity;


public class ThreeFragment extends Fragment {

    private Button wakeup;
    private Button breakfast;
    private Button lunch;
    private Button dinner;
    private Button sleep;
    private TimePicker clock;
    private Time wakeupTime;
    private Time breakfastTime;
    private Time lunchTime;
    private Time dinnerTime;
    private Time sleepTime;
    private boolean clicked = false;

    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);
        Button wakeup = (Button) rootView.findViewById(R.id.button_wake);
        Button breakfast = (Button) rootView.findViewById(R.id.button_breakfast);
        Button lunch = (Button) rootView.findViewById(R.id.button_lunch);
        Button dinner = (Button) rootView.findViewById(R.id.button_dinner);
        Button sleep = (Button) rootView.findViewById(R.id.button_sleep);
        TimePicker clock = (TimePicker) rootView.findViewById(R.id.timePicker);
        final Calendar calendar = Calendar.getInstance();


        wakeup.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View v) {
                if (!clicked)

                {
                    calendar.set(Calendar.MINUTE, clock.getMinute());
                    calendar.set(Calendar.HOUR, clock.getHour());
                    long wakeupTime = calendar.getInstance().getTimeInMillis();
                    clicked = true;
                    Intent intent1 = new Intent(getActivity(), AlarmReceiver.class);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(getActivity(), 0, intent1, PendingIntent.FLAG_UPDATE_CURRENT);
                    AlarmManager wakeAlarm = (AlarmManager) getActivity().getSystemService(getActivity().ALARM_SERVICE);
                    wakeAlarm.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), wakeupTime, pendingIntent);
                } else

                {
                    Calendar wakeupTime = null;
                    clicked = false;
                }

            }


        });

        breakfast.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View v) {
                if (!clicked)

                {
                    calendar.set(Calendar.MINUTE, clock.getMinute());
                    calendar.set(Calendar.HOUR, clock.getHour());
                    long breakfastTime = calendar.getInstance().getTimeInMillis();
                    clicked = true;
                    Intent intent1 = new Intent(getActivity(), AlarmReceiver.class);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(getActivity(), 0, intent1, PendingIntent.FLAG_UPDATE_CURRENT);
                    AlarmManager breakAlarm = (AlarmManager) getActivity().getSystemService(getActivity().ALARM_SERVICE);
                    breakAlarm.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), breakfastTime, pendingIntent);
                } else

                {
                    Calendar breakfastTime = null;
                    clicked = false;
                }

            }


        });

        lunch.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View v) {
                if (!clicked)

                {
                    calendar.set(Calendar.MINUTE, clock.getMinute());
                    calendar.set(Calendar.HOUR, clock.getHour());
                    long breakfastTime = calendar.getInstance().getTimeInMillis();
                    clicked = true;
                    Intent intent1 = new Intent(getActivity(), AlarmReceiver.class);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(getActivity(), 0, intent1, PendingIntent.FLAG_UPDATE_CURRENT);
                    AlarmManager lunchAlarm = (AlarmManager) getActivity().getSystemService(getActivity().ALARM_SERVICE);
                    lunchAlarm.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), breakfastTime, pendingIntent);
                } else

                {
                    Calendar lunchTime = null;
                    clicked = false;
                }

            }


        });

        dinner.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View v) {
                if (!clicked)

                {
                    calendar.set(Calendar.MINUTE, clock.getCurrentMinute());
                    calendar.set(Calendar.HOUR, clock.getCurrentHour());
                    long breakfastTime = calendar.getInstance().getTimeInMillis();
                    clicked = true;
                    Intent intent1 = new Intent(getActivity(), AlarmReceiver.class);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(getActivity(), 0, intent1, PendingIntent.FLAG_UPDATE_CURRENT);
                    AlarmManager dinnerAlarm = (AlarmManager) getActivity().getSystemService(getActivity().ALARM_SERVICE);
                    dinnerAlarm.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), dinnerTime, pendingIntent);
                } else

                {
                    Calendar dinnerTime = null;
                    clicked = false;
                }

            }


        });

        sleep.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View v) {
                if (!clicked)

                {
                    calendar.set(Calendar.MINUTE, clock.getMinute());
                    calendar.set(Calendar.HOUR, clock.getHour());
                    long breakfastTime = calendar.getInstance().getTimeInMillis();
                    clicked = true;
                    Intent intent1 = new Intent(getActivity(), AlarmReceiver.class);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(getActivity(), 0, intent1, PendingIntent.FLAG_UPDATE_CURRENT);
                    AlarmManager sleepAlarm = (AlarmManager) getActivity().getSystemService(getActivity().ALARM_SERVICE);
                    sleepAlarm.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sleepTime, pendingIntent);
                } else

                {
                    Calendar sleepTime = null;
                    clicked = false;
                }

            }


        });

        return null;
    }
}