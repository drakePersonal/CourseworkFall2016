package ContentPanes;

import javafx.application.Platform;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by user on 9/8/2016.
 */
public class Thread_Practice_02 extends StackPane {
    private static Account account = new Account();
    static TextArea box;
    public Thread_Practice_02() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new DepositTask());
        executor.execute(new WithdrawTask());
        executor.shutdown();

        box = new TextArea();
        box.setText("Thread 1\t\tThread 2\t\tBalance\n");
        box.setWrapText(true);
        getChildren().add(box);
    }
    private class DepositTask implements Runnable {
        public void run(){
            try{
                while(true){
                    account.deposit((int)(Math.random()*10)+1);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    private class WithdrawTask implements Runnable {
        @Override
        public void run(){
            while(true){
                account.withdraw((int)(Math.random()*10)+1);
                try{
                    Thread.sleep(1000);
                }catch (Exception ignored){
                }
            }
        }
    }
    private static class Account {
        private static Lock lock = new ReentrantLock();
        private static Condition newDeposit = lock.newCondition();
        private int balance = 0;

         int getBalance(){
            return balance;
        }
         void deposit(int i) {
            lock.lock();
            try{

                balance += i;
                Platform.runLater(()->box.appendText("\nDeposit " + i + "\t\t\t\t\t"+getBalance()));
                newDeposit.signalAll();
            }finally{
                lock.unlock();
            }
        }

        void withdraw(int i) {
            lock.lock();
            try{
                while(balance<i) {
                    Platform.runLater(()->box.appendText("\n\t\tYOUR CARD HAS BEEN DECLINED"));
                    newDeposit.await();
                }
                balance-=i;
                Platform.runLater(()->box.appendText("\n\t\t\tWithdraw " + i + "\t\t" + getBalance()));
            } catch (InterruptedException ignored) {
            } finally{
                lock.unlock();
            }
        }
    }




}
