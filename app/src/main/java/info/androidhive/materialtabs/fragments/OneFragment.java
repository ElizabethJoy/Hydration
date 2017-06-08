package info.androidhive.materialtabs.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment {

    public OneFragment() {
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
        View rootview = inflater.inflate(R.layout.fragment_one, container, false);
        ProgressBar bar = (ProgressBar) rootview.findViewById(R.id.progressBar);
        bar.setBackgroundColor(Color.BLUE);
        bar.setProgress(10);


        return rootview;
    }

}
