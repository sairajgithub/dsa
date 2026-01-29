🧠 PATTERN #2 — SLIDING WINDOW
(One of the most frequently used patterns in Google interviews)

1️⃣ What is the Sliding Window Pattern?
Sliding Window is used when dealing with contiguous subarrays or substrings, where a “window” moves across the input while maintaining some condition efficiently.
Instead of recomputing for every subarray (O(n²)), we reuse work and solve in O(n).

2️⃣ When to Recognize This Pattern (Instant Triggers)
Think Sliding Window if you see:
* “subarray” or “substring”
* “contiguous”
* “longest / shortest”
* “maximum / minimum”
* “at most / at least K”
* “window”, “range”, “continuous”
  📌 If the problem says contiguous, sliding window should come to your mind first.

3️⃣ Two Types of Sliding Window (VERY IMPORTANT)
🔹 Type 1: Fixed-Size Window
Window size = constant K
Example:
* Maximum sum subarray of size K
  Pattern:
  add right
  remove left
  move window

🔹 Type 2: Variable-Size Window (Most Google Problems)
Window size changes dynamically based on a condition.
Example:
* Longest substring without repeating characters
* Minimum window substring
  This is the core Google pattern.

4️⃣ The 3-Question Mental Checklist
Before coding, ask:
1. Is the data contiguous?
2. Can I expand the window to include more elements?
3. When does the window become invalid, and how do I shrink it?
   If these questions make sense → Sliding Window.

5️⃣ Core Sliding Window Template (Variable Size)
left = 0
for right from 0 to n-1:
include arr[right] in window

    while window is invalid:
        remove arr[left] from window
        left++

    update answer
📌 This guarantees each element is visited at most twice → O(n)

6️⃣ Example Walkthrough (Key Intuition)
Problem:
Longest substring without repeating characters
Input: "abcabcbb"
Window movement:
a → ab → abc → (duplicate 'a') → shrink → bca → cab → ...
Key idea:
* Expand until invalid
* Shrink until valid
* Track best answer

7️⃣ Common Sliding Window Conditions
You usually track:
* frequency map
* count of unique characters
* sum / max / min
* number of violations
  Example conditions:
* duplicates exist
* sum > K
* distinct chars > K

8️⃣ Canonical Google-Style Problems
You should instantly identify Sliding Window in:
* Longest Substring Without Repeating Characters
* Minimum Window Substring
* Max Consecutive Ones
* Subarray Sum ≤ K (positive numbers)
* Longest Repeating Character Replacement

9️⃣ Common Mistakes (VERY COMMON)
❌ Forgetting to shrink window
  
❌ Shrinking only once instead of while invalid ❌ Updating answer at wrong time ❌ Using sliding window when array has negative numbers (invalid in many cases) ❌ Overcomplicating with nested loops

🔟 When Sliding Window DOES NOT Work
Sliding window fails when:
* Elements can be negative (sum-based problems)
* Window validity doesn’t improve when shrinking
* Non-contiguous selection
  Example where it fails:
* Subarray sum equals K (with negatives) → needs prefix sum

1️⃣1️⃣ Interview-Grade Explanation (Use This)
When asked “Why sliding window?”, say:
“Because the problem deals with contiguous data and we can maintain the required condition by expanding and shrinking a window, achieving linear time complexity.”
This sounds clear and senior.

1️⃣2️⃣ How Google Evaluates Sliding Window Solutions
Google checks:
* Do you know when to shrink?
* Do you maintain invariants clearly?
* Is your solution O(n)?
* Can you explain why it works?

🧠 Quick Recognition Summary
If you see:
contiguous + longest/shortest + constraints
→ Sliding Window
