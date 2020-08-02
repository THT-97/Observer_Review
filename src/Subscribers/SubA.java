/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subscribers;

/**
 *
 * @author TranHuyThinh
 */
public class SubA extends Subscriber{

    public SubA() {
    }

    @Override
    public void addNews(String news) {
        if(newsList.indexOf(news)<0){
            newsList.add(news);
            System.out.println("SubA -> News received: " + news);
        }
    }

    @Override
    public void updateNews(String oNews, String nNews) {
        if(newsList.indexOf(oNews)>=0){
            newsList.set(newsList.indexOf(oNews), nNews);
            System.out.println("SubA -> News updated: " + nNews);
        }
    }
    
}
