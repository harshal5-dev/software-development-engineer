package main

import "sort"

func SolveA1(A []int) int {
	ans := 0

	sort.Slice(A, func(i, j int) bool {
		return A[i] > A[j]
	})

	for i := range A {
		ans += A[i] * (i + 1)
	}

	return ans
}
