package main

func SolveA4(A [][]int) int {
	rowIndex := 0
	colIndex := len(A[0]) - 1
	ans := 0

	for colIndex >= 0 {
		ans += A[rowIndex][colIndex]
		rowIndex++
		colIndex--
	}

	return ans
}
