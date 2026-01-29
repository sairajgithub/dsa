Pattern #1: Binary Search on Answer (Google SDE-3 level)

🧠 PATTERN #1 — BINARY SEARCH ON ANSWER
(One of the MOST IMPORTANT patterns for Google SDE-3)

1️⃣ What is Binary Search on Answer?
Binary Search on Answer is used when the problem asks for the minimum or maximum value that satisfies a condition, and that condition behaves monotonically.
You are not searching an index. You are searching the correct value in a numeric range.

2️⃣ When to Recognize This Pattern (Instant Triggers)
Think Binary Search on Answer if you see:
* “minimum” / “maximum”
* “at least” / “at most”
* “within X days / hours”
* “speed”, “capacity”, “rate”, “limit”
* Very large answer range (1 to 10⁹)
  Typical problem wording:
* Minimum speed to finish work
* Minimum capacity to ship packages
* Maximum workload per worker
* Minimum days required

3️⃣ The 3-Question Mental Checklist (CRITICAL)
Before coding, ask exactly these 3 questions:
1. What is the answer range? (Example: speed ∈ [1, max(A)])
2. Can I verify a given answer? (“If someone gives me X, can I check if it works?”)
3. Is the verification monotonic? (Once it works, does it always work for bigger/smaller values?)
   If the answer is YES to all 3 → Binary Search on Answer.

4️⃣ What Monotonicity Looks Like (Interview Clarity)
Example: Mango / Banana Eating
Speed (K)	Hours Needed	Feasible?
1	30	❌
2	15	❌
3	10	❌
4	8	✅
5	6	✅
Pattern:
❌ ❌ ❌ ❌ ✅ ✅ ✅
Once feasible becomes true, it never flips back.
That is monotonicity.

5️⃣ Core Binary Search on Answer Template (Language-Agnostic)
low = minimum_possible_answer
high = maximum_possible_answer
answer = high

while low <= high:
mid = low + (high - low) / 2

    if isPossible(mid):
        answer = mid
        high = mid - 1   // try smaller answer
    else:
        low = mid + 1    // need bigger answer

return answer

6️⃣ How to Write isPossible(x)
This function must:
* Be deterministic
* Be O(N) or better
* Return true / false
* Respect monotonicity
  Example (Eating speed):
  isPossible(K):
  totalHours = 0
  for each pile:
  totalHours += ceil(pile / K)
  return totalHours <= B

7️⃣ Common Keywords (Memorize This List)
If you see ANY of these, pause and think BS-on-Answer:
* speed
* capacity
* rate
* days
* hours
* time
* workload
* limit
* minimum / maximum

8️⃣ Canonical Google-Style Problems
You should immediately recognize this pattern in:
* Koko Eating Bananas
* Ship Packages Within D Days
* Allocate Books
* Minimum Days to Make Bouquets
* Aggressive Cows
* Painter’s Partition Problem
  Google loves these because they test reasoning, not memorization.

9️⃣ Common Mistakes (Google Reject Reasons)
❌ Wrong search bounds ❌ Forgetting monotonicity proof ❌ Using mid = (low + high) / 2 (overflow risk) ❌ Incorrect feasibility logic ❌ Returning low instead of stored answer blindly

🔟 Interview-Grade Explanation (USE THIS)
When the interviewer asks “Why binary search?”, say:
“We’re searching for the minimum value that satisfies a condition. The feasibility function is monotonic — once it becomes true, it stays true — so we can apply binary search on the answer space.”
This sounds senior, clear, and confident.

🧠 How Google Evaluates This Pattern
Google is checking:
* Do you identify monotonicity?
* Can you define feasibility clearly?
* Are your bounds correct?
* Can you explain your reasoning?
  They care more about explanation than syntax.

