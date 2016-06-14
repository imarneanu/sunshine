package com.imarneanu.sunshine.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.listview_forecast)
    private ListView mListForecast;

    private ArrayAdapter<String> mForecastAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        String[] forecastArray = {
                "Today - Mostly Sunny - 18/12",
                "Tomorrow - Rain - 23/13",
                "Thursday - Sunny - 29/17",
                "Friday - Sunny - 34/18",
                "Saturday - Rain - 28/16"
        };

        List<String> forecastEntries = new ArrayList<>(Arrays.asList(forecastArray));

        mForecastAdapter = new ArrayAdapter<>(this,
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                forecastEntries);

        mListForecast.setAdapter(mForecastAdapter);
    }
}
