package main

func SolveA3(A []int) int {
	firstMax := 0
	firstMaxIndex := -1
	secondMax := 0

	for index := range A {
		if A[index] > firstMax {
			firstMax = A[index]
			firstMaxIndex = index
		}
	}

	for index := range A {
		if A[index] > secondMax && index != firstMaxIndex {
			secondMax = A[index]
		}
	}

	return firstMax + secondMax
}
