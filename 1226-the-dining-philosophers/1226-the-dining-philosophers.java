class DiningPhilosophers {

    public DiningPhilosophers() {
        
    }
		
		private Object leftFork = new Object();
		private Object rightFork = new Object();

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {

			if (philosopher % 2 == 1) {
				synchronized (leftFork) {
					synchronized (rightFork) {
						pickLeftFork.run();
						pickRightFork.run();
						eat.run();
						putRightFork.run();
						putLeftFork.run();
					}
				}
			} else {
				synchronized (leftFork) {
					synchronized (rightFork) {
						pickRightFork.run();
						pickLeftFork.run();
						eat.run();
						putLeftFork.run();
						putRightFork.run();
					}
				}
			}



    }
}