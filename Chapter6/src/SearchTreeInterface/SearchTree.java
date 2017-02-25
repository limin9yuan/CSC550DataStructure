package SearchTreeInterface;

/**
 * Created by Mingyuan Li on 2015/12/3.
 * Package: SearchTreeInterface
 * Project: Chapter6
 */
public interface SearchTree<E>
{
    boolean add(E obj);
    boolean contain(E obj);
    E find(E obj);
    E delete(E obj);
    boolean remove(E obj);
}
