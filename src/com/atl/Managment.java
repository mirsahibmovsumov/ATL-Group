package com.atl;

import com.atl.management.Hajiyev;
import com.atl.management.Mirzayev;
import com.atl.management.Nikitin;
import com.atl.management.Taghiyev;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Managment extends Activity {
	String[] names;
	ListView list;
	String[] posts; 
	final Context context = this; 

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.managment1);
		ActionBar actionBar;
		actionBar = getActionBar();
		// Change color of ActionBar
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#7C9ED9")));

		names = new String[] { "Rashad Mirzayev", "Teymur Hajiyev",
				"Teymur Taghiyev", "Roman Nikitin" };

		posts = new String[] { "CEO", "CMO", "CPMO",
				"Chief of Business Development" };

		final Integer[] imageId = { R.drawable.rashad_mirzayev, R.drawable.hajiyev1, R.drawable.taghiyev,
				R.drawable.nikitin };

		CustomList adapter = new CustomList(Managment.this, names, imageId,
				posts);
		list = (ListView) findViewById(R.id.list);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				switch (position) {
				case 0:
					Intent intent = new Intent(Managment.this, Mirzayev.class);
					startActivity(intent);
					overridePendingTransition(R.anim.push_left_in,
							R.anim.push_up_out);
					break;
				case 1:
					Intent intent1 = new Intent(Managment.this, Hajiyev.class);
					startActivity(intent1);
					overridePendingTransition(R.anim.push_left_in,
							R.anim.push_up_out);
					break;
				case 2:
					Intent intent2 = new Intent(Managment.this, Taghiyev.class);
					startActivity(intent2);
					overridePendingTransition(R.anim.push_left_in,
							R.anim.push_up_out);
					break;	
				case 3:
					Intent intent3 = new Intent(Managment.this, Nikitin.class);
					startActivity(intent3);
					overridePendingTransition(R.anim.push_left_in,
							R.anim.push_up_out);
					break;	

				default:
					break;
				}
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
	      Managment.this.finish();
	   }
}
