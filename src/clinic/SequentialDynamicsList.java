/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clinic;

/**
 *
 * @author Usuario
 * @param <T>
 * @param <K>
 */
public interface SequentialDynamicsList<T,K> extends DynamicList{
    public T get();
    public boolean remove();
}
