
package com.lab.observer;
/** 
 *  設計模式
 *  被觀察者
 */
public interface Subject {
    void add(Observer observer);//訂閱
    void renove(Observer observer);//取消訂閱
    void notifyObserver(String data);//通知
}
