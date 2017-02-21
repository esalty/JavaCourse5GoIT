package module9.testCore;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GodMod on 2/11/2017.
 */

    class MapEQ {
        public static void main(String[] args) {
            Map<ToDos, String> m = new HashMap<ToDos, String>();
            ToDos t1 = new ToDos("Monday");
            ToDos t2 = new ToDos("Monday");
            ToDos t3 = new ToDos("Tuesday");
            m.put(t1, "doLaundry");
            m.put(t2, "payBills");
            m.put(t3, "cleanAttic");
            System.out.println(m.size());
        }
    }

