package main

func calPrefixSum(A []int) []int {
	N := len(A)

	prefixSum := make([]int, N)
	prefixSum[0] = A[0]

	for index := 1; index < N; index++ {
		prefixSum[index] = prefixSum[index-1] + A[index]
	}

	return prefixSum
}

func SolveA5(A []int) int {
	N := len(A)
	prefixSum := calPrefixSum(A)

	if prefixSum[N-1]-prefixSum[0] == 0 {
		return 0
	}

	for index := 1; index < N; index++ {
		leftSum := prefixSum[index-1]
		rightSum := prefixSum[N-1] - prefixSum[index]

		if leftSum == rightSum {
			return index
		}
	}

	return -1
}
