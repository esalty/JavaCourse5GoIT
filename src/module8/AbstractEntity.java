package module8;

/**
 * Created by GodMod on 12/29/2016.
 */
public class AbstractEntity {
    private long id;

    public AbstractEntity(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

