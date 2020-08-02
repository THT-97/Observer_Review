/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_review;

import Subscribers.Subscriber;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TranHuyThinh
 */
public class Topic {
    List<String> newsList;
    List<Subscriber> subscribers;
    
    public Topic() {
        newsList = new ArrayList<>();
        subscribers = new ArrayList<>();
    }
    public void subscribe(Subscriber s){
        if(subscribers.indexOf(s)<0) subscribers.add(s);
    }
    
    public void unsubscribe(Subscriber s){
        subscribers.remove(s);
    }
    
    public void createNews(String news){
        if(newsList.indexOf(news)<0) {
            newsList.add(news);
            subscribers.forEach((t) -> {
                t.addNews(news);
            });
        }
    }
    
    public void updateNews(String oNews, String nNews){
        newsList.set(newsList.indexOf(oNews), nNews);
        subscribers.forEach((t) -> {
            t.updateNews(oNews, nNews);
        });
    } 
    
    public interface SubNotification{
        public void addNews(String news);
        public void updateNews(String oNews, String nNews);
    }
}
