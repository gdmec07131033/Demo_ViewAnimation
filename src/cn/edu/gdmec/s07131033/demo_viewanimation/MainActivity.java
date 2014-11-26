package cn.edu.gdmec.s07131033.demo_viewanimation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView1);
    }
    public void ALPHA(View v)
    {
    	Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha_animation);
    	tv.startAnimation(animation);
    }
    public void SCALE(View v)
    {
    	Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale_animation);
    	tv.startAnimation(animation);
    }
    public void ROTATE(View v)
    {
    	Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate_animation);
    	tv.startAnimation(animation);
    }
    public void TRANSLATE(View v)
    {
    	Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate_animation);
    	tv.startAnimation(animation);
    }
    public void ALL(View v)
    {
    	Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.set_animation);
    	tv.startAnimation(animation);
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
