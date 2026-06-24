package main

func SolveA4(A int, B int) int {
	return A & ^(1 << B)
}
