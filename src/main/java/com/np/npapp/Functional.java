/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.npapp;

/**
 *
 * @author Nagaraj
 */
@FunctionalInterface
public interface Functional {
    // one abstract method
 void decorateWithCurtains();
 
 // default method
 default void decorateWithPaints()
 {
  System.out.println("Decorating using paints");
 }
  
    
}
