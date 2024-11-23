package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorVsEnumeration {
	
	public static void main(String[] args){
        Vector v=new Vector();
        Object element;
        Enumeration<Object> enums;
        Iterator iter;
        long start;
        
        for(int i=0; i<1000000; i++){
            v.add("New Element");
        }
        
        enums=v.elements();
        iter=v.iterator();
        //*****CODE BLOCK FOR ITERATOR**********************
        start=System.currentTimeMillis();
        while(iter.hasNext()){
            element=iter.next();
        }
        System.out.println("Iterator took " + (System.currentTimeMillis()-start));
        //*************END OF ITERATOR BLOCK************************
        
        System.gc();   //request to GC to free up some memory
        //*************CODE BLOCK FOR ENUMERATION*******************
        start=System.currentTimeMillis();
        while(enums.hasMoreElements()){
            element=enums.nextElement();
        }
        System.out.println("Enumeration took " + (System.currentTimeMillis()-start));
        //************END OF ENUMERATION BLOCK**********************
    }

}
