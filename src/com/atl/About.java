package com.atl;

import com.atl.R;  
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.app.ActionBar;

public class About extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		ActionBar actionBar;
		actionBar = getActionBar();
		getActionBar().setDisplayHomeAsUpEnabled(true);
		// Change color of ActionBar
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#7C9ED9")));
	}
	
	@Override
	   public boolean onCreateOptionsMenu(Menu menu) {
	      // Inflate the menu; this adds items to the action bar if it is present.
	      getMenuInflater().inflate(R.menu.main, menu);
	      return true;
	   }  
	   @Override
	   public boolean onOptionsItemSelected(MenuItem item) {
	      switch (item.getItemId()) {
	         // Respond to the action bar's Up/Home button
	         case android.R.id.home:
	         NavUtils.navigateUpFromSameTask(this);
	         return true;
	      }
	      return super.onOptionsItemSelected(item);
	   }
	   @Override
	   public void onBackPressed() {
	      moveTaskToBack(true); 
	      About.this.finish();
	   }
}