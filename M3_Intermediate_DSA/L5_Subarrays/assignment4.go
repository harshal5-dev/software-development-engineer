package main

func SolveA4(A []int, B int, C int) []int {
	ans := make([]int, C-B+1)
	ansIndex := 0

	for index := B; index <= C; index++ {
		ans[ansIndex] = A[index]
		ansIndex++
	}

	return ans
}
