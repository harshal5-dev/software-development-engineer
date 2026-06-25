package main

func SolveA1(A int, B int, C int) int {
	ans := 1

	for i := 1; i <= B; i++ {
		ans = ((ans % C) * (A % C)) % C
	}

	return ans
}
