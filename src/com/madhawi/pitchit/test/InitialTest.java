package com.madhawi.pitchit.test;

import com.madhawi.pitchit.MainActivity;
import com.madhawi.pitchit.Selection;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class InitialTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private Solo solo;
	public InitialTest() {
		super("com.madhawi.pitchit.test", MainActivity.class );
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo= new Solo(getInstrumentation(),getActivity());
	}

	public void testInitialActivity(){
		
		solo.assertCurrentActivity("Check the initial activity", MainActivity.class);
	}
	
}
