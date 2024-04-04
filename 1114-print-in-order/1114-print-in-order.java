class Foo {
    
     // private volatile AtomicInteger firstJobDone = new AtomicInteger(0);
     // private volatile AtomicInteger secondJobDone = new AtomicInteger(0);
    
    private volatile AtomicInteger state = new AtomicInteger(0);

    public Foo() {
        
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        
        while(state.get() != 0){
            wait();
        }
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        
            printFirst.run();
            state.set(1);
            notifyAll();
           
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        
        while(state.get() != 1){
            wait();
        }
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        
            printSecond.run();
            state.set(2);
            notifyAll();
        
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
         while(state.get() !=2){
            wait();
        }
            printThird.run();
            state.set(0);
            notifyAll();
        
        // printThird.run() outputs "third". Do not change or remove this line.
        
    }
}