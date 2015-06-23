package com.atl.media;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.atl.media.PartnersListAdapter;
import com.atl.R;

public class Partners extends Activity {
	String[] names;
	ListView list;
	final Context context = this;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.partners);
		ActionBar actionBar;
		actionBar = getActionBar();
		getActionBar().setDisplayHomeAsUpEnabled(true);
		// Change color of ActionBar
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#7C9ED9")));

		names = new String[] { "Bosch", "Sharp", "Cisco", "RAD", "Hewlett Packard",
				"Huawei", "Microsoft", "Oracle", "Juniper", "Syscon", "Pelco" };

		final Integer[] imageId = { R.drawable.bosch, R.drawable.sharp,
				R.drawable.cisco, R.drawable.rad, R.drawable.hp,
				R.drawable.huawei, R.drawable.microsoft, R.drawable.oracle,
				R.drawable.juniper, R.drawable.syscon, R.drawable.pelco };

		PartnersListAdapter adapter = new PartnersListAdapter(Partners.this,
				names, imageId);
		list = (ListView) findViewById(R.id.list);
		list.setAdapter(adapter);

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		// Respond to the action bar's Up/Home button
		case android.R.id.home:
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
