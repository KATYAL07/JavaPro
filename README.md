# JavaPro - Algorithms & Data Structures

A mini-project showcasing clean, optimized, and comment-free Java implementations of classic data structures and algorithms. All components are integrated into a single interactive Command-Line Interface (CLI).

## Features Included

This repository contains the following implementations:

1. **Permutation Generator (`jav.java`)**
   - Efficiently computes the *k*-th permutation sequence of numbers from 1 to *n* without computing all previous permutations.

2. **Least Recently Used (LRU) Cache (`LRUCache.java`)**
   - A highly optimized custom cache data structure utilizing a `HashMap` paired with a custom doubly-linked list for `O(1)` time complexity on both `get` and `put` operations.

3. **Prefix Tree / Trie (`Trie.java`)**
   - A dictionary tree implementation for efficient string prefix matching, insertions, and searches.

4. **Topological Sort (`GraphUtils.java`)**
   - Resolves directed acyclic graph (DAG) dependencies using Kahn's Algorithm (useful for problems like Course Scheduling).

## How to Run

You can run the interactive CLI directly from your terminal to test out all the features.

1. **Compile the code:**
   ```bash
   javac *.java
   ```

2. **Run the CLI application:**
   ```bash
   java Main
   ```

## Structure

- **Clean Code:** As an aesthetic choice for this portfolio project, all source code is written without comments to prioritize code readability and self-documenting naming conventions.
- **`Main.java`:** Acts as the driver class to provide a user-friendly terminal menu.
