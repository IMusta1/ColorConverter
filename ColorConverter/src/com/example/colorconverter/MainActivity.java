package com.example.colorconverter;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
//import android.text.Editable;

//import android.view.Menu;
import android.view.View;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import java.util.*;

public class MainActivity extends Activity 
{
	    EditText showResult;
	    EditText displayResult;
	   
	    @Override
	    public void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	      
	        showResult = (EditText)findViewById(R.id.result_id);
	        displayResult = (EditText)findViewById(R.id.display_id);
	    }   

    public void buttonColorClicked(View v){
    //try {
    	 	Context context = getApplicationContext();
    	 	
		    CharSequence textFailColor = "Color Conversion >>> FAIL- Please check your input for accuracy, press the correct button and try again.";
		    CharSequence textSuccessColor = "Color Conversion >>> SUCCESS!!! ";

		    int durationLong = Toast.LENGTH_LONG;
		    int durationShort = Toast.LENGTH_SHORT;
		    
		    Toast toastFail = Toast.makeText(context, textFailColor, durationLong);
		    Toast toastSuccess = Toast.makeText(context, textSuccessColor, durationShort);

		    toastFail.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		    toastSuccess.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
    		
    		String input = showResult.getText().toString();
  		    //displayResult.setText(convertToColorOrHex(input));
    		if(input.equalsIgnoreCase("FF0000"))
    		{
    		displayResult.setText("red");
			toastSuccess.show();	
    		}
    		else if (input.equalsIgnoreCase("000000"))
    		{
    			displayResult.setText("black");
    			toastSuccess.show();	
    		}
    		else if (input.equalsIgnoreCase("808080"))
    		{
    			displayResult.setText("gray");
    			toastSuccess.show();	
    		}
      	    else if (input.equalsIgnoreCase("C0C0C0"))
    		{
    			displayResult.setText("silver");
    			toastSuccess.show();	
    		}
    		else if (input.equalsIgnoreCase("FFFFFF"))
    		{
    			displayResult.setText("white");
    			toastSuccess.show();	
    		}
    		else if (input.equalsIgnoreCase("FFFF00"))
    		{
    			displayResult.setText("yellow");
    			toastSuccess.show();	
    		}
    		else if (input.equalsIgnoreCase("008000"))
    		{
    			displayResult.setText("green");
    			toastSuccess.show();	
    		}
    		else if (input.equalsIgnoreCase("0000FF"))
    		{
    			displayResult.setText("blue");
    			toastSuccess.show();	
    		}
    		else if (input.equalsIgnoreCase("800080"))
    		{
    			displayResult.setText("purple");
    			toastSuccess.show();	
    		}
    		else if (input.equalsIgnoreCase("00FFFF"))
    		{
    			displayResult.setText("aqua");
    			toastSuccess.show();	
    		}
    		else if (input.equalsIgnoreCase("49C113"))
    		{
    			displayResult.setText("brown");
    			toastSuccess.show();	

    		}
    		else if (input.equalsIgnoreCase("FFA500"))
    		{
    			displayResult.setText("orange");
    			toastSuccess.show();	
    		}
    		else
    		{
    			toastFail.show();
    			displayResult.setText("");
    		}
    }
		//} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}
	//}
     public void buttonHexClicked(View v){
    	//try {
    	 	Context context = getApplicationContext();
 	 	
		    CharSequence textFailHex = "Hex Conversion >>> FAIL- Please check your input for accuracy, press the correct button and try again.";
		    CharSequence textSuccessHex = "Hex Conversion >>> SUCCESS!!! ";

		    int durationLong = Toast.LENGTH_LONG;
		    int durationShort = Toast.LENGTH_SHORT;

		    Toast toastFail = Toast.makeText(context, textFailHex, durationLong);
		    Toast toastSuccess = Toast.makeText(context, textSuccessHex, durationShort);

		    toastFail.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		    toastSuccess.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);

		    
		    String input = showResult.getText().toString();
		  //displayResult.setText(convertToColorOrHex(input));
    		if (input.equalsIgnoreCase("red"))
    		{
    			displayResult.setText("FF0000");
    			toastSuccess.show();
    		}
    		else if (input.equalsIgnoreCase("black"))
    		{
    			displayResult.setText("000000");
    			toastSuccess.show();
    		}
        	else if (input.equalsIgnoreCase("gray"))
    		{
    			displayResult.setText("808080");
    			toastSuccess.show();
    	    }
    		else if (input.equalsIgnoreCase("silver"))
    		{
    			displayResult.setText("C0C0C0");
    			toastSuccess.show();
    		}
    		else if (input.equalsIgnoreCase("white"))
    		{
    			displayResult.setText("FFFFFF");
    			toastSuccess.show();
    		}
    		else if (input.equalsIgnoreCase("yellow"))
    		{
    			displayResult.setText("FFFF00");
    			toastSuccess.show();
    		}
    		else if (input.equalsIgnoreCase("green"))
    		{
    			displayResult.setText("008000");
    			toastSuccess.show();
    		}
    		else if (input.equalsIgnoreCase("blue"))
    		{
    			displayResult.setText("0000FF");
    			toastSuccess.show();
    		}
    		else if (input.equalsIgnoreCase("purple"))
    		{
    			displayResult.setText("800080");
    			toastSuccess.show();
    		}
    		else if (input.equalsIgnoreCase("aqua"))
    		{
    			displayResult.setText("00FFFF");
    			toastSuccess.show();
    		}
    		else if (input.equalsIgnoreCase("brown"))
    		{
    			displayResult.setText("49C113");
    			toastSuccess.show();
    		}
    		else if (input.equalsIgnoreCase("orange"))
    		{
    			displayResult.setText("FFA500");
    			toastSuccess.show();
    		}
    		else
    		{
    			toastFail.show();
    			displayResult.setText("");
    		}
     }
		//} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		
    public void result_idClicked(View v) 
    {
    	showResult.setText("");
    	displayResult.setText("");
    }
    
    public void display_idClicked(View v) 
    {
    	showResult.setText("");
    	displayResult.setText("");
    }
    
	public static String convertToColorOrHex(String userInput) 
	{
	String value = Hashh.color_map.get(userInput); 
	return(value); 
	}
}
