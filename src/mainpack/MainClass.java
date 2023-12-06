package mainpack;


public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        DataBase database = new DataBase();
        Entity[] entity = new Entity[]{
                new Reader(database,"Читатель1"),
                new Reader(database,"Читатель2"),
                new Reader(database,"Читатель3"),
                new Reader(database,"Читатель4"),
                new Reader(database,"Читатель5"),
                new Writer(database,"Писатель1"),
                new Writer(database,"Писатель2"),
                new Writer(database,"Писатель3")
        };

        for (Entity e: entity)
            e.start();
        entity[0].join();

    }
}
