package main

func getPrefixCount(A []int) []int {
	N := len(A)

	prefixCount := make([]int, N)
	if (A[0] & 1) == 0 {
		prefixCount[0] = 1
	}

	for index := 1; index < N; index++ {
		prefixCount[index] = prefixCount[index-1]
		if (A[index] & 1) == 0 {
			prefixCount[index]++
		}
	}

	return prefixCount
}

func SolveA6(A []int, B [][]int) []int {
	M := len(B)

	prefixCount := getPrefixCount(A)
	ans := make([]int, M)

	for index := range B {
		leftIndex := B[index][0]
		rightIndex := B[index][1]
		count := prefixCount[rightIndex]

		if leftIndex > 0 {
			count -= prefixCount[leftIndex-1]
		}

		ans[index] = count
	}

	return ans
}
