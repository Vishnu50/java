package com.mypolymorphism;

public class Animal {
	public void sound(){
	      System.out.println("Animal is making a sound");   
	   }
	}
	
	class Horse extends Animal{
	   public void sound(){
	        System.out.println("Neigh");
	    }
	    public static void main(String args[]){
	    	Animal obj = new Horse();
	    	obj.sound();
	    }
	}

