package main

func SolveA3(A []int) int {
	var sum int64

	for i := range A {
		sum += int64(A[i])
	}

	if sum%3 == 0 {
		return 1
	}

	return 0
}
