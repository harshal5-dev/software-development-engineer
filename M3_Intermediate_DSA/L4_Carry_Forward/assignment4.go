package main

func SolveA4(A string) int64 {
	var ans int64
	count := 0

	for _, ch := range A {
		switch ch {
		case 'A':
			count++
		case 'G':
			ans += int64(count)
		}
	}

	return ans
}
