package main

func MaxSubarray(A int, B int, C []int) int {
	var ans int

	for index := range C {
		var sum int
		for jIndex := index; jIndex < A; jIndex++ {
			sum += C[jIndex]

			if sum > B {
				sum -= C[jIndex]
				break
			}
		}

		if sum > ans {
			ans = sum
		}
	}

	return ans
}
