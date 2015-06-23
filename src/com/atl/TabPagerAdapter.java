package com.atl;

import com.atl.pages.Company;
import com.atl.pages.Contact;
import com.atl.pages.Divisions;
import com.atl.pages.Information;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {
	public TabPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int i) {
		switch (i) {
		case 0:
			// Fragment for Company Tab
			return new Company();
		case 1:
			// Fragment for Divisions Tab
			return new Divisions();
		case 2:
			// Fragment for Information Tab
			return new Information(); 
		case 3:
			// Fragment for Contact Tab
			return new Contact();
		} 
			return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 4; // No of Tabs
	}
}