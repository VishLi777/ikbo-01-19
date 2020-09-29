package ru.mirea.pract8;



/**
 * @param <E> - generic type for list
 */
public class UnfairWaitList<E> extends WaitListI<E> {

    public UnfairWaitList() {
        super();
    }

    /**
     * @return the removed element
     */
    @Override
    public E remove() {
        return super.remove();
    }

    /**
     * @param element add to end
     */
    public void moveToBack(E element) {
        super.add(element);
    }
}