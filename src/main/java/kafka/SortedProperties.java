package kafka;

import java.util.*;

public class SortedProperties extends Properties {

    /**
     * Created by dingpeng on 16/12/22.
     */
    private static final long serialVersionUID = -518883341084785086L;

    @Override public Enumeration<Object> keys() {
        Enumeration<Object> keysEnum = super.keys();
        Vector<Object> keyList = new Vector<Object>();

        while (keysEnum.hasMoreElements()) {
            keyList.add(keysEnum.nextElement());
        }

        Collections.sort(keyList, new Comparator<Object>() {
            @Override public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        return keyList.elements();
    }

}
