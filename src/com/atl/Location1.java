package com.atl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Location1 extends Activity {
	private GoogleMap googleMap;
	private GoogleMap otherGoogleMap;
	Context context = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.location);

		try {
			initialize();
			googleMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

			otherGoogleMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

			otherGoogleMap.getUiSettings().setZoomControlsEnabled(false);

			otherGoogleMap.setOnMapClickListener(new OnMapClickListener() {

				@Override
				public void onMapClick(LatLng arg0) {
					googleMap
							.setMapType(googleMap.getMapType() == GoogleMap.MAP_TYPE_SATELLITE ? GoogleMap.MAP_TYPE_TERRAIN
									: GoogleMap.MAP_TYPE_SATELLITE);

					otherGoogleMap
							.setMapType(googleMap.getMapType() == GoogleMap.MAP_TYPE_SATELLITE ? GoogleMap.MAP_TYPE_TERRAIN
									: GoogleMap.MAP_TYPE_SATELLITE);

				}
			});

			googleMap.setMyLocationEnabled(true);

			googleMap.getUiSettings().setCompassEnabled(true);

			googleMap.setOnCameraChangeListener(new OnCameraChangeListener() {

				@Override
				public void onCameraChange(CameraPosition p) {
					otherGoogleMap.moveCamera(CameraUpdateFactory
							.newLatLngZoom(new LatLng(p.target.latitude,
									p.target.longitude), p.zoom));

				}
			});

			googleMap.getUiSettings().setZoomControlsEnabled(true);

			googleMap.getUiSettings().setAllGesturesEnabled(true);

			googleMap.getUiSettings().setMyLocationButtonEnabled(true);

			double latitude = 40.387387;
			double longitude = 49.787948;

			MarkerOptions marker = new MarkerOptions().position(
					new LatLng(latitude, longitude)).title(
					"Baku, Azerbaijan, Yasamal d-t, J.Jabbarli 40");
			marker.icon(BitmapDescriptorFactory
					.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));

			googleMap.addMarker(marker);

			googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(
					latitude, longitude), 13));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void onResume() {
		initialize();
		super.onResume();
	}

	@SuppressLint("ShowToast")
	private void initialize() {
		if (googleMap == null) {
			googleMap = ((MapFragment) getFragmentManager().findFragmentById(
					R.id.map)).getMap();
			otherGoogleMap = ((MapFragment) getFragmentManager()
					.findFragmentById(R.id.other_map)).getMap();

			if (googleMap == null || otherGoogleMap == null) {
				Toast.makeText(context, "Sorry! unable to create maps",
						Toast.LENGTH_LONG);
			}

		}

	}

}
