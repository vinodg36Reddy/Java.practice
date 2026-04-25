package com.threads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetWithSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> normalSet = new HashSet<>();
	        normalSet.add("Red");
	        normalSet.add("Green");
	        normalSet.add("Blue");

	        Set<String> syncSet = Collections.synchronizedSet(normalSet);

	        // Synchronize during iteration
	        synchronized (syncSet) {
	            Iterator<String> iterator = syncSet.iterator();
	            while (iterator.hasNext()) {
	            	syncSet.add("Yellow");
	                System.out.println(iterator.next());
	            }
	        }
			/*synchronized (syncSet) {
				for (String s : syncSet) {
					syncSet.add("Yellow");
					System.out.println(s + "");
				}
			}*/
	        
	}

}
