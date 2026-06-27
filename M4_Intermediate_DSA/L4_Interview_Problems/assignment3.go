package main

func getX(A int) int {
	x := 1

	for x <= A {
		x <<= 1
	}

	return x >> 1
}

func SolveA3(A int) int {
	x := getX(A)
	kills := A - x
	return 2*kills + 1
}
