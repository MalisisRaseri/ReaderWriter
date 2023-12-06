package mainpack;

import java.util.Random;

public class Entity extends Thread{
    protected final DataBase database;
    protected final Random rnd = new Random();

    public Entity(DataBase database, String name) {
        super(name);
        this.database = database;
    }

    protected void randomPeriodTime (int minMs, int maxMs){
        try {
            Thread.sleep((long) (minMs + rnd.nextFloat() * (maxMs - minMs)));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return getName();
    }
}
