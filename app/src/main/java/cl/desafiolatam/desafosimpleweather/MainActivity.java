package cl.desafiolatam.desafosimpleweather;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import cl.desafiolatam.desafosimpleweather.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        DailyWeather dailyWeather = new DailyWeather("Santiago", "03 de marzo","",22, "°C");
        binding.setDailyWeather(dailyWeather);

    }
}
