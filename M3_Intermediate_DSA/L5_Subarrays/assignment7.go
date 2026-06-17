package main

func SolveA7(A []int) [][]int {
	N := len(A)
	size := N * (N + 1) / 2
	ans := make([][]int, 0, size)

	for index := range A {
		for jIndex := index; jIndex < N; jIndex++ {

			subArr := make([]int, jIndex-index+1)
			copy(subArr, A[index:jIndex+1])

			ans = append(ans, subArr)
		}
	}

	return ans
}
