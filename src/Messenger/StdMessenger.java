/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messenger;

  public class StdMessenger implements Messenger {
    boolean isSuccess;
    
    public void sendMessage(String receiver, String subject, String messege) {
        System.out.println("Receiver        : "+receiver);
        System.out.println("Subject         : "+subject);
        System.out.println("Message         : "+messege);
        
        if (receiver == "") {
            isSuccess = false;
            System.out.println("Status Message  : "+isSuccess);
            System.out.println("Std not sent.\n");
        } else {
            isSuccess = true;
            System.out.println("Status Message  : "+isSuccess);
            System.out.println("Std sent.\n");
        }
    }
}  

