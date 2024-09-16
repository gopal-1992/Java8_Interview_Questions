package com.gopal.logical;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class MySingelton {
    private static MySingelton instance=null;
    
    private MySingelton() {
    	System.out.println("Private Constrctor");
    }
    
    public static MySingelton getInstance() {
    	if(instance==null) {
    		//here we are checking double time in synchronized()
    		synchronized (MySingelton.class) {
    			instance=new MySingelton();
			}
    	 
    	}
		return instance;
    }
    public static void main(String[] args) {
    	MySingelton obj=instance.getInstance();
    	MySingelton obj1=instance.getInstance();
    	MySingelton obj2=instance.getInstance();
    	
    	System.out.println(obj.hashCode());
    	System.out.println(obj1.hashCode());
    	System.out.println(obj2.hashCode());
		
	}
}
