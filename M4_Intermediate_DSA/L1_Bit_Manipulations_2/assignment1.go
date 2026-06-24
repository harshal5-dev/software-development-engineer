package main

func SolveA1(A int, B int) int {

	if (A & (1 << B)) != 0 {
		return 1
	}

	return 0
}
