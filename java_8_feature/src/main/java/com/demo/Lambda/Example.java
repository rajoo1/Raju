package com.demo.Lambda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Drawable{  
    public void draw();  
}  
interface Sayable {  
    public String say();  
}
interface Sayable1 {  
    public String say(String name);  
}
interface Sayable2 {  
    public int add(int a1,int b1);  
}

public class Example {
public static void main(String[] args) {
	
	//1.
/*==================================================================*/
	 final int width=10;  
	  
     //without lambda, Drawable implementation using anonymous class  
     Drawable d=new Drawable(){  
         public void draw(){System.out.println("Drawing "+width);}  
     };  
     d.draw(); 
     
     //2.
/*=================================================================*/
      //@FunctionalInterface  //It is optional
     //with lambda  
     Drawable d2=()->{  
         System.out.println("Drawing "+width);  
     };  
     d2.draw();  
/*=================================================================*/
     Sayable s=()->{  
         return "I have nothing to say.";  
     };  
     System.out.println(s.say());       
/*=================================================================*/
     Sayable1 a=(name)->{
		return "HI..."+name;
     };
     System.out.println(a.say("RAJU"));
/*=================================================================*/
     Sayable1 b=name->{
 		return "Hello..."+name;
      };
      System.out.println(b.say("RAJU"));
/*=================================================================*/
      Sayable2 c=(a1,b1)->(a1+b1);
        System.out.println(c.add(10,20));
/*=================================================================*/
        Sayable2 e=(int a1,int b1)->(a1+b1);
        System.out.println(e.add(20,20));
/*=================================================================*/
        Sayable2 f=(int a1,int b1)->{
			return a1+b1;
        };
        System.out.println(f.add(50, 50));
/*=================================================================*/
        List<String>l=new ArrayList<String>();
        l.add("RAJU");
        l.add("KUMAR");
        l.add("MAHTO");
        l.forEach((n)->{
        	System.out.println(n);	
        }
        
        //System.out.println(n)
        
        );
     /*=================================================================*/
     /*=================================================================*/
     /*=================================================================*/
     /*=================================================================*/
     /*=================================================================*/
     /*=================================================================*/
     /*=================================================================*/
     /*=================================================================*/
     
}
}
