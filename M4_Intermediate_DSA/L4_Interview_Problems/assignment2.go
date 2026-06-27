package main

func SolveA2(A []int) int {
	N := len(A)
	ans := 0

	for i := range A {
		left := 0
		right := 0

		for j := i - 1; j >= 0; j-- {
			if A[j] < A[i] {
				left++
			}
		}

		for j := i + 1; j < N; j++ {
			if A[j] > A[i] {
				right++
			}
		}

		count := left * right
		ans += count
	}

	return ans
}
