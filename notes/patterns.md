# LeetCode Patterns and Algorithms

## Common Patterns

### 1. Two Pointers
- Used for: Array/String problems
- Example problems: Two Sum II, Container With Most Water
- Pattern: Use two pointers moving towards each other or in same direction

### 2. Sliding Window
- Used for: Substring/Subarray problems
- Example problems: Longest Substring Without Repeating Characters
- Pattern: Expand/shrink window based on conditions

### 3. Fast & Slow Pointers
- Used for: Linked List cycle detection
- Example problems: Linked List Cycle, Happy Number
- Pattern: Two pointers moving at different speeds

### 4. Binary Search
- Used for: Sorted array problems
- Example problems: Search in Rotated Sorted Array
- Pattern: Divide search space in half repeatedly

### 5. BFS/DFS
- Used for: Tree/Graph traversal
- Example problems: Binary Tree Level Order Traversal
- Pattern: Queue for BFS, Stack/Recursion for DFS

### 6. Dynamic Programming
- Used for: Optimization problems
- Example problems: Climbing Stairs, Coin Change
- Pattern: Break into subproblems, memoize results

### 7. Backtracking
- Used for: Permutations/Combinations
- Example problems: Subsets, Permutations
- Pattern: Build solution incrementally, backtrack on invalid paths

### 8. Hash Table
- Used for: Fast lookup/counting
- Example problems: Two Sum, Group Anagrams
- Pattern: Store data for O(1) lookup

### 9. Heap/Priority Queue
- Used for: Top K elements
- Example problems: Kth Largest Element
- Pattern: Maintain sorted order efficiently

### 10. Union Find
- Used for: Connectivity problems
- Example problems: Number of Islands
- Pattern: Track disjoint sets

## Time Complexity Cheat Sheet

- O(1) - Constant
- O(log n) - Logarithmic (Binary Search)
- O(n) - Linear (Single loop)
- O(n log n) - Linearithmic (Sorting)
- O(n²) - Quadratic (Nested loops)
- O(2^n) - Exponential (Recursion)
- O(n!) - Factorial (Permutations)

## Space Complexity Tips

- Recursion depth counts towards space complexity
- Hash tables use O(n) space
- In-place algorithms use O(1) extra space
