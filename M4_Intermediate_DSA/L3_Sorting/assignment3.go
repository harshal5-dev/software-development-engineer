package main

import "sort"

func countFactors(A int) int {
	count := 0

	for num := 1; num*num <= A; num++ {
		if A%num == 0 {
			if num*num == A {
				count++
			} else {
				count += 2
			}
		}
	}
	return count
}

func SolveA3(A []int) []int {

	sort.Slice(A, func(i, j int) bool {
		factor1 := countFactors(A[i])
		factor2 := countFactors(A[j])

		if factor1 < factor2 {
			return true
		} else if factor1 == factor2 && A[i] < A[j] {
			return true
		}

		return false
	})

	return A
}
