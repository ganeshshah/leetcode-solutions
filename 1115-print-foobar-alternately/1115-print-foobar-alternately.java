class FooBar {
    private int n;
    // private volatile AtomicInteger enableFooFlag = new AtomicInteger(1);
    // private volatile AtomicInteger enableBarFlag = new AtomicInteger(0);
    
    Semaphore lock1 = new Semaphore(1);
    Semaphore lock2 = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
//             while(enableFooFlag.get() == 0){
                
//             }
        	// printFoo.run() outputs "foo". Do not change or remove this line.
            lock1.acquire();
        	printFoo.run();
            // enableFooFlag.set(0);
            // enableBarFlag.set(1);
            lock2.release();
            
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
//             while(enableBarFlag.get() == 0){
                
//             }
            
            // printBar.run() outputs "bar". Do not change or remove this line.
            lock2.acquire();
        	printBar.run();
            // enableBarFlag.set(0);
            // enableFooFlag.set(1);
            lock1.release();
            
        }
    }
}