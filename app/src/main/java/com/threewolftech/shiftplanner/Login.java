package com.threewolftech.shiftplanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Login extends Activity {

    Animation animLoginLogo;
    ImageView ivLoginLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Init
        ivLoginLogo = (ImageView)findViewById(R.id.ivLoginLogo);

        //Load the animations
        animLoginLogo = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.login_logo_anim);

        //Start animation
        ivLoginLogo.startAnimation(animLoginLogo);
    }
}
