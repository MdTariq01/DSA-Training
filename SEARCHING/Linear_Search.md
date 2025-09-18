# Linear Search – Theory

## 🔹 Definition
Linear Search, also known as **Sequential Search**, is a simple searching algorithm used to find the position of a target element in a list. It checks each element in the list **sequentially** until the desired element is found or the list ends.

---

## 🔹 Algorithm Steps
1. Start from the first element of the array/list.
2. Compare the current element with the target element.
3. If it matches, return the index of the element.
4. If it does not match, move to the next element.
5. Repeat steps 2-4 until the element is found or the end of the list is reached.
6. If the element is not found, return `-1` or an indication that the element does not exist.

---

## 🔹 Example
**Array:** `[5, 3, 8, 4, 2]`  
**Target element:** `4`  

**Steps:**  
- Compare 5 → Not match  
- Compare 3 → Not match  
- Compare 8 → Not match  
- Compare 4 → Match found at index 3  

---

## 🔹 Pseudocode
```java
 function linearSearch(arr, target):
 for i from 0 to length(arr) - 1:
 if arr[i] == target:
 return i
 return -1
```


---

## 🔹 Characteristics
| Feature | Description |
|---------|-------------|
| Type | Sequential Search |
| Input | Array/List and Target Element |
| Output | Index of element or -1 if not found |
| Complexity (Best Case) | O(1) – Element found at first position |
| Complexity (Worst Case) | O(n) – Element at last position or not found |
| Complexity (Average Case) | O(n) |
| Space Complexity | O(1) – Constant space |

---

## 🔹 Advantages
- Simple and easy to implement.
- Works for **unsorted and sorted arrays**.
- No preprocessing required.

---

## 🔹 Disadvantages
- Inefficient for large datasets.
- Time complexity is **O(n)**.
- Many unnecessary comparisons if the element is near the end.

---

## 🔹 Applications
- Small lists or arrays.
- Checking membership in unsorted data.
- Situations where simplicity is more important than efficiency.
