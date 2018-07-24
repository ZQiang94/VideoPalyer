package zqiang94.github.io.videopalyer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private SimpleVideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mVideoView =  findViewById(R.id.simple_video);
        String url = "http://1255521334.vod2.myqcloud.com/ca2a1ebevodgzp1255521334/36ec9b975285890780567798103/hD68STre3sEA.mp4";
        mVideoView.setVideoUrl(url);
    }
}
