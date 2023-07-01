package com.roomdb.brightnesscontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    float brightness;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

seekBar = findViewById(R.id.seekBar);
textView = findViewById(R.id.textView);


seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        brightness = (float)progress/100;
        textView.setText("Brightness: "+progress+"%");
        WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
        layoutParams.screenBrightness = brightness;
        getWindow().setAttributes(layoutParams);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
});



    }
}