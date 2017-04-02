package ch.renewinkler;

import ch.renewinkler.execute_around_method.FileWriterEAM;
import ch.renewinkler.execute_around_method.Timer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Timer.timed(Main::dummyCalc);

        FileWriterEAM.use("eam.txt", writerEAM -> writerEAM.writeStuff("sweet"));

    }

    public static Double dummyCalc() {
        double result = 0;
        for(int i=0; i<10000000; i++){
            result += i;
        }
        return result;
    }
}
