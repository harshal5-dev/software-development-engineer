package main

func SingleNumber(A []int) int {
	ans := 0

	for i := range A {
		ans ^= A[i]
	}

	return ans
}
