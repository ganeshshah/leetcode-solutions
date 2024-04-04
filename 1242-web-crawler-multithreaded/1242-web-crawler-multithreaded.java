/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */
class Solution {
    
    private Set<String> visited = Collections.synchronizedSet(new HashSet<String>());
    private ExecutorService executor =  Executors.newFixedThreadPool(6);
    private HtmlParser htmlParser;
    private String hostname;
    private AtomicInteger currentlyActiveTasks = new AtomicInteger(0);
    
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        
        this.hostname = startUrl.split("/")[2];
        this.htmlParser = htmlParser;
        currentlyActiveTasks.incrementAndGet();
        visited.add(startUrl);
        executor.execute(new CrawlingTask(startUrl));
        
        while(currentlyActiveTasks.get() > 0){
            try{
                Thread.sleep(80);
            }catch(InterruptedException e){
                //
            }
        }
        
        executor.shutdown();
        
        return new ArrayList<>(visited);
            
    }
    
    public class CrawlingTask implements Runnable {
        
        private String url;
        
        CrawlingTask(String url){
            this.url = url;
        }
        
        @Override
       public void run(){
            
            for(String link : htmlParser.getUrls(url)){
                if(getHostName(link).equals(hostname) && visited.add(link)){
                    currentlyActiveTasks.incrementAndGet();
                    executor.execute(new CrawlingTask(link));
                }
            }
            
            currentlyActiveTasks.decrementAndGet();
            
        }
        
        private String getHostName(String link){
            return link.split("/")[2];
        }
        
    }
}