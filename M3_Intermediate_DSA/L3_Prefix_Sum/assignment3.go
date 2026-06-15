package main

func getPrefixSum(A []int) []int64 {
	N := len(A)

	prefixSum := make([]int64, N)
	prefixSum[0] = int64(A[0])

	for index := 1; index < N; index++ {
		prefixSum[index] = prefixSum[index-1] + int64(A[index])
	}

	return prefixSum
}

func RangeSum(A []int, B [][]int) []int64 {
	M := len(B)

	prefixSum := getPrefixSum(A)
	ans := make([]int64, M)

	for index := range B {
		leftIndex := B[index][0]
		rightIndex := B[index][1]
		sum := prefixSum[rightIndex]

		if leftIndex > 0 {
			sum -= prefixSum[leftIndex-1]
		}

		ans[index] = sum
	}

	return ans
}
