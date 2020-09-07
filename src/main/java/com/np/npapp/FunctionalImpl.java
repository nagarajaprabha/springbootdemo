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
public class FunctionalImpl {
    public void callFunctionalInterface(){
        Functional func = ()->{System.out.println(" Invoked Functional interaface");};
        func.decorateWithCurtains();
    }
}
