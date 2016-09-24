package brad.tw.myanimtest1;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView)findViewById(R.id.img);

        ObjectAnimator amin1 =
                ObjectAnimator.ofFloat(img,"x",0,100,400);
        amin1.setDuration(4*1000);
        //amin1.setRepeatCount(1);
        amin1.start();

    }
}
