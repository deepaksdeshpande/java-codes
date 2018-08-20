/**
 * 
 */
package collections;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * @author Deepak Deshpande
 *
 */
public class HashTestSort {
    
    private String str;
    
    public HashTestSort(String str) {
        this.str = str;
    }
    
    @Override
    public String toString() {
        return this.str;
    }
        
    public static void main(String args[]) {
        HashTestSort h1 = new HashTestSort("2");        
        String s1 = new String("1");        
        
        List<Object> list = new LinkedList<Object>();
        list.add(h1);
        list.add(s1);
        
       // Collections.sort(list);
        //comparator has to be used
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}