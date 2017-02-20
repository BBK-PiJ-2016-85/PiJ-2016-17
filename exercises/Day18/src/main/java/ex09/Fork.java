package ex09;

import java.util.concurrent.atomic.AtomicInteger;
 
class Fork {
    public static final int ON_TABLE = -1;
    static int instances = 0;
    public int id;
    public AtomicInteger holder = new AtomicInteger(ON_TABLE);
 
    Fork() { id = instances++; }
}