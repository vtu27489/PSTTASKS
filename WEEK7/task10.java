import java.util.*;

class ThroneInheritance {
    // Map to store parent-to-children relationships
    private final Map<String, List<String>> familyTree;
    // Set to keep track of dead people
    private final Set<String> deadSet;
    // Store the root of the family tree
    private final String king;

    public ThroneInheritance(String kingName) {
        this.king = kingName;
        this.familyTree = new HashMap<>();
        this.deadSet = new HashSet<>();
        // Initialize the king's child list
        this.familyTree.put(kingName, new ArrayList<>());
    }
    
    public void birth(String parentName, String childName) {
        // Add the child to the parent's list of children
        this.familyTree.computeIfAbsent(parentName, k -> new ArrayList<>()).add(childName);
    }
    
    public void death(String name) {
        // Mark the person as dead
        this.deadSet.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        // Perform pre-order DFS starting from the king
        dfs(king, order);
        return order;
    }

    private void dfs(String current, List<String> order) {
        // If the current person is alive, add them to the inheritance order
        if (!deadSet.contains(current)) {
            order.add(current);
        }
        
        // Recursively visit all children in the order of their birth
        List<String> children = familyTree.get(current);
        if (children != null) {
            for (String child : children) {
                dfs(child, order);
            }
        }
    }
}


output
  Input
["ThroneInheritance","birth","birth","birth","birth","birth","birth","getInheritanceOrder","death","getInheritanceOrder"]
[["king"],["king","andy"],["king","bob"],["king","catherine"],["andy","matthew"],["bob","alex"],["bob","asha"],[null],["bob"],[null]]
Output
[null,null,null,null,null,null,null,["king","andy","matthew","bob","alex","asha","catherine"],null,["king","andy","matthew","alex","asha","catherine"]]
Expected
[null,null,null,null,null,null,null,["king","andy","matthew","bob","alex","asha","catherine"],null,["king","andy","matthew","alex","asha","catherine"]]
