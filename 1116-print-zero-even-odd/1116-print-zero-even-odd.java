class ZeroEvenOdd {
    private int n;
    private volatile AtomicInteger functionToExecute = new AtomicInteger(0);
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized  void zero(IntConsumer printNumber) throws InterruptedException {
        for(int i=0; i<n; i++){
            while(functionToExecute.get() != 0){
                wait();
            }
            
            printNumber.accept(0);
            int state = i % 2 == 0 ? 1 : 2;
            functionToExecute.set(state);
            notifyAll();
        }
    }

    public synchronized  void even(IntConsumer printNumber) throws InterruptedException {
        for(int i=2; i<=n; i=i+2){
            while(functionToExecute.get() != 2){
                wait();
            }
            
            printNumber.accept(i);
            functionToExecute.set(0);
            notifyAll();
        }
    }

    public synchronized  void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i=1; i<=n; i=i+2){
            while(functionToExecute.get() != 1){
                wait();
            }
            
            printNumber.accept(i);
            functionToExecute.set(0);
            notifyAll();
        }
    }
}