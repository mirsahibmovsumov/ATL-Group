package com.atl.pages;

import com.atl.Location1;
import com.atl.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent; 
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class Contact extends Fragment {

	ImageView imageView;
	private Activity activity;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View contact = inflater
				.inflate(R.layout.contact_frag, container, false);
		onClick(contact);
		return contact;

	}

	@Override
	public void onAttach(Activity activity) {
		this.activity = activity;
		super.onAttach(activity);
	}

	private void onClick(View contact) {
		final EditText editName = (EditText) contact.findViewById(R.id.name);
		final EditText editText2 = (EditText) contact
				.findViewById(R.id.editText2);
		final EditText editText3 = (EditText) contact
				.findViewById(R.id.editText3);
		final EditText email = (EditText) contact.findViewById(R.id.email);
		imageView = (ImageView) contact.findViewById(R.id.send);
		imageView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String name;
				name = editName.getText().toString();
				if (name == null || name.equals("")) {
					editName.requestFocus();
					editName.setError("Please enter your name");

				}

				if (editText2.getText().toString() == null
						|| editText2.getText().toString().equals("")) {
					editText2.requestFocus();
					editText2.setError("Please enter your company name");
				}

				if (editText3.getText().toString() == null
						|| editText3.getText().toString().equals("")) {
					editText3.requestFocus();
					editText3.setError("Please enter your message");
				}

				if (email.getText().toString() == null
						|| email.getText().toString().equals("")) {
					email.requestFocus();
					email.setError("Please enter your Email");
				}

				Toast.makeText(
						activity,
						"Your name " + name + "\n" + "Your email "
								+ email.getText().toString(),
						Toast.LENGTH_SHORT).show();
			}
		});
		editName.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				editName.setError(null);

			}

		});

		editText2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				editText2.setError(null);

			}
		});

		editText3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				editText3.setError(null);

			}
		});

		imageView = (ImageView) contact.findViewById(R.id.contact);
		imageView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						activity);

				// set title
				alertDialogBuilder.setTitle("Contact with us");

				// set dialog message
				alertDialogBuilder
						.setMessage(
								"Adress"
										+ "\n"
										+ "Baku, Azerbaijan, AZ1065, Yasamal d-t, J.Jabbarli 40 "
										+ "\n" + "Fax: 00 994 12 497 12 27  \n"
										+ "Phone: 00 994 12 497 12 27" + "\n"
										+ "Email: office@atl.az" + "\n"
										+ "Skype: atlgroup")
						.setCancelable(false)
						.setPositiveButton("Ok",
								new DialogInterface.OnClickListener() {
									public void onClick(DialogInterface dialog,
											int id) {
										// if this button is clicked, close
										// current activity
									}
								});

				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();

				// show it
				alertDialog.show();
			}
		});

		imageView = (ImageView) contact.findViewById(R.id.location);
		imageView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (v.getId() == R.id.location) {
					Intent intent = new Intent(activity, Location1.class);
					startActivity(intent);
				}
			}
		});

	}
}
