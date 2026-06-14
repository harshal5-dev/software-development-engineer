package main

func SolveA1(A int) int {
	var ans int

	for num := 1; num*num <= A; num++ {
		if A%num == 0 {
			if num*num == A {
				ans++
			} else {
				ans += 2
			}
		}
	}

	return ans
}
