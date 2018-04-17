/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_log;

/**
 *
 * @author Happi6
 */
public class user_log {
    private String username;
    
    public user_log(String username){
        this.username = username;
    }
    
    private void init(){
        //create initial file if file is not existing
        System.out.println("File created.");
    }
    
    private void add(){
        //add a new line per action
        int time;
        System.out.println("Added new activity.");
    }
}
