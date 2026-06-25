package main

func SolveA2(A []int, B int) int {
	ans := 0
	pow := 1

	for i := len(A) - 1; i >= 0; i-- {
		digit := A[i]
		term := ((digit % B) * (pow % B)) % B
		ans = ((ans % B) + (term % B)) % B
		pow = ((pow % B) * (10 % B)) % B
	}

	return ans
}
