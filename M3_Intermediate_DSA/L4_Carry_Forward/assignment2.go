package main

func SolveA2(A []int) []int {
	N := len(A)
	maxValue := A[N-1]
	ans := []int{maxValue}

	for index := N - 2; index >= 0; index-- {
		if A[index] > maxValue {
			maxValue = A[index]
			ans = append(ans, A[index])
		}
	}

	return ans
}
