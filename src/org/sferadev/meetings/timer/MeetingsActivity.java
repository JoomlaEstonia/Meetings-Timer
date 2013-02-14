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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
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
    Chronometer cRs1;
    Chronometer cRs2;
    Chronometer cRs3;
    Chronometer cRs4;
    Chronometer cRs5;
    
    String eb;
    String tms;
    
    int num = 0;
    String numero;
    TextView counter;
    Button counterbutton;
    Button mincounter;
    
    EditText ers1;
    EditText ers2;
    EditText ers3;
    EditText ers4;
    EditText ers5;
    
    TextView rc1;
    Chronometer rc2;
    Chronometer rc3;
    Chronometer rc4;
    Chronometer rc5;
    Chronometer rc6;
    Chronometer rc7;
    Chronometer rc8;
    Chronometer rc9;
    Chronometer rc10;
    Chronometer rc11;
    Chronometer rc12;
    Chronometer rc13;
    Chronometer rc14;
    Chronometer rc15;
    Chronometer rc16;
    Chronometer rc17;
    Chronometer rc18;
    Chronometer rc19;
    Chronometer rc20;
    Chronometer rc21;
    
    LinearLayout r1;
    LinearLayout r2;
    LinearLayout r3;
    LinearLayout r4;
    LinearLayout r5;
    LinearLayout r6;
    LinearLayout r7;
    LinearLayout r8;
    LinearLayout r9;
    LinearLayout r10;
    LinearLayout r11;
    LinearLayout r12;
    LinearLayout r13;
    LinearLayout r14;
    LinearLayout r15;
    LinearLayout r16;
    LinearLayout r17;
    LinearLayout r18;
    LinearLayout r19;
    LinearLayout r20;
    LinearLayout r21;

    TextView crc2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        
        TabHost host = (TabHost)findViewById(android.R.id.tabhost);
        
        String eb = getString(R.string.eb);
        String tms = getString(R.string.escuela);
        String rs = getString(R.string.rs);
        
        TabSpec spec1 = host.newTabSpec("EB");
        spec1.setContent(R.id.EB);
        spec1.setIndicator(eb);
        host.addTab(spec1);
        
        TabSpec spec2 = host.newTabSpec("TMS");
        spec2.setContent(R.id.TMS);
        spec2.setIndicator(tms);
        host.addTab(spec2);
        
        TabSpec spec3 = host.newTabSpec("RS");
        spec3.setContent(R.id.RS);
        spec3.setIndicator(rs);
        host.addTab(spec3);
        
        Button button;
        ImageButton ibuttong;
        ImageButton ibuttonlb;
        ImageButton ibuttoneb;
        ImageButton ibuttonn1;
        ImageButton ibuttonn2;
        ImageButton ibuttonn3;
        ImageButton ibuttonrs1;
        ImageButton ibuttonrs2;
        ImageButton ibuttonrs3;
        ImageButton ibuttonrs4;
        ImageButton ibuttonrs5;
        
        cGeneral = (Chronometer) findViewById(R.id.cgeneral);
        cLectura = (Chronometer) findViewById(R.id.clectura);
        cN1 = (Chronometer) findViewById(R.id.cn1);
        cN2 = (Chronometer) findViewById(R.id.cn2);
        cN3 = (Chronometer) findViewById(R.id.cn3);
        cEb = (Chronometer) findViewById(R.id.ceb);
        cRs1 = (Chronometer) findViewById(R.id.crs1);
        cRs2 = (Chronometer) findViewById(R.id.crs2);
        cRs3 = (Chronometer) findViewById(R.id.crs3);
        cRs4 = (Chronometer) findViewById(R.id.crs4);
        cRs5 = (Chronometer) findViewById(R.id.crs5);
        
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
        
        button = (Button) findViewById(R.id.startrs1);
        button.setOnClickListener(LStartRs1);
        button = (Button) findViewById(R.id.stoprs1);
        button.setOnClickListener(LStopRs1);
        button = (Button) findViewById(R.id.resetrs1);
        button.setOnClickListener(LResetRs1);
        
        button = (Button) findViewById(R.id.startrs2);
        button.setOnClickListener(LStartRs2);
        button = (Button) findViewById(R.id.stoprs2);
        button.setOnClickListener(LStopRs2);
        button = (Button) findViewById(R.id.resetrs2);
        button.setOnClickListener(LResetRs2);
        
        button = (Button) findViewById(R.id.startrs3);
        button.setOnClickListener(LStartRs3);
        button = (Button) findViewById(R.id.stoprs3);
        button.setOnClickListener(LStopRs3);
        button = (Button) findViewById(R.id.resetrs3);
        button.setOnClickListener(LResetRs3);
        
        button = (Button) findViewById(R.id.startrs4);
        button.setOnClickListener(LStartRs4);
        button = (Button) findViewById(R.id.stoprs4);
        button.setOnClickListener(LStopRs4);
        button = (Button) findViewById(R.id.resetrs4);
        button.setOnClickListener(LResetRs4);
        
        button = (Button) findViewById(R.id.startrs5);
        button.setOnClickListener(LStartRs5);
        button = (Button) findViewById(R.id.stoprs5);
        button.setOnClickListener(LStopRs5);
        button = (Button) findViewById(R.id.resetrs5);
        button.setOnClickListener(LResetRs5);
        
        ibuttong = (ImageButton) findViewById(R.id.sharegeneral);
        ibuttong.setOnClickListener(LshareGeneral);
        ibuttoneb = (ImageButton) findViewById(R.id.shareeb);
        ibuttoneb.setOnClickListener(LshareEb);
        ibuttonlb = (ImageButton) findViewById(R.id.sharelb);
        ibuttonlb.setOnClickListener(LshareLb);
        ibuttonn1 = (ImageButton) findViewById(R.id.sharen1);
        ibuttonn1.setOnClickListener(LshareN1);
        ibuttonn2 = (ImageButton) findViewById(R.id.sharen2);
        ibuttonn2.setOnClickListener(LshareN2);
        ibuttonn3 = (ImageButton) findViewById(R.id.sharen3);
        ibuttonn3.setOnClickListener(LshareN3);
        ibuttonrs1 = (ImageButton) findViewById(R.id.sharers1);
        ibuttonrs1.setOnClickListener(LshareRs1);
        ibuttonrs2 = (ImageButton) findViewById(R.id.sharers2);
        ibuttonrs2.setOnClickListener(LshareRs2);
        ibuttonrs3 = (ImageButton) findViewById(R.id.sharers3);
        ibuttonrs3.setOnClickListener(LshareRs3);
        ibuttonrs4 = (ImageButton) findViewById(R.id.sharers4);
        ibuttonrs4.setOnClickListener(LshareRs4);
        ibuttonrs5 = (ImageButton) findViewById(R.id.sharers5);
        ibuttonrs5.setOnClickListener(LshareRs5);
       
        ers1 = (EditText) findViewById(R.id.ers1);
        ers2 = (EditText) findViewById(R.id.ers2);
        ers3 = (EditText) findViewById(R.id.ers3);
        ers4 = (EditText) findViewById(R.id.ers4);
        ers5 = (EditText) findViewById(R.id.ers5);
        
        rc1 = (TextView) findViewById(R.id.rc1);
        rc2 = (Chronometer) findViewById(R.id.rc2);
        rc3 = (Chronometer) findViewById(R.id.rc3);
        rc4 = (Chronometer) findViewById(R.id.rc4);
        rc5 = (Chronometer) findViewById(R.id.rc5);
        rc6 = (Chronometer) findViewById(R.id.rc6);
        rc7 = (Chronometer) findViewById(R.id.rc7);
        rc8 = (Chronometer) findViewById(R.id.rc8);
        rc9 = (Chronometer) findViewById(R.id.rc9);
        rc10 = (Chronometer) findViewById(R.id.rc10);
        rc11 = (Chronometer) findViewById(R.id.rc11);
        rc12 = (Chronometer) findViewById(R.id.rc12);
        rc13 = (Chronometer) findViewById(R.id.rc13);
        rc14 = (Chronometer) findViewById(R.id.rc14);
        rc15 = (Chronometer) findViewById(R.id.rc15);
        rc16 = (Chronometer) findViewById(R.id.rc16);
        rc17 = (Chronometer) findViewById(R.id.rc17);
        rc18 = (Chronometer) findViewById(R.id.rc18);
        rc19 = (Chronometer) findViewById(R.id.rc19);
        rc20 = (Chronometer) findViewById(R.id.rc20);
        rc21 = (Chronometer) findViewById(R.id.rc21);
        
        r1 = (LinearLayout) findViewById(R.id.r1);
        r2 = (LinearLayout) findViewById(R.id.r2);
        r3 = (LinearLayout) findViewById(R.id.r3);
        r4 = (LinearLayout) findViewById(R.id.r4);
        r5 = (LinearLayout) findViewById(R.id.r5);
        r6 = (LinearLayout) findViewById(R.id.r6);
        r7 = (LinearLayout) findViewById(R.id.r7);
        r8 = (LinearLayout) findViewById(R.id.r8);
        r9 = (LinearLayout) findViewById(R.id.r9);
        r10 = (LinearLayout) findViewById(R.id.r10);
        r11 = (LinearLayout) findViewById(R.id.r11);
        r12 = (LinearLayout) findViewById(R.id.r12);
        r13 = (LinearLayout) findViewById(R.id.r13);
        r14 = (LinearLayout) findViewById(R.id.r14);
        r15 = (LinearLayout) findViewById(R.id.r15);
        r16 = (LinearLayout) findViewById(R.id.r16);
        r17 = (LinearLayout) findViewById(R.id.r17);
        r18 = (LinearLayout) findViewById(R.id.r18);
        r19 = (LinearLayout) findViewById(R.id.r19);
        r20 = (LinearLayout) findViewById(R.id.r20);
        r21 = (LinearLayout) findViewById(R.id.r21);
        
        counter = (TextView) findViewById(R.id.Tcounter);
        counterbutton = (Button) findViewById(R.id.buttoncounter);
        mincounter = (Button) findViewById(R.id.mincounter);

        r1.setVisibility(View.GONE);
        r2.setVisibility(View.GONE);
        r3.setVisibility(View.GONE);
        r4.setVisibility(View.GONE);
        r5.setVisibility(View.GONE);
        r6.setVisibility(View.GONE);
        r7.setVisibility(View.GONE);
        r8.setVisibility(View.GONE);
        r9.setVisibility(View.GONE);
        r10.setVisibility(View.GONE);
        r11.setVisibility(View.GONE);
        r12.setVisibility(View.GONE);
        r13.setVisibility(View.GONE);
        r14.setVisibility(View.GONE);
        r15.setVisibility(View.GONE);
        r16.setVisibility(View.GONE);
        r17.setVisibility(View.GONE);
        r18.setVisibility(View.GONE);
        r19.setVisibility(View.GONE);
        r20.setVisibility(View.GONE);
        r21.setVisibility(View.GONE);
        
        counterbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	num++;
                counter.setText(Integer.toString(num));
                if(num == 1){
                	r1.setVisibility(View.VISIBLE);
                	rc1.setText(cLectura.getText());
                	rc2.setBase(SystemClock.elapsedRealtime());
                	rc2.start();
                }
                if(num == 2){
                	r2.setVisibility(View.VISIBLE);
                	rc2.stop();
                	rc3.setBase(SystemClock.elapsedRealtime());
                	rc3.start();
                }
                if(num == 3){
                	r3.setVisibility(View.VISIBLE);
                	rc3.stop();
                	rc4.setBase(SystemClock.elapsedRealtime());
                	rc4.start();
                }
                if(num == 4){
                	r4.setVisibility(View.VISIBLE);
                	rc4.stop();
                	rc5.setBase(SystemClock.elapsedRealtime());
                	rc5.start();
                }
                if(num == 5){
                	r5.setVisibility(View.VISIBLE);
                	rc5.stop();
                	rc6.setBase(SystemClock.elapsedRealtime());
                	rc6.start();
                }
                if(num == 6){
                	r6.setVisibility(View.VISIBLE);
                	rc6.stop();
                	rc7.setBase(SystemClock.elapsedRealtime());
                	rc7.start();
                }
                if(num == 7){
                	r7.setVisibility(View.VISIBLE);
                	rc7.stop();
                	rc8.setBase(SystemClock.elapsedRealtime());
                	rc8.start();
                }
                if(num == 8){
                	r8.setVisibility(View.VISIBLE);
                	rc8.stop();
                	rc9.setBase(SystemClock.elapsedRealtime());
                	rc9.start();
                }
                if(num == 9){
                	r9.setVisibility(View.VISIBLE);
                	rc9.stop();
                	rc10.setBase(SystemClock.elapsedRealtime());
                	rc10.start();
                }
                if(num == 10){
                	r10.setVisibility(View.VISIBLE);
                	rc10.stop();
                	rc11.setBase(SystemClock.elapsedRealtime());
                	rc11.start();
                }
                if(num == 11){
                	r11.setVisibility(View.VISIBLE);
                	rc11.stop();
                	rc12.setBase(SystemClock.elapsedRealtime());
                	rc12.start();
                }
                if(num == 12){
                	r12.setVisibility(View.VISIBLE);
                	rc12.stop();
                	rc13.setBase(SystemClock.elapsedRealtime());
                	rc13.start();
                }
                if(num == 13){
                	r13.setVisibility(View.VISIBLE);
                	rc13.stop();
                	rc14.setBase(SystemClock.elapsedRealtime());
                	rc14.start();
                }
                if(num == 14){
                	r14.setVisibility(View.VISIBLE);
                	rc14.stop();
                	rc15.setBase(SystemClock.elapsedRealtime());
                	rc15.start();
                }
                if(num == 15){
                	r15.setVisibility(View.VISIBLE);
                	rc15.stop();
                	rc16.setBase(SystemClock.elapsedRealtime());
                	rc16.start();
                }
                if(num == 16){
                	r16.setVisibility(View.VISIBLE);
                	rc16.stop();
                	rc17.setBase(SystemClock.elapsedRealtime());
                	rc17.start();
                }
                if(num == 17){
                	r17.setVisibility(View.VISIBLE);
                	rc17.stop();
                	rc18.setBase(SystemClock.elapsedRealtime());
                	rc18.start();
                }
                if(num == 18){
                	r18.setVisibility(View.VISIBLE);
                	rc18.stop();
                	rc19.setBase(SystemClock.elapsedRealtime());
                	rc19.start();
                }
                if(num == 19){
                	r19.setVisibility(View.VISIBLE);
                	rc19.stop();
                	rc20.setBase(SystemClock.elapsedRealtime());
                	rc20.start();
                }
                if(num == 20){
                	r20.setVisibility(View.VISIBLE);
                	rc20.stop();
                	rc21.setBase(SystemClock.elapsedRealtime());
                	rc21.start();
                }
                if(num == 21){
                	r21.setVisibility(View.VISIBLE);
                	rc21.stop();
                }
            }
        });
        
        mincounter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num--;
                counter.setText(Integer.toString(num));
            }
        });
      
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
    
    View.OnClickListener LStartRs1 = new OnClickListener() {
        public void onClick(View v) {
        	cRs1.setBase(SystemClock.elapsedRealtime());
        	cRs1.start();
        }
    };
    View.OnClickListener LStopRs1 = new OnClickListener() {
        public void onClick(View v) {
            cRs1.stop();
        }
    };
    View.OnClickListener LResetRs1 = new OnClickListener() {
        public void onClick(View v) {
            cRs1.setBase(SystemClock.elapsedRealtime());
        }
    
    };
    
    View.OnClickListener LStartRs2 = new OnClickListener() {
        public void onClick(View v) {
        	cRs2.setBase(SystemClock.elapsedRealtime());
        	cRs2.start();
        }
    };
    View.OnClickListener LStopRs2 = new OnClickListener() {
        public void onClick(View v) {
            cRs2.stop();
        }
    };
    View.OnClickListener LResetRs2 = new OnClickListener() {
        public void onClick(View v) {
            cRs2.setBase(SystemClock.elapsedRealtime());
        }
    
    };
    
    View.OnClickListener LStartRs3 = new OnClickListener() {
        public void onClick(View v) {
        	cRs3.setBase(SystemClock.elapsedRealtime());
        	cRs3.start();
        }
    };
    View.OnClickListener LStopRs3 = new OnClickListener() {
        public void onClick(View v) {
            cRs3.stop();
        }
    };
    View.OnClickListener LResetRs3 = new OnClickListener() {
        public void onClick(View v) {
            cRs3.setBase(SystemClock.elapsedRealtime());
        }
    
    };
    
    View.OnClickListener LStartRs4 = new OnClickListener() {
        public void onClick(View v) {
        	cRs4.setBase(SystemClock.elapsedRealtime());
        	cRs4.start();
        }
    };
    View.OnClickListener LStopRs4 = new OnClickListener() {
        public void onClick(View v) {
            cRs4.stop();
        }
    };
    View.OnClickListener LResetRs4 = new OnClickListener() {
        public void onClick(View v) {
            cRs4.setBase(SystemClock.elapsedRealtime());
        }
    
    };
    
    View.OnClickListener LStartRs5 = new OnClickListener() {
        public void onClick(View v) {
        	cRs5.setBase(SystemClock.elapsedRealtime());
        	cRs5.start();
        }
    };
    View.OnClickListener LStopRs5 = new OnClickListener() {
        public void onClick(View v) {
            cRs5.stop();
        }
    };
    View.OnClickListener LResetRs5 = new OnClickListener() {
        public void onClick(View v) {
            cRs5.setBase(SystemClock.elapsedRealtime());
        }
    
    };
    
    View.OnClickListener LshareGeneral = new OnClickListener() {
        public void onClick(View v) {
        	Intent i = new Intent(android.content.Intent.ACTION_SEND);
       		i.setType("text/plain");
       		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
       				getResources().getText(R.string.sGeneral) + " " +
       				cGeneral.getText() + "\n" +
       				getResources().getText(R.string.sEB) + " " +
       				cEb.getText() + "\n" +
       				getResources().getText(R.string.sReading) + " " +
       				cLectura.getText() + "\n" +
       				getResources().getText(R.string.sharereply) + " " +
       				counter.getText() + "\n" +
       				getResources().getText(R.string.sN1) + " " +
       				cN1.getText() + "\n" +
       				getResources().getText(R.string.sN2) + " " +
       				cN2.getText() + "\n" +
       				getResources().getText(R.string.sN3) + " " +
       				cN3.getText() + "\n" +
       				getResources().getText(R.string.rs1) + " " +
       				ers1.getText() + ":" +
       				cRs1.getText() + "\n" +
       				getResources().getText(R.string.rs2) + " " +
       				ers2.getText() + ":" +
       				cRs2.getText() + "\n" +
       				getResources().getText(R.string.rs3) + " " +
       				ers3.getText() + ":" +
       				cRs3.getText() + "\n" +
       				getResources().getText(R.string.rs4) + " " +
       				ers4.getText() + ":" +
       				cRs4.getText() + "\n" +
       				getResources().getText(R.string.rs5) + " " +
       				ers5.getText() + ":" +
       				cRs5.getText() + "\n");
       		startActivity(Intent.createChooser(i,"Share via"));
        }
    
    };
    
    View.OnClickListener LshareEb = new OnClickListener() {
        public void onClick(View v) {
        	Intent i = new Intent(android.content.Intent.ACTION_SEND);
       		i.setType("text/plain");
       		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
       				getResources().getText(R.string.sEB) + " " +
       				cEb.getText());
       		startActivity(Intent.createChooser(i,"Share via"));
        }
    
    };
    
    View.OnClickListener LshareLb = new OnClickListener() {
        public void onClick(View v) {
        	Intent i = new Intent(android.content.Intent.ACTION_SEND);
       		i.setType("text/plain");
       		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
       				getResources().getText(R.string.sReading) + " " +
       				cLectura.getText() + "\n" +
       				getResources().getText(R.string.sharereply) + " " +
       				counter.getText());
       		startActivity(Intent.createChooser(i,"Share via"));
        }
    
    };
    
    View.OnClickListener LshareN1 = new OnClickListener() {
        public void onClick(View v) {
        	Intent i = new Intent(android.content.Intent.ACTION_SEND);
       		i.setType("text/plain");
       		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
       				getResources().getText(R.string.sN1) + " " +
       				cN1.getText());
       		startActivity(Intent.createChooser(i,"Share via"));
        }
    
    };
    
    View.OnClickListener LshareN2 = new OnClickListener() {
        public void onClick(View v) {
        	Intent i = new Intent(android.content.Intent.ACTION_SEND);
       		i.setType("text/plain");
       		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
       				getResources().getText(R.string.sN2) + " " +
       				cN2.getText());
       		startActivity(Intent.createChooser(i,"Share via"));
        }
    
    };
    
    View.OnClickListener LshareN3 = new OnClickListener() {
        public void onClick(View v) {
        	Intent i = new Intent(android.content.Intent.ACTION_SEND);
       		i.setType("text/plain");
       		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
       				getResources().getText(R.string.sN3) + " " +
       				cN3.getText());
       		startActivity(Intent.createChooser(i,"Share via"));
        }
    
    };

    View.OnClickListener LshareRs1 = new OnClickListener() {
        public void onClick(View v) {
        	Intent i = new Intent(android.content.Intent.ACTION_SEND);
       		i.setType("text/plain");
       		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
       				getResources().getText(R.string.rs1) + " " +
       				ers1.getText() + ":" +
       				cRs1.getText());
       		startActivity(Intent.createChooser(i,"Share via"));
        }
    
    };
    
    View.OnClickListener LshareRs2 = new OnClickListener() {
        public void onClick(View v) {
        	Intent i = new Intent(android.content.Intent.ACTION_SEND);
       		i.setType("text/plain");
       		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
       				getResources().getText(R.string.rs2) + " " +
       				ers2.getText() + ":" +
       				cRs2.getText());
       		startActivity(Intent.createChooser(i,"Share via"));
        }
    
    };
    
    View.OnClickListener LshareRs3 = new OnClickListener() {
        public void onClick(View v) {
        	Intent i = new Intent(android.content.Intent.ACTION_SEND);
       		i.setType("text/plain");
       		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
       				getResources().getText(R.string.rs3) + " " +
       				ers3.getText() + ":" +
       				cRs3.getText());
       		startActivity(Intent.createChooser(i,"Share via"));
        }
    
    };
    
    View.OnClickListener LshareRs4 = new OnClickListener() {
        public void onClick(View v) {
        	Intent i = new Intent(android.content.Intent.ACTION_SEND);
       		i.setType("text/plain");
       		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
       				getResources().getText(R.string.rs4) + " " +
       				ers4.getText() + ":" +
       				cRs4.getText());
       		startActivity(Intent.createChooser(i,"Share via"));
        }
    
    };
    
    View.OnClickListener LshareRs5 = new OnClickListener() {
        public void onClick(View v) {
        	Intent i = new Intent(android.content.Intent.ACTION_SEND);
       		i.setType("text/plain");
       		i.putExtra(android.content.Intent.EXTRA_TEXT, "" +
       				getResources().getText(R.string.rs5) + " " +
       				ers5.getText() + ":" +
       				cRs5.getText());
       		startActivity(Intent.createChooser(i,"Share via"));
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
        	   try
               { Intent i = new Intent(Intent.ACTION_SEND);  
                 i.setType("text/plain");
                 i.putExtra(Intent.EXTRA_SUBJECT, "Meetings Timer");
                 String mInfo = "\nCheck out the App!\n\n";
                 mInfo = mInfo + "https://play.google.com/store/apps/details?id=org.sferadev.meetings.timer \n\n";
                 i.putExtra(Intent.EXTRA_TEXT, mInfo);  
                 startActivity(Intent.createChooser(i, "Choose App"));
               }
               catch(Exception e)
               { //e.toString();
               }   
           		break;
           		
           		case R.id.about:
      			Intent intent = new Intent(this, AboutActivity.class);
      	        this.startActivity(intent);
      	        break;
   			
   		}
        
        return true;
    }
    
}
