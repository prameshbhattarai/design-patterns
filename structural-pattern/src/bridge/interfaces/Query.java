package bridge.interfaces;

public interface Query<T> {

    boolean create(T request);
    T search();
    boolean update(T request);
    boolean delete(T request);
}
