package com.tom.datastructures;

public class UrlFixer {
  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    //  Solution 1
    url = url.replace("bots", "odds");
    url = url.replace("//", "://");
    System.out.println(url);

    // Reset string
    url = "https//www.reddit.com/r/nevertellmethebots";

    //  Solution 2
    url = url.substring(0, url.indexOf("/")).concat("://") +
        url.substring(url.indexOf("w"), url.indexOf("bots")).concat("odds");

    System.out.println(url);
  }
}
