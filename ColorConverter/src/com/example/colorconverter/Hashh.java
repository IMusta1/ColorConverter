package com.example.colorconverter;

import java.util.*;

public class Hashh
{
	public static Map<String, String>color_map = new HashMap<String, String>();
    {
    	//Hex to Color
    	 color_map.put("000000", "black");
      	 color_map.put("808080", "gray");
      	 color_map.put("C0C0C0", "silver");
      	 color_map.put("FFFFFF", "white");
      	 color_map.put("800000", "maroon");
      	 color_map.put("FF0000", "red");
      	 color_map.put("FFFF00", "yellow");
      	 color_map.put("008000", "green");
      	 color_map.put("0000FF", "blue");
      	 color_map.put("800080", "purple");
      	 color_map.put("00FFFF", "aqua");
      	 color_map.put("00FF00", "lime");
      	 color_map.put("49C113", "brown");
      	 color_map.put("FFA500", "orange");
      	 color_map.put("63C3E7", "neon blue");
      	 color_map.put("CC66FF", "neon purple");
      	
      	 // Color to Hex
      	 color_map.put("black", "000000");
      	 color_map.put("gray", "808080");
      	 color_map.put("Silver", "C0C0C0");
      	 color_map.put("white", "FFFFFF");
      	 color_map.put("maroon", "800000");
      	 color_map.put("red", "FF0000");
      	 color_map.put("yellow", "FFFF00");
      	 color_map.put("green", "0080000");
      	 color_map.put("blue", "0000FF");
      	 color_map.put("purple", "800080");
      	 color_map.put("aqua", "00FFFF");
      	 color_map.put("lime", "00FF00");
      	 color_map.put("brown", "49C113");
      	 color_map.put("orange", "FFA500");
      	 color_map.put("neon blue", "63C3E7");
     	 color_map.put("neon purple", "CC66FF");
    }
}

