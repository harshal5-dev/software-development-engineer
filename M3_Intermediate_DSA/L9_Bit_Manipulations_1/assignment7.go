package main

func SolveA7(A int, B int) int {
	pow := 1
	ans := 0

	for A > 0 {
		digit := A % 10
		ans += digit * pow
		A /= 10
		pow *= B
	}

	return ans
}
