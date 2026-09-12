import java.util.ArrayList;
import java.util.List;

class BrowserHistory {
    
    // List to store history of URLs
    private final List<String> history;
    // Pointer to the current page in history
    private int currentIndex;
    // Pointer to the maximum available forward history boundary
    private int maxIndex;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        currentIndex = 0;
        maxIndex = 0;
    }
    
    public void visit(String url) {
        currentIndex++;
        
        // If we are overwriting existing forward history, update the element
        if (currentIndex < history.size()) {
            history.set(currentIndex, url);
        } else {
            // Otherwise, append the new URL to the list
            history.add(url);
        }
        
        // Visiting a new URL completely clears out all forward history
        maxIndex = currentIndex;
    }
    
    public String back(int steps) {
        // Move back but don't go past the homepage (index 0)
        currentIndex = Math.max(0, currentIndex - steps);
        return history.get(currentIndex);
    }
    
    public String forward(int steps) {
        // Move forward but don't go past the most recent valid history page
        currentIndex = Math.min(maxIndex, currentIndex + steps);
        return history.get(currentIndex);
    }
}


output

  Input
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
Output
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]
Expected
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]
