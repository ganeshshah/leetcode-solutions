class FooBar {
    private int n;
    private volatile AtomicInteger enableFooFlag = new AtomicInteger(1);
    private volatile AtomicInteger enableBarFlag = new AtomicInteger(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(enableFooFlag.get() == 0){
                
            }
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            enableFooFlag.set(0);
            enableBarFlag.set(1);
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
            while(enableBarFlag.get() == 0){
                
            }
            
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            enableBarFlag.set(0);
            enableFooFlag.set(1);
            
        }
    }
}