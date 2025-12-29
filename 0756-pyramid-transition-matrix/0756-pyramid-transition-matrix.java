import java.util.*;

class Solution {

    // This map stores allowed transitions
    // Example: "AB" -> ['C', 'D']
    Map<String, List<Character>> map = new HashMap<>();

    // To remember rows that already failed
    Set<String> visited = new HashSet<>();

    public boolean pyramidTransition(String bottom, List<String> allowed) {

        // STEP 1: Build the map from allowed list
        for (String s : allowed) {
            String pair = s.substring(0, 2);   // bottom pair
            char top = s.charAt(2);            // top block

            map.putIfAbsent(pair, new ArrayList<>());
            map.get(pair).add(top);
        }

        // STEP 2: Start DFS from bottom row
        return dfs(bottom);
    }

    private boolean dfs(String row) {

        // STEP 3: If only one block left → pyramid completed
        if (row.length() == 1) {
            return true;
        }

        // If we already tried this row and failed → skip
        if (visited.contains(row)) {
            return false;
        }

        // STEP 4: Try to build the next row
        boolean possible = buildNextRow(row, 0, new StringBuilder());

        // If not possible, mark this row as failed
        if (!possible) {
            visited.add(row);
        }

        return possible;
    }

    private boolean buildNextRow(String row, int index, StringBuilder next) {

        // When next row is fully built
        if (index == row.length() - 1) {
            // Try to continue pyramid from next row
            return dfs(next.toString());
        }

        // Take two adjacent blocks
        String pair = row.substring(index, index + 2);

        // If no allowed pattern → fail
        if (!map.containsKey(pair)) {
            return false;
        }

        // Try every possible top block
        for (char c : map.get(pair)) {

            next.append(c);   // choose
            if (buildNextRow(row, index + 1, next)) {
                return true;  // success path found
            }
            next.deleteCharAt(next.length() - 1); // backtrack
        }

        return false;
    }
}
