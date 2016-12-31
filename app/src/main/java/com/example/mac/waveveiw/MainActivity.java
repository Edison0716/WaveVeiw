package com.example.mac.waveveiw;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private WaveView waveCircleView,waveView;
    private int progrees=0;//进度
    private Handler mHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if (progrees==100) progrees=0;
            Log.i("progress",progrees+"");
            waveView.setmProgress(progrees++);
            waveCircleView.setmProgress(progrees++);
            mHandler.sendEmptyMessageDelayed(0,100);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        waveCircleView = (WaveView) findViewById(R.id.waveViewCircle);
        waveView = (WaveView) findViewById(R.id.waveView);
        mHandler.sendEmptyMessageDelayed(0,10);
    }
}
