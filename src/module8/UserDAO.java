package module8;

import java.util.Iterator;

/**
 * Created by GodMod on 12/29/2016.
 */
public class UserDAO <T extends AbstractEntity> extends AbstractDAOImpl<T> {

@Override
public void deleteById(long id) {
        Iterator iterator = getList().iterator();
        while (iterator.hasNext()) {
        T t =(T) iterator.next();
        if (t.getId() == id) {
        iterator.remove();
        }
        }
        }

@Override
public T get(long id) {
        for (T t : getList()) {
        if (t.getId() == id) {
        return t;
        }
        }

        return null;
        }
}
