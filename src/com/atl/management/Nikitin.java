package com.atl.management;

import com.atl.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.app.ActionBar;

public class Nikitin extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nikitin);
		ActionBar actionBar;
		actionBar = getActionBar();
		// Change color of ActionBar
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#7C9ED9")));
	}
}