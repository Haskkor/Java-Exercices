import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import java.util.ArrayList;

import java.util.Enumeration;
import java.util.Hashtable;

public class Test 
{
	
    public static void main(String[] args) 	
    {
    	listeChainee();
    	listeTableau();
    	tableHachage();
    }
	
    public static void listeChainee() 
    {       
        List l = new LinkedList();
        l.add(666);
        l.add("Satan");
        l.add(666.66f);
        
        for(int i = 0; i < l.size(); i++)
                System.out.println("Élément à l'index " + i + " = " + l.get(i));
        
        System.out.println("Itérateur : ");
        ListIterator li = l.listIterator();
        
        while(li.hasNext())
                System.out.println(li.next());
    }    
    
    public static void listeTableau() 
    {
        ArrayList al = new ArrayList();
        al.add(12);
        al.add("Une chaîne de caractères.");
        al.add(12.20f);
        al.add('d');
        
        for(int i = 0; i < al.size(); i++)
        {
                System.out.println("Donnée à l'indice " + i + " = " + al.get(i));
        }   
    }
    
    public static void tableHachage() 
    {  
        Hashtable ht = new Hashtable();
        ht.put(1, "printemps");
        ht.put(10, "été");
        ht.put(12, "automne");
        ht.put(45, "hiver");
                
        Enumeration e = ht.elements();
                
        while(e.hasMoreElements())
            System.out.println(e.nextElement());       
    }
}


