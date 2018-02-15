package syntacticsugar.golfproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Dalton on 7/10/2015.
 * Updated by Henny 2018
 */
public class Splash extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        //pause for a moment
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Splash.this, MenuScreen.class);
                startActivity(mainIntent);
                finish();
            }
        }, 2000);
    }

}
