package ch.renewinkler;

import ch.renewinkler.execute_around_method.FileWriterEAM;
import ch.renewinkler.execute_around_method.Timer;
import ch.renewinkler.execute_around_method.Transaction;
import ch.renewinkler.execute_around_method.TransactionHandler;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        Timer.timed(Main::dummyCalc);

        FileWriterEAM.use("eam.txt", writerEAM -> writerEAM.writeStuff("sweet"));

        TransactionHandler.runInTransaction(connection -> {
            //int ticketId = findAvailableTicket(connection);
            //reserveTicket(ticketId, connection);
            //markAsBought(ticketId, connection););
        });
    }



    public static Double dummyCalc() {
        double result = 0;
        for(int i=0; i<10000000; i++){
            result += i;
        }
        return result;
    }
}
