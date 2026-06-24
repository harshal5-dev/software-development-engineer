package main

func NumSetBits(A int) int {
	ans := 0

	for A > 0 {
		if A&1 == 1 {
			ans++
		}
		A >>= 1
	}

	return ans
}
