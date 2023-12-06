package mainpack;

public class Writer extends Entity{
    public Writer(DataBase database, String name) {
        super(database, name);
    }

    @Override
    public void run() {
        while (true){
            database.writerEnter(this);
            randomPeriodTime(1000,2000);
            database.writerExit(this);
            randomPeriodTime(2000,3000);
        }
    }
}