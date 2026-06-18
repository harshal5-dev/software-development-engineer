package main

func SolveA3(A [][]int) int {
	index := 0
	ans := 0

	for index < len(A) {
		ans += A[index][index]
		index++
	}

	return ans
}
