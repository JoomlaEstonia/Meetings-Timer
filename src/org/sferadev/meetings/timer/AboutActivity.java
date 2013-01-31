package org.sferadev.meetings.timer;

import org.sferadev.meetings.timer.R;
import org.sferadev.meetings.timer.R.layout;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AboutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
	    }
	
	
    public void click_github(View v) {
        String url = "https://github.com/SferaDev/Meetings-Timer";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
	}

    public void click_paypal(View v) {
        String url = "http://forum.xda-developers.com/donatetome.php?u=4710474";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
	}
    

	
}
