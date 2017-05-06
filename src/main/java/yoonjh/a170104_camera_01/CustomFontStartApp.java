package yoonjh.a170104_camera_01;

import android.app.Application;
import com.tsengvn.typekit.Typekit;


public class CustomFontStartApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Custom font
        Typekit.getInstance()
                .addNormal(Typekit.createFromAsset(this, "nanum_normal.ttf"))
                .addBold(Typekit.createFromAsset(this, "nanum_bold.ttf"));
    }
}
