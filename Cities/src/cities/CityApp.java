/******************************************************************************
 *       1000 largest US Cities
 *       
 *       Each city has name, population, latitude, longitude, rank, and state
 *       You implement code to find the given city's population, rank, state,
 *       calculate the distance between two cities etc. 
 *
 ******************************************************************************/

package cities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class CityApp {
	
	private City[] cityList;		//This array holds all city objects
	private int N = 1000;  // number of cities
	
	public CityApp(){
		cityList = new City[N];
		String path = System.getProperty("user.dir");
		loadCities(path+"/data/cities.txt");	
	}
	
	/**
	 * This method loads the words from a given file
	 * @param fileName	input file name
	 * DO NOT CHANGE THIS METHOD
	 */
	private void loadCities(String fileName){	
		// This will reference one line at a time
        String line = null;
        int count = 0;
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
            	if(line.startsWith("#")) continue;
            	String[] c = line.split(",");
            	String name = c[0];
            	double latitude = Double.parseDouble(c[2]);
            	double longitude = Double.parseDouble(c[3]);
            	int population = Integer.parseInt(c[4]);
            	int rank = Integer.parseInt(c[5]);
            	String state = c[6];
            	City ct = new City(name, latitude,longitude, population, rank,state);
            	cityList[count++] = ct;
            }   
            // Always close files.
            bufferedReader.close(); 
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'"); 
        }
	}
	
	
	public static void main(String[] args) {
		CityApp c = new CityApp();
		int p = c.population("chicago");
		System.out.println("Population of Chicago: " + p);
		int d = (int) c.distance("Chicago", "New York");
		System.out.println("Distance between Chicago and New York:" + d + " miles");
		
		String city = c.cityByRank(4);
		System.out.println("The 4th largest city in USA is " + city);
		
		int count = c.CitiesInState("california");
		System.out.println("Number of large cities in California:" + count);
	}
	
	
	
	/**
	 * Convert the first letter of each word in a string to upper case.
	 * words are delimited by a space.
	 * Leading and trailing space must be deleted.
	 * All city names in our list are camel cased.
	 * For example:
	 * 	input: my name is alice.
	 *  output: My Name Is Alice.
	 * 
	 * camelCase("java is fun") -> "Java Is Fun"
	 * 
	 * @param in: input string
	 * @return a string in which the first letter of each word is converted to upper-case.
	 */
	public String camelCase(String in){
		
		//TODO
		
		String[] word = in.split(" ");
		String upperCase = "";
		
		for (String n : word) {
			n = n.substring(0,1).toUpperCase() + n.substring(1);
			upperCase += n + " ";
		}
		
		return upperCase = upperCase.trim();
	}
	
	/**
	 * Get the population of a given city. 
	 * 
	 * PLEASE USE cityList ARRAY. It is already declared and 
	 * already holds all the city objects
	 * 
	 * . 
	 * For example:  
	 * 		City c = citiList[0];  //c is first city in the array.
	 *  	c.population   // population of this city
	 *  	c.rank			// rank of the city
	 *  	c.state        //state of the city
	 * 
	 * population("New York") -> 8405837
	 * population("Chicago") -> 2718782
	 * population("Invalid City") -> -1
	 * 
	 * @param city: name of the city
	 * @return population of the city. -1 if the city does not exist
	 */
	public int population(String city){

		//TODO
		
		for (int i = 0; i < cityList.length; i++) {
			if(cityList[i].name.equalsIgnoreCase(city)) {
				return cityList[i].population;
			}
		}
		
		return -1;  
	}
	
	
	/**
	 * This course project is copyright of CyberTek ©CyberTek[2017]. All rights reserved. 
	 * Any redistribution or reproduction of part or all of the contents in any form is 
	 * prohibited without the express consent of CyberTek.
	 */
	
	/**
	 * Get the State of a given city belongs to
	 * 
	 * 
	 * PLEASE USE cityList ARRAY. It is already declared and 
	 * already holds all the city objects
	 * 
	 * 
	 * @param name: name of the city
	 * @return the state, to which the city belongs to. 
	 * Returns null if the city does not exist.
	 * For example:
	 * 	input: Alexandria
	 *  Output: Virginia
	 *  
	 *  state("Alexandria") -> "Virginia"
	 *  state("Chicago") -> "Illinois"
	 *  state("Invalid City") -> null
	 *  
	 */
	public String state(String city){
		//TODO
		
		for (int i = 0; i < cityList.length; i++) {
			if(cityList[i].name.equalsIgnoreCase(city)) {
				return cityList[i].state;
			}
		}
		
		return null;
	}
	
	
	
	/**
	 * Find the city based on its rank
	 * @param rank: rank n represents it is nth largest city in US 
	 * @return the city name
	 * 
	 * cityByRank(3) -> "Chicago"
	 * 
	 */
	public String cityByRank(int rank){
		//TODO
		
		for (int i = 0; i < cityList.length; i++) {
			if(cityList[i].rank == rank) {
				return cityList[i].name;
			}
			
		}
		
		return null;
	}
	
	/**
	 * Count the cities in a given state
	 * @param state
	 * @return: number of large cities in this state
	 * 
	 * CitiesInState("maryland") -> 7
	 * CitiesInState("maine") -> 1
	 * 
	 */
	public int CitiesInState(String state){
		//TODO
		
		int count = 0;
		
		for (int i = 0; i < cityList.length; i++) {
			if(cityList[i].state.equalsIgnoreCase(state)) {
				count++;
			}
			
		}
		return count;
		
		
		//return -1;
	}
	
	
	/**
	 * Get the latitude of a given city
	 * 
	 * PLEASE USE cityList ARRAY. It is already declared and 
	 * already holds all the city objects
	 * 
	 * @param city: input 
	 * @return the latitude of the city
	 * 
	 * latitude("Chicago") -> 41.8781136
	 * latitude("Invalid City") -> -1
	 * 
	 */
	public double latitude(String city){
		//TODO
		
		for (int i = 0; i < cityList.length; i++) {
			if(cityList[i].name.equalsIgnoreCase(city)) {
				return cityList[i].latitude;
			}
				
		}
		
		return -1;
	}
	
	/**
	 * Get the longitude of a given city
	 * 
	 *  PLEASE USE cityList ARRAY. It is already declared and 
	 * already holds all the city objects
	 * 
	 * @param city: input 
	 * @return the longitude of the city
	 * 
	 * latitude("Chicago") -> -87.6297982
	 * latitude("Invalid City") -> -1
	 * 
	 */
	public double longitude(String city){
		//TODO
		
		for (int i = 0; i < cityList.length; i++) {
			if(cityList[i].name.equalsIgnoreCase(city)) {
				return cityList[i].longitude;
			}
				
		}
		
		
		return -1;
	}
	
	/**
	 *  R = 3961;
	 * dlon = lon2 - lon1
		dlat = lat2 - lat1
		a = (sin(dlat/2))^2 + cos(lat1) * cos(lat2) * (sin(dlon/2))^2
	   c = 2 * atan2( sqrt(a), sqrt(1-a) )
	   d = R * c (where R is the radius of the Earth) 
		
		Refer here to test:
		https://andrew.hedges.name/experiments/haversine/

	   sin,cos, atan, and sqrt are in Math library. So you call them 
	   as Math.sin(), Math.sqrt etc
	   
	    Math.sin takes an angle, in radians. So you have to convert the 
	    sin(lat1) shoud be called as Math.sin(Math.toRadians(dlat / 2))
	    x^2  can be called as Math.pow(x,2)
	    
	    
	*/
/**
	 * @param c1: start city
	 * @param c2: destination city
	 * @return the distance between the two cities.
	 */
	public double distance(String c1, String c2){
		//TODO
		
		c1 = camelCase(c1);
		c2 = camelCase(c2);
		int R = 3961;
		double lon1 = longitude(c1);
		double lon2 = longitude(c2);
		double lat1 = latitude(c1);
		double lat2 = latitude(c2);

		double dlon = longitude(c2) - longitude(c1);

		double dlat = latitude(c2) - latitude(c1);

		double a = Math.pow(Math.sin(Math.toRadians(dlat / 2)), 2) + Math.cos(Math.toRadians(lat1))
				* Math.cos(Math.toRadians(lat2)) * Math.pow(Math.sin(Math.toRadians(dlon / 2)), 2);

		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		double d = R * c;

		return d;
		
		//return 0;
	}
	
	

}
