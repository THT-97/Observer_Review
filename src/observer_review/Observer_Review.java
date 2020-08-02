/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_review;

import Subscribers.SubA;
import Subscribers.SubB;
import Subscribers.Subscriber;

/**
 *
 * @author TranHuyThinh
 */
public class Observer_Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Topic t = new Topic();
        Subscriber sub1 = new SubA();
        Subscriber sub2 = new SubB();
        sub1.subscribe(t);
        sub2.subscribe(t);
        t.createNews("Bruh");
        t.createNews("Yikes");
        t.updateNews("Yikes", "Yoink");
        sub1.unsubscribe(t);
        t.updateNews("Bruh", "Brah");
    }
    
}
