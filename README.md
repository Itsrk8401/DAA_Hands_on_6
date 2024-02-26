# DAA_Hands_on_6  :

Done the benchmarking for the respective quicksort non- random pivot python code 

The mathematical derivation of the average runtime complexity of the non-random pivot version of quicksort is calculated below: 

To derive the average runtime complexity of the non-random pivot version of quicksort, we can use the following analysis.

# Average Case Analysis:
In the average case analysis, we consider the expected behavior over all possible inputs. We assume that each element is equally likely to be chosen as the pivot.

# Partition Operation:
Let \(T(n)\) be the time complexity to sort an array of size (n).

1. Partitioning: Partitioning takes O(n) time because we compare each element to the pivot once.

2. Recursion: After partitioning, we have two sub-arrays to sort recursively. The total work done is proportional to the sum of the sizes of the two sub-arrays.

# Mathematical Derivation:

Let (T(n)) be the average time complexity of quicksort with non-random pivot.

[T(n) = {Average time for partitioning} + {Average time for recursion}]

# 1. Average Time for Partitioning:
   - The partitioning step takes O(n) time.

   [Partitioning} = O(n)]

# 2. Average Time for Recursion:
   - After partitioning, we have two sub-arrays. The sizes of these sub-arrays are random variables, and we take the average over all possible scenarios.
   - Let X AND Y be the sizes of the two sub-arrays after partitioning. The average time for recursion is then E[T(X)] + E[T(Y)], where (E) is the expected value.

   E[T(X)]+E[T(Y)]=T(E[X])+T(E[Y])

   - The expected sizes (E[X]) and (E[Y]) can be expressed in terms of (n):
     - (E[X] = n/2)
     - (E[Y] = n/2)

   [T(E[X]) + T(E[Y]) = T(n/2) + T(n/2)]

# 3. Combine the Terms:

T(n) = {Partitioning} + {Recursion}
[T(n) = O(n) + T(n/2) + T(n/2)]

# 4. Solve the Recurrence Relation:
   - The recurrence relation (T(n) = O(n) + 2T(n/2) is a well-known form for quicksort.
   - By solving this recurrence relation, we find that T(n) = O(nlog n).

# Therefore, the average runtime complexity of the non-random pivot version of quicksort is O(nlog n).
