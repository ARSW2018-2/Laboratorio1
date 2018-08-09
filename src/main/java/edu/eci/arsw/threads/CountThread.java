/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread implements Runnable{

    private int numa;
    private  int numb;

    public CountThread(int numa, int numb) {        
        this.numa=numa;
        this.numb=numb;
    }
    
    
    
    @Override
    public void run() {
        for (int i = numa; i< numb+1; i++) {
            System.out.println("Los numeros son:"+i);            
            
        }

    }
    
    
    
    
}
