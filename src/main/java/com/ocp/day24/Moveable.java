
package com.ocp.day24;

public interface Moveable<Integer> {
    public default void walk(Integer distance){
        System.out.println("walking");
    }
    public void run(Integer distance);
    
}
