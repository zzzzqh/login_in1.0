package com.example.t_login_in;

import com.example.t_login_in.MainActivity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends Activity {
	private Button login_btn;
	private EditText login_input_name,login_input_password;
	private CheckBox login_switch;
	private ImageView joy;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        login_btn = (Button) findViewById (R.id.login_btn);
     
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        login_btn.setOnClickListener(new OnClickListener(){
       	 
        	  public void onClick(View v) {
        	        
        	        //do something
        	                Intent intent=new Intent(MainActivity.this,tlogin_in_activity.class);
        	                MainActivity.this.startActivity(intent);
        	                }
        	        
        	            });
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
