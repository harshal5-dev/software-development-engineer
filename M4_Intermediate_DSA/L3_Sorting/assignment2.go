package main

import "sort"

func SolveA2(A []int) int {
	count := 0

	sort.Slice(A, func(i, j int) bool {
		return A[i] > A[j]
	})

	if A[0] == 0 {
		return 1
	}

	for i := 1; i < len(A); i++ {
		if A[i] != A[i-1] {
			count = i
		}
		if A[i] == count {
			return 1
		}
	}

	return -1
}
