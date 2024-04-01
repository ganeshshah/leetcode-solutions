class H2O {
    
    private Semaphore hydrogenSemaphore = new Semaphore(2);
    private Semaphore oxygenSemaphore = new Semaphore(0);
    private volatile AtomicInteger count = new AtomicInteger(0);

    public H2O() {
        
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        
        hydrogenSemaphore.acquire();
		
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        count.incrementAndGet();
        if(count.get() == 2 ){
            count.set(0);
            oxygenSemaphore.release(1);
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oxygenSemaphore.acquire();
        
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
		releaseOxygen.run();
        hydrogenSemaphore.release(2);
    }
}