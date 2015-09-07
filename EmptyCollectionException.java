/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructures.exceptions;

/**
 *
 * @author Medina
 */
public class EmptyCollectionException extends RuntimeException{ // handle the exceptions
    public EmptyCollectionException(String collection)
    {
        super("There is nothing in  " + collection );
    }
}
