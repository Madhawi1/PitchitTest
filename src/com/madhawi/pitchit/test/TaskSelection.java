package com.madhawi.pitchit.test;

import com.madhawi.pitchit.Selection;


import android.test.ActivityInstrumentationTestCase2;

public class TaskSelection extends ActivityInstrumentationTestCase2<Selection> {

	private  Selection selection = new Selection();
	   
	protected void setUp() throws Exception {
		super.setUp();
	}
	public TaskSelection() {
		super("com.madhawi.pitchit.test", Selection.class );
		// TODO Auto-generated constructor stub
	}

    public void testGetFrequencyC() { 
    
    double expected = selection.getFrequency('C'); 
    assertEquals(expected, 261.63);
  
    }
    public void testGetFrequencyD() { 
     
    	double expected = selection.getFrequency('D'); 
        assertEquals(expected, 293.66);
      
      
    }
    public void testGetFrequencyE() { 
        
        double expected = selection.getFrequency('E'); 
        assertEquals(expected, 329.63);
      
      
    } public void testGetFrequencyF() { 
        
        double expected = selection.getFrequency('F'); 
        assertEquals(expected, 349.23);
      
      
    } public void testGetFrequencyG() { 
        
        double expected = selection.getFrequency('G'); 
        assertEquals(expected, 392.00);
      
      
    } public void testGetFrequencyA() { 
        
        double expected = selection.getFrequency('A'); 
        assertEquals(expected, 440.0);
      
      
    } public void testGetFrequencyB() { 
        
        double expected = selection.getFrequency('B'); 
        assertEquals(expected, 493.88);
      
      
    }
    }
