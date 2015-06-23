package com.atl.media;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.atl.R;

class PartnersListAdapter extends ArrayAdapter<String> {
	private final Activity context;
	private final String[] names;
	private final Integer[] imageId;

	public PartnersListAdapter(Activity context, String[] names,
			Integer[] imageId) {
		super(context, R.layout.partners_row_list, names);
		this.context = context;
		this.names = names;
		this.imageId = imageId;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.partners_row_list, null, true);
		TextView txtTitle = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		txtTitle.setText(names[position]);
		imageView.setImageResource(imageId[position]);
		return rowView;
	}
}