import com.qiniu.util.Auth;
import org.junit.Test;

import java.util.concurrent.*;

public class PinYinTest {

    private static ExecutorService threadPool = Executors.newFixedThreadPool(10);
    /**
     * 1. new MyThread()
     */
    @Test
    public void test01(){
        Thread t = new MyTread();
        t.start();
    }

    /**
     * 2. new Thread(new Runnable(){ public void run(){}})
     */
    @Test
    public void test02(){
        new Thread(new Runnable(){
            @Override
            public void run() {
                int i = 10 / 5;
                System.out.println(i);
            }
        }).start();
    }

    /**
     * 3. Callable ->可以抛出异常、有返回值，配合futureTask使用
     */
    @Test
    public void test03() throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int i = 10 / 5;
                System.out.println(i);
                return i;
            }
        });
        new Thread(task).start();
        System.out.println("结果是:"+task.get());
    }

    /**
     * 线程池 ExecuteService threadPool =  Executors.newFixedThreadPool(10) --创建一个固定数量线程的池（包括核心线程和临时线程）
     *  threadPool.execute 没有返回值   submit 可以有返回值
     *
     *  线程池创建
     *  1）Executors.newFixedThreadPool
     *  2) new ThraedPoolExecutor()
     *     7大参数 - 核心线程数、最大线程数、普通线程存活时间、单位、阻塞队列、线程创建工程（defaultThreadFactory）、淘汰规则
     */
    @Test
    public void test04(){
        threadPool.execute(()->{
            System.out.println("线程池");
        });
    }
}
class MyTread extends Thread{
    @Override
    public void run(){
        int i = 10 / 5;
        System.out.println(i);
    }
}
