/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;
import java.util.LinkedList;
import java.util.logging.Level;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2098325
 */
public class Block extends Thread {
    int registeredServersCount=0;
    private int inicio;
    private int fin;
    private String ipaddress;
    private int N;
    private int contador=0;
    private int rango=0;
    HostBlacklistsDataSourceFacade skds=HostBlacklistsDataSourceFacade.getInstance();
    
    //REPONER VARIABLES
    int checkedListsCount=0;
    int ocurrencesCount=0;
    private static final int BLACK_LIST_ALARM_COUNT=5;
    LinkedList<Integer> blackListOcurrences=new LinkedList<>();
    /**
    public int getOcurrencesCount(){
        return ocurrencesCount;
    }*/
            
    
    public Block(int inicio, int fin, String ipaddress, int N){
        this.ipaddress=ipaddress;
        this.inicio=inicio;
        this.fin=fin;
        this.N=N;            
        //this.;            

    
    }
    //Pregunta a la instancia cuanta ocurrencias del mismo a ocurrido en el servidor.
    public int getOcurrencesCOunt(){
        return ocurrencesCount ;
    }
    @Override
    public void run () {  
        
        
        for (int i=inicio;i<fin && ocurrencesCount<BLACK_LIST_ALARM_COUNT;i++){
            checkedListsCount++;
            //System.out.println("emprime"+Thread.currentThread ().getName());
            if (skds.isInBlackListServer(i, ipaddress)){
                
                blackListOcurrences.add(i);
                System.out.println("vamos contando");
                ocurrencesCount++;
                System.out.println("CUanto va la suma"+ocurrencesCount);
                
            }
        }    
        /**   
        if (ocurrencesCount>=BLACK_LIST_ALARM_COUNT){
            System.out.println("acabo de procesar");
            skds.reportAsNotTrustworthy(ipaddress);
        }
        else{
            skds.reportAsTrustworthy(ipaddress);
        }                
*/
        
        registeredServersCount=skds.getRegisteredServersCount();
      //  LOG.log(Level.INFO, "Checked Black Lists:{0} of {1}", new Object[]{checkedListsCount, skds.getRegisteredServersCount()});            
        
    } 
    
    private static final Logger LOG = Logger.getLogger(HostBlackListsValidator.class.getName());
    
    
}
