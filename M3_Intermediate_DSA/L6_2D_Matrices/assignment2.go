package main

func SolveA2(A [][]int) []int {
	ans := make([]int, len(A))

	for rowIndex, row := range A {
		var sum int
		for _, col := range row {
			sum += col
		}

		ans[rowIndex] = sum
	}

	return ans
}
