package module8;

import java.util.List;

/**
 * Created by GodMod on 12/29/2016.
 */
public interface AbstractDAO <T extends AbstractEntity> {
    T save(T t);
    void delete(T t);
    void deleteAll(List <? extends T> tList);
    void saveAll(List <? extends T> tList);
    List<? extends T> getList();
    void deleteById(long id);
    T get(long id);
}
