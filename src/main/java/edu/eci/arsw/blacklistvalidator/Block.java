/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

/**
 *
 * @author 2098325
 */
public class Block extends Thread {
    
    
    
    
    public void run (int a, int b) {  
     System.out.println ("el hilo se está ejecutando ...");  
    } 
    
    
    
    
}
