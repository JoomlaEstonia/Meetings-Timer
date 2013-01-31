package org.sferadev.meetings.timer;

import org.sferadev.meetings.timer.AboutActivity;
import org.sferadev.meetings.timer.R;

import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class MeetingsActivity extends TabActivity {
    
	String toast;
	
	@Override
	public void onBackPressed()
	{
	      moveTaskToBack(true);
	      
	      Context context = getApplicationContext();
	      int text = R.string.toast;
	      int duration = Toast.LENGTH_LONG;

	      Toast toast = Toast.makeText(context, text, duration);
	      toast.show();
	}
	
	@Override
	public boolean onKeyLongPress( int keyCode, KeyEvent event ) {
		if( keyCode == KeyEvent.KEYCODE_BACK ) {
			super.finish();
			return true;
		}
		return super.onKeyLongPress(keyCode, event);
	}
	
	Chronometer cGeneral;
    Chronometer cLectura;
    Chronometer cN1;
    Chronometer cN2;
    Chronometer cN3;
    Chronometer cEb;
    
    String eb;
    String tms;
    
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        
        TabHost host = (TabHost)findViewById(android.R.id.tabhost);
        
        String eb = getString(R.string.eb);
        String tms = getString(R.string.escuela);
        
        TabSpec spec1 = host.newTabSpec("EB");
        spec1.setContent(R.id.EB);
        spec1.setIndicator(eb);
        host.addTab(spec1);
        
        TabSpec spec2 = host.newTabSpec("TMS");
        spec2.setContent(R.id.TMS);
        spec2.setIndicator(tms);
        host.addTab(spec2);
        
        Button button;
        cGeneral = (Chronometer) findViewById(R.id.cgeneral);
        cLectura = (Chronometer) findViewById(R.id.clectura);
        cN1 = (Chronometer) findViewById(R.id.cn1);
        cN2 = (Chronometer) findViewById(R.id.cn2);
        cN3 = (Chronometer) findViewById(R.id.cn3);
        cEb = (Chronometer) findViewById(R.id.ceb);
        
        button = (Button) findViewById(R.id.startgeneral);
        button.setOnClickListener(LStartGeneral);
        button = (Button) findViewById(R.id.stopgeneral);
        button.setOnClickListener(LStopGeneral);
        button = (Button) findViewById(R.id.resetgeneral);
        button.setOnClickListener(LResetGeneral);
        
        button = (Button) findViewById(R.id.startlb);
        button.setOnClickListener(LStartLb);
        button = (Button) findViewById(R.id.stoplb);
        button.setOnClickListener(LStopLb);
        button = (Button) findViewById(R.id.resetlb);
        button.setOnClickListener(LResetLb);
        
        button = (Button) findViewById(R.id.startn1);
        button.setOnClickListener(LStartN1);
        button = (Button) findViewById(R.id.stopn1);
        button.setOnClickListener(LStopN1);
        button = (Button) findViewById(R.id.resetn1);
        button.setOnClickListener(LResetN1);
        
        button = (Button) findViewById(R.id.startn2);
        button.setOnClickListener(LStartN2);
        button = (Button) findViewById(R.id.stopn2);
        button.setOnClickListener(LStopN2);
        button = (Button) findViewById(R.id.resetn2);
        button.setOnClickListener(LResetN2);
        
        button = (Button) findViewById(R.id.startn3);
        button.setOnClickListener(LStartN3);
        button = (Button) findViewById(R.id.stopn3);
        button.setOnClickListener(LStopN3);
        button = (Button) findViewById(R.id.resetn3);
        button.setOnClickListener(LResetN3);
        
        button = (Button) findViewById(R.id.starteb);
        button.setOnClickListener(LStartEb);
        button = (Button) findViewById(R.id.stopeb);
        button.setOnClickListener(LStopEb);
        button = (Button) findViewById(R.id.reseteb);
        button.setOnClickListener(LResetEb);
       
      
    }
    
    View.OnClickListener LStartGeneral = new OnClickListener() {
        public void onClick(View v) {
        	cGeneral.setBase(SystemClock.elapsedRealtime());
        	cGeneral.start();
        }
    };
    View.OnClickListener LStopGeneral = new OnClickListener() {
        public void onClick(View v) {
            cGeneral.stop();
        }
    };
    View.OnClickListener LResetGeneral = new OnClickListener() {
        public void onClick(View v) {
            cGeneral.setBase(SystemClock.elapsedRealtime());
        }
    
    };
    
    View.OnClickListener LStartLb = new OnClickListener() {
        public void onClick(View v) {
        	cLectura.setBase(SystemClock.elapsedRealtime());
        	cLectura.start();
        }
    };
    View.OnClickListener LStopLb = new OnClickListener() {
        public void onClick(View v) {
            cLectura.stop();
        }
    };
    View.OnClickListener LResetLb = new OnClickListener() {
        public void onClick(View v) {
            cLectura.setBase(SystemClock.elapsedRealtime());
        }
    
    };
    
    View.OnClickListener LStartN1 = new OnClickListener() {
        public void onClick(View v) {
        	cN1.setBase(SystemClock.elapsedRealtime());
        	cN1.start();
        }
    };
    View.OnClickListener LStopN1 = new OnClickListener() {
        public void onClick(View v) {
            cN1.stop();
        }
    };
    View.OnClickListener LResetN1 = new OnClickListener() {
        public void onClick(View v) {
            cN1.setBase(SystemClock.elapsedRealtime());
        }
    
    };
    
    View.OnClickListener LStartN2 = new OnClickListener() {
        public void onClick(View v) {
        	cN2.setBase(SystemClock.elapsedRealtime());
        	cN2.start();
        }
    };
    View.OnClickListener LStopN2 = new OnClickListener() {
        public void onClick(View v) {
            cN2.stop();
        }
    };
    View.OnClickListener LResetN2 = new OnClickListener() {
        public void onClick(View v) {
            cN2.setBase(SystemClock.elapsedRealtime());
        }
    
    };
    
    View.OnClickListener LStartN3 = new OnClickListener() {
        public void onClick(View v) {
        	cN3.setBase(SystemClock.elapsedRealtime());
        	cN3.start();
        }
    };
    View.OnClickListener LStopN3 = new OnClickListener() {
        public void onClick(View v) {
            cN3.stop();
        }
    };
    View.OnClickListener LResetN3 = new OnClickListener() {
        public void onClick(View v) {
            cN3.setBase(SystemClock.elapsedRealtime());
        }
    
    };
    
    View.OnClickListener LStartEb = new OnClickListener() {
        public void onClick(View v) {
        	cEb.setBase(SystemClock.elapsedRealtime());
        	cEb.start();
        }
    };
    View.OnClickListener LStopEb = new OnClickListener() {
        public void onClick(View v) {
            cEb.stop();
        }
    };
    View.OnClickListener LResetEb = new OnClickListener() {
        public void onClick(View v) {
            cEb.setBase(SystemClock.elapsedRealtime());
        }
    
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
           case R.id.shareWith:
        	   Intent i = new Intent(android.content.Intent.ACTION_SEND);
           		i.setType("text/plain");
           		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
           				getResources().getText(R.string.sGeneral) + " " +
           				cGeneral.getText() +
           				getResources().getText(R.string.sEB) + " " +
           				cEb.getText() +
           				getResources().getText(R.string.sReading) + " " +
           				cLectura.getText() +
           				getResources().getText(R.string.sN1) + " " +
           				cN1.getText() +
           				getResources().getText(R.string.sN2) + " " +
           				cN2.getText() +
           				getResources().getText(R.string.sN3) + " " +
           				cN3.getText());
           		startActivity(Intent.createChooser(i,"Share via"));
           		break;
           		
           		case R.id.about:
      			Intent intent = new Intent(this, AboutActivity.class);
      	        this.startActivity(intent);
      	        break;
   			
   		}
        
        return true;
    }
    
}
