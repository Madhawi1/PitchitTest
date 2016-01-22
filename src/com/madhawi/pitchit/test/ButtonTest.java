package com.madhawi.pitchit.test;

import com.madhawi.pitchit.MainActivity;
import com.madhawi.pitchit.Selection;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class ButtonTest extends ActivityInstrumentationTestCase2<Selection> {

	private Solo solo;
	public ButtonTest() {
		super("com.madhawi.pitchit.test", Selection.class );
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo= new Solo(getInstrumentation(),getActivity());

	}
	
	public void testPlay(){
		solo.searchButton("Listen", true );
		solo.clickOnButton("Listen");
		solo.assertCurrentActivity("Check the listen button", Selection.class);
	}
	public void testTryYourself(){
		solo.searchButton("Try yourself", true );
		solo.clickOnButton("Try yourself");
		solo.assertCurrentActivity("Check the Try yourself button", Selection.class);
	}

	public void testSelectingNotes(){
		solo.clickOnButton("Listen");
		
	}
	public void testToast(){
		solo.waitForText("Done");

		
	}
	
	
	
}
