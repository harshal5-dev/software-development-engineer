package main

func SolveA1(A []int, B []int) []int {
	studentMap := make(map[int]int)
	ans := make([]int, len(B))

	for i := range A {
		if v, exists := studentMap[A[i]]; exists {
			studentMap[A[i]] = v + 1
		} else {
			studentMap[A[i]] = 1
		}
	}

	for i := range B {
		if v, exists := studentMap[B[i]]; exists {
			ans[i] = v
		} else {
			ans[i] = 0
		}
	}

	return ans
}
