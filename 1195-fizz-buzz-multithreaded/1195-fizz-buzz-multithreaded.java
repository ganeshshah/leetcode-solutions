class FizzBuzz {
    private int n;
    
    private volatile AtomicInteger state = new AtomicInteger(1);

    public FizzBuzz(int n) {
        this.n = n;
        
    }

    // printFizz.run() outputs "fizz".
    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
        
        while(state.get() <= n ){
            
            if(state.get()%3 == 0  && state.get()%5 != 0){
                printFizz.run();
                state.incrementAndGet();
                notifyAll();
            }else{
                wait();
            }
                     
        }      
    }

    // printBuzz.run() outputs "buzz".
    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
        while(state.get() <= n ){
            
            if(state.get()%3 != 0  && state.get()%5 == 0){
                printBuzz.run();
                state.incrementAndGet();
                notifyAll();
            }else{
                wait();
            }
                     
        }  
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(state.get() <= n ){  
            if(state.get()%3 == 0  && state.get()%5 == 0){
                printFizzBuzz.run();
                state.incrementAndGet();
                notifyAll();
            }else{
                wait();
            }
                     
        }  
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
      
        
        while(state.get() <= n ){  
            if(state.get()%3 != 0  && state.get()%5 != 0){
                printNumber.accept(state.get());
                state.incrementAndGet();
                notifyAll();
            }else{
                wait();
            }
                     
        }
        

    }
}