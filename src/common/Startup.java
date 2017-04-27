package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author agnas
 */
public class Startup {

    public static void main(String[] args) {

        //Lab 2
        Movie movieOne = new Movie("005", "Hello World", "Bob Jones");
        Movie movieTwo = new Movie("005", "Outer Space", "Sally Johnson");
        Movie movieThree = new Movie("004", "Cool Movie", "Terry Smith");
        Movie movieFour = new Movie("001", "Nice One", "Linda Newhart");

        //store in a hash map
        Map<String, Movie> movieMap = new HashMap<>();
        movieMap.put("005", movieOne);
        movieMap.put("005", movieTwo);
        movieMap.put("004", movieThree);
        movieMap.put("001", movieFour);

        //show that the individual items can be found by key value
        //how come the duplicate is not showing? (just curious)
        Movie movie = movieMap.get("005");
        System.out.println("Found an individual movie: ");
        System.out.println(movie);

        //loop through all of the keys of the movie map and display all
        Set<String> movieKeys = movieMap.keySet();
        System.out.println("\nFound all of the movies (no duplicates): ");
        for (String keys : movieKeys) {
            Movie foundMovie = movieMap.get(keys);
            System.out.println(foundMovie);
        }

        //Lab 3
        Map<String, Movie> treeMovieMap = new TreeMap<>(movieMap);

        //sort by the keys
        Set<String> treeMovieKeys = treeMovieMap.keySet();
        System.out.println("\nTree Map sorted by keys: ");
        for (String keysTwo : treeMovieKeys) {
            Movie foundMovieTwo = movieMap.get(keysTwo);
            System.out.println(foundMovieTwo.toString());
        }

        //sort by the values
        Collection<Movie> treeMovieValues = treeMovieMap.values();
        List<Movie> sortListByValues = new ArrayList<>(treeMovieValues);
        
        /////////////////
        //I have some problems here with lab 3 so I commented it out. 
        //Says Movie can't be converted to String
        /////////////////
//        Collections.sort(sortListByValues);
//
//        //loop through and output
//        System.out.println("\nTree Map sorted by values: ");
//        for (Movie valueSort : sortListByValues) {
//            System.out.println(valueSort);
//        }

        //Lab 4
        //sort by Movie Title using a comparator using the same collection and list above
        Collections.sort(sortListByValues, new MovieByTitle());
        System.out.println("\nTree Map sorted by Movie Title: ");
        for (Movie valueSort : sortListByValues) {
            System.out.println(valueSort);
        }
        
        
        //Lab 5
        //Having the exact problem as lab 3 with Movie
        //not being able to be converted to a String. Left it uncommented however.
        
        //create a treeSet and add the movies to it
        Set<Movie> treeSet = new TreeSet<>();
        
        treeSet.add(movieOne);
        treeSet.add(movieTwo);
        treeSet.add(movieThree);
        treeSet.add(movieFour);
        
        //remove duplicates and sort. 
        for(Movie treeSetMovie : treeSet) {
            System.out.println(treeSetMovie);
        }

    }

}
