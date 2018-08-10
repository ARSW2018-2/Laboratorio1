/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

/**
 *
 * @author 2098325
 */
public class Block extends Thread {
    private int a;
    private String ipaddress;
    private int N;
    private int contador=0;
    private int rango=0;
    HostBlacklistsDataSourceFacade skds=HostBlacklistsDataSourceFacade.getInstance();
    
    
    public Block(int a, String ipaddress, int N){
        this.ipaddress=ipaddress;
        this.a=a;
        this.N=N;            
        //this.;            

    
    }
    
    
    public void run (int a, String b) {  
    
        
        
        
    } 
    
    
    
    
}
