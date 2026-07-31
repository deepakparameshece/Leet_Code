class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        // Result list to store all groups
        List<List<Integer>> result = new ArrayList<>();
        
        // Map to store people IDs based on their group size
        // Key: group size, Value: list of people IDs
        Map<Integer, List<Integer>> sizeToGroup = new HashMap<>();
        
        // Process each person
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            
            // Get or create list for this group size
            sizeToGroup.putIfAbsent(size, new ArrayList<>());
            List<Integer> group = sizeToGroup.get(size);
            
            // Add current person to their size group
            group.add(i);
            
            // If the group reaches its required size
            if (group.size() == size) {
                // Add the complete group to result
                result.add(new ArrayList<>(group));
                // Clear the group for next set of people
                group.clear();
            }
        }
        
        return result;
    }
}