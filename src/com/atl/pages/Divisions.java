package com.atl.pages;
 
import com.atl.R;
import com.atl.divisions.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View.OnClickListener; 

public class Divisions extends Fragment {

	private ImageView imageView;
	private Activity activity;

	@Override
	public void onAttach(Activity activity) {
		this.activity = activity;
		super.onAttach(activity);
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View divisions = inflater.inflate(R.layout.divisions_frag, container,
				false);
		
		OnClick(divisions);
		return divisions;

	}

	private void OnClick(View v) {

		imageView = (ImageView) v.findViewById(R.id.consulting);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (v.getId() == R.id.consulting) {
					Intent intent = new Intent(activity, Consulting.class);
					startActivity(intent);
				}

			}

		});
		
		imageView = (ImageView) v.findViewById(R.id.electronics);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (v.getId() == R.id.electronics) {
					Intent intent = new Intent(activity, Electronics.class);
					startActivity(intent);
				}

			}

		});
		
		imageView = (ImageView) v.findViewById(R.id.rentacar);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (v.getId() == R.id.rentacar) {
					Intent intent = new Intent(activity, RentACar.class);
					startActivity(intent);
				}

			}

		});
		
		imageView = (ImageView) v.findViewById(R.id.engineering);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (v.getId() == R.id.engineering) {
					Intent intent = new Intent(activity, Engineering.class);
					startActivity(intent);
				}

			}

		});
		
		imageView = (ImageView) v.findViewById(R.id.infotec);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (v.getId() == R.id.infotec) {
					Intent intent = new Intent(activity, InfoTech.class);
					startActivity(intent);
				}

			}

		});
		
		imageView = (ImageView) v.findViewById(R.id.audit);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (v.getId() == R.id.audit) {
					Intent intent = new Intent(activity, Audit.class);
					startActivity(intent);
				}

			}

		});
		

	}
}
