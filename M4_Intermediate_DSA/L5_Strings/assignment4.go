package main

func SolveA4(A []int) []int {
	maxLength := 0

	for i := range A {
		if A[i] > maxLength {
			maxLength = A[i]
		}
	}

	countArr := make([]int, maxLength)

	for i := range A {
		countArr[A[i]-1]++
	}

	indexToFill := 0

	for i := range countArr {
		timesToFill := countArr[i]
		numberToFill := i + 1

		for timesToFill > 0 {
			A[indexToFill] = numberToFill
			timesToFill--
			indexToFill++
		}
	}

	return A
}
