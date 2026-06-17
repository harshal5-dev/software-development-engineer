package main

func SubarraySum(A []int) int64 {
	var ans int64
	N := len(A)

	for index, val := range A {
		var count int64 = int64((index + 1) * (N - index))
		ans += count * int64(val)
	}

	return ans
}
