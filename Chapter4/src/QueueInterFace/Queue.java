package QueueInterFace;

/**
 * Created by Mingyuan Li on 2015/12/1.
 * Package: QueueInterFace
 * Project: Chapter4
 */
public interface Queue<E>
{
    boolean offer(E obj);
    E remove();
    E poll();
    E peek();
    E element();
}
