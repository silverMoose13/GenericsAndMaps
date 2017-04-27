/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Comparator;

/**
 *
 * @author Aaron
 */
public class MovieByTitle implements Comparator<Movie> {
    
    @Override
    public int compare(Movie movieOne, Movie movieTwo) {
        return movieOne.getTitle().compareTo(movieTwo.getTitle());
    }
    
}
