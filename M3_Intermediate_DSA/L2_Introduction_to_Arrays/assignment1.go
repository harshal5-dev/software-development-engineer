package main

func SolveA1(A []int) int {
	var maxVal int
	ans := 0

	for _, val := range A {
		if val > maxVal {
			maxVal = val
		}
	}

	for _, val := range A {
		if val != maxVal {
			ans++
		}
	}

	return ans
}
