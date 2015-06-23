package com.atl.pages;

import com.atl.About;
import com.atl.Managment;
import com.atl.OurMission;
import com.atl.OurVision;
import com.atl.R;
import com.atl.CEOMessage;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Company extends Fragment {

	private Button imageView;
	private Activity activity;

	@Override
	public void onAttach(Activity activity) {
		this.activity = activity;
		super.onAttach(activity);
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View company = inflater
				.inflate(R.layout.company_frag, container, false);
		onClick(company);
		return company;

	}

	private void onClick(View v) {
		// when click to the about imageView
		imageView = (Button) v.findViewById(R.id.about);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				switch (v.getId()) {
				case R.id.about:

					Intent intent = new Intent(activity, About.class);
					startActivity(intent);
				}

			}
		});
		// when click to the management imageView
		imageView = (Button) v.findViewById(R.id.managment);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				switch (v.getId()) {
				case R.id.managment:
					Intent intent2 = new Intent(activity, Managment.class);
					startActivity(intent2);

				}

			}
		});

		imageView = (Button) v.findViewById(R.id.ceo_message);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (v.getId() == R.id.ceo_message) {
					Intent intent2 = new Intent(activity, CEOMessage.class);
					startActivity(intent2);
				}

			}
		});

		imageView = (Button) v.findViewById(R.id.our_mission);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (v.getId() == R.id.our_mission) {
					Intent intent2 = new Intent(activity, OurMission.class);
					startActivity(intent2);
				}

			}
		});

		imageView = (Button) v.findViewById(R.id.our_vision);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (v.getId() == R.id.our_vision) {
					Intent intent2 = new Intent(activity, OurVision.class);
					startActivity(intent2);
				}

			}
		});

	}

}
