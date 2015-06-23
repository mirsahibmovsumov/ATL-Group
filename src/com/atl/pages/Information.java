package com.atl.pages;

import com.atl.R;
import com.atl.media.Partners;
import com.atl.media.gallary.GridViewActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Information extends Fragment {

	private Activity activity;
	private ImageView imageView;

	@Override
	public void onAttach(Activity activity) {
		this.activity = activity;
		super.onAttach(activity);
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View media = inflater.inflate(R.layout.info_frag, container, false);
		onClick(media);
		return media;

	}

	private void onClick(View v) {
		imageView = (ImageView) v.findViewById(R.id.photo_gallary);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (v.getId() == R.id.photo_gallary) {
					Intent intent = new Intent(activity, GridViewActivity.class);
					startActivity(intent);
				}
			}
		});

		imageView = (ImageView) v.findViewById(R.id.partners_converted);
		imageView.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (v.getId() == R.id.partners_converted) {
					Intent intent = new Intent(activity, Partners.class);
					startActivity(intent);
				}
			}
		});

	}

}
