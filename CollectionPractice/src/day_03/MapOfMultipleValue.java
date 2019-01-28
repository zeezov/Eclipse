package day_03;

import java.util.*;

public class MapOfMultipleValue {
	
public static void main(String[] args) {
        
        // Store students group with members in the map 
        
        Map<String, List<String> > groupMap = new HashMap<>();
        
        List<String> ty1Lst = Arrays.asList("Heydar","Laron","Kosim"); 
        List<String> ty2Lst = Arrays.asList("Esqer","Oguz"); 
        List<String> ty3Lst = Arrays.asList("Dzhamol","Mesut","Shafqat","Ali","Tariq"); 
        
        groupMap.put("Tyson One",     ty1Lst) ; 
        groupMap.put("Tyson Two",     ty2Lst) ; 
        groupMap.put("Tyson Three", ty3Lst) ; 
        
        System.out.println( groupMap.get("Tyson Three") );
        System.out.println( groupMap.get("Tyson Three").get(1) );
        
        /// KEY TYPE CAN NOT BE MUTABLE 
        
        
   //// We want to create a map that contains city as key and coordinates as value
        ///  Vienna, 23.12 - 109.56
//      Map<String, Map<Double,Double> > cityCordMap = new HashMap<>();
//      
//          Map<Double,Double> cord1 = new HashMap<>();
//                          cord1.put(11.00, 23.11); 
//                          
//      cityCordMap.put("Vienna", cord1) ; 
        
        // Stimulate the excel reading by row and by column 
        // WE NEED TO BE ABLE TO GO TO ROW ---> INDEX  LIST 
        // WE NEED TO BE ABLE TO GO TO COLUMN ---SO WE CAN GET VALUE --->  
        
        List< Map<String,String>  > excelSheet = new ArrayList<>();
        
        Map<String,String> cellMap1 = new HashMap<>();
                           cellMap1.put("A", "Adam"); 
                           cellMap1.put("B", "25"); 
                           cellMap1.put("C", "Male");
        
                           excelSheet.add(cellMap1) ; 
                           
        Map<String,String> cellMap2 = new HashMap<>();
                           cellMap2.put("A", "JOHN"); 
                           cellMap2.put("B", "27"); 
                           cellMap2.put("C", "Male");
        
                           excelSheet.add(cellMap2) ; 
                           
        Map<String,String> cellMap3 = new HashMap<>();
                           cellMap3.put("A", "MARY"); 
                           cellMap3.put("B", "22"); 
                           cellMap3.put("C", "Female");
        
                           excelSheet.add(cellMap3) ; 
                           
        System.out.println( excelSheet );
        
        System.out.println( excelSheet.get(2).get("A") );
        
        
        
        
    }

}
