package main

func SolveA7(A []int) [][]int {
	N := len(A)
	size := N * (N + 1) / 2
	ans := make([][]int, size)
	ansIndex := 0

	for index := range A {
		for jIndex := index; jIndex < N; jIndex++ {

			subArr := make([]int, jIndex-index+1)
			sunArrIndex := 0

			for kIndex := index; kIndex <= jIndex; kIndex++ {
				subArr[sunArrIndex] = A[kIndex]
				sunArrIndex++
			}

			ans[ansIndex] = subArr
			ansIndex++
		}
	}

	return ans
}
