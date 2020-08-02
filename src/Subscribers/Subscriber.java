/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subscribers;

import java.util.ArrayList;
import java.util.List;
import observer_review.Topic;

/**
 *
 * @author TranHuyThinh
 */
public abstract class Subscriber implements Topic.SubNotification{
    List<String> newsList;

    public Subscriber() {
        this.newsList = new ArrayList<>();
    }
    
    public void getAllNews(){
        System.out.println("All news: ");
        for (int i = newsList.size()-1; i >= 0; i--) {
            System.out.println(i + ": " + newsList.get(i));
        }
    }
    
    public void subscribe(Topic t){
        t.subscribe(this);
    }
    
    public void unsubscribe(Topic t){
        t.unsubscribe(this);
    }
}
