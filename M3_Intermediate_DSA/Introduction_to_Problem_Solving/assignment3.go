package main

func SolveA3(A int) int {

	for num := 1; num*num <= A; num++ {
		if num*num == A {
			return num
		}
	}

	return -1
}
