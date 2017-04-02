package ch.renewinkler.execute_around_method;

import java.util.function.Supplier;

public class Timer {

    public static <T> T timed(Supplier<T> supplier){
        long start = System.currentTimeMillis();
        T result = supplier.get();
        System.out.println("Execution Time:" + (System.currentTimeMillis()-start));
        return result;
    }
}
