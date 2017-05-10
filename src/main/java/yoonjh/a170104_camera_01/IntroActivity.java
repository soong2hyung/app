package yoonjh.a170104_camera_01;

import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class IntroActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //상태바 제거
        setContentView(R.layout.activity_intro);

        ImageView introBackground = (ImageView)findViewById(R.id.intro_imageView_01);
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(introBackground);
        Glide.with(this).load(R.raw.intro_background).into(imageViewTarget);
    }

    public void IntroClick(View v)
    {
        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(intent);

        finish();
    }
}
