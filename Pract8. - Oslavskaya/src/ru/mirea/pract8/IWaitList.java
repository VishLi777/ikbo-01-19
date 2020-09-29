package ru.mirea.pract8;
import java.util.Collection;
/**
 * @param <E> - generic type for list
 */
public interface IWaitList<E> {
    /**
     * @param element to add
     */
    public void add(E element);

    /**
     * @return removed element
     */
    public E remove();

    /**
     * @param element to check content
     * @return true if contains
     */
    public boolean contains(E element);

    /**
     * @param check to check if list is in custom list
     * @return true if list contains all the elements
     */
    public boolean containsAll(Collection<E> check);

    /**
     * @return true if list is empty
     */
    public boolean isEmpty();
}