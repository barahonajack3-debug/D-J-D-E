/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clinic;

import java.util.Iterator;

/**
 *
 * @author Dario R
 * parametro //<T>//
 * pametro //<K>//
 */
public interface DynamicList <T> {
    public Iterator getALL();
    public boolean add(T item);
    public int size();
    public boolean isEmpty();
}
