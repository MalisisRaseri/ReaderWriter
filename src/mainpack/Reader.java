package mainpack;

public class Reader extends Entity{
    public Reader(DataBase database, String name) {
        super(database, name);
    }

    @Override
    public void run() {
        while (true){
            database.readerEnter(this);
            randomPeriodTime(200,300);
            database.readerExit(this);
            randomPeriodTime(2000,3000);
        }
    }
}
