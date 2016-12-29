package module8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GodMod on 12/29/2016.
 */
public abstract class AbstractDAOImpl<T extends AbstractEntity> implements AbstractDAO<T> {
    private List<T> list = new ArrayList<>();
    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
    }

    @Override
    public void deleteAll(List<? extends T> tList) {
        list.removeAll(tList);
    }

    @Override
    public void saveAll(List<? extends T> tList) {
        list.addAll(tList);
    }

    @Override
    public List<? extends T> getList() {
        return this.list;
    }
}
