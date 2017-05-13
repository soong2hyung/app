package yoonjh.a170104_camera_01;


import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import kr.co.edu_a.mooil.R;

public class EditActivity extends AppCompatActivity {
    private static final int STROKE_WIDTH_LIGHT = 20;
    private static final int STROKE_WIDTH_BOLD = 35;
    public static Bitmap bm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Intent intent = getIntent();
        bm = intent.getParcelableExtra("bitmap");

        //vw = new MyView(this);
        //setContentView(vw);

        final ToggleButton tb = (ToggleButton) findViewById(R.id.tgb_Masking);
        Button start = (Button) findViewById(R.id.btn_Start);
    }

    public void mOnClick(View v) {
        Intent a = new Intent(this, Memorize.class);
        startActivity(a);
    }
}







