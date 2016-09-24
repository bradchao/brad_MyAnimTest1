package brad.tw.myanimtest1;

import android.animation.AnimatorSet;
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
                ObjectAnimator.ofFloat(img,"y",
                        0,100,400,300,400,350,400);
        ObjectAnimator amin2 =
                ObjectAnimator.ofFloat(img,"rotation",
                        0,359);
        AnimatorSet set = new AnimatorSet();
        set.playTogether(amin1,amin2);
        set.setDuration(4*1000);
        set.start();

    }
}
