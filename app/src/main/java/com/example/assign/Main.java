package com.example.assign;

import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main extends AppCompatActivity {
    private static final String TAG = Main.class.getSimpleName();
    ListView listViews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViews = (ListView)findViewById(R.id.listViewWeather);

        //calling the method to display the weather
        getWeather();
    }

    private void getWeather() {
        Call<List<Weather>> call = RetrofitClin.getInstance().getMyApi().getWeather();
        call.enqueue(new Callback<List<Weather>>() {
            @Override
            public void onResponse(Call<List<Weather>> call, Response<List<Weather>> response) {
                List<Weather> weatherList = response.body();


                //Creating an String array for the ListView
                String[] weathercode = new String[weatherList.size()];

                //looping through all the heroes and inserting the names inside the string array
                for (int i = 0; i < weatherList.size(); i++) {
                    weathercode[i] = weatherList.get(i).getDay();


                }

                //displaying the string array into listview
                listViews.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, weathercode));
            }

            @Override
            public void onFailure(Call<List<Weather>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
