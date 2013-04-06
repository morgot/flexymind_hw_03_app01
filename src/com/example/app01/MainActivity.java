package com.example.app01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	// Переход на страницу регистрации
	
	public void goToRegistrationActivity( View view){
		Intent intent = new Intent ( this, RegistrationActivity.class);
		startActivity(intent);
	}
	 public void finishMainActivity(View v) {
	        MainActivity.this.finish();
	    }
}
