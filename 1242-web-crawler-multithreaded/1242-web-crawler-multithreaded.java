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
        
        result.add(startUrl);
        String hostName = getHostName(startUrl);
        recursivelyCrawl(startUrl,htmlParser,hostName);
        return new ArrayList<>(result);
        
    }
    
    void recursivelyCrawl(String startUrl, HtmlParser htmlParser, String hostName){ 
        result.add(startUrl);
        htmlParser.getUrls(startUrl).parallelStream().filter( url -> !result.contains(url) && getHostName(url).equals(hostName))
            .forEach(url -> recursivelyCrawl(url,htmlParser,hostName));
    }
    
    private String getHostName(String url){
        return url.split("/")[2];
    }
}