/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */
class Solution {
    
    private Set<String> result = new HashSet<>();
    
    
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        
        String hostname = getHostName(startUrl);
        recursivelyCrawl(startUrl,htmlParser,hostname);
        return new ArrayList(result);
        
    }
    
    
    private void recursivelyCrawl(String url, HtmlParser htmlParser,String hostname){
        
        result.add(url);
        
        htmlParser.getUrls(url).parallelStream().filter(url1 -> !result.contains(url1) && getHostName(url1).equals(hostname))
            .forEach(url1 -> recursivelyCrawl(url1,htmlParser,hostname));
    }
    
    private String getHostName(String url){
        return url.split("/")[2];
    }
}