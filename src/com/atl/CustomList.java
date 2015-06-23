package com.atl;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomList extends ArrayAdapter<String> {
	private final Activity context;
	private final String[] names;
	private final String[] posts;
	private final Integer[] imageId;

	public CustomList(Activity context, String[] names, Integer[] imageId,
			String[] posts) {
		super(context, R.layout.manage, names);
		this.context = context;
		this.names = names;
		this.imageId = imageId;
		this.posts = posts;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.manage, null, true);
		TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
		TextView post = (TextView) rowView.findViewById(R.id.post);
		txtTitle.setText(names[position]);
		post.setText(posts[position]);
		imageView.setImageResource(imageId[position]);
		return rowView;
	}
}