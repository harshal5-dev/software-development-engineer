package main

func SolveA2(A []int, B int) int {
	k := 0
	N := len(A)

	for index := range A {
		if A[index] <= B {
			k++
		}
	}

	if k == 0 || k == 1 || k == N {
		return 0
	}

	badElement := 0

	for index := 0; index < k; index++ {
		if A[index] > B {
			badElement++
		}
	}

	s := 1
	e := k
	ans := badElement

	for e < N {
		if A[s-1] > B {
			badElement--
		}
		if A[e] > B {
			badElement++
		}
		s++
		e++

		if badElement < ans {
			ans = badElement
		}
	}

	return ans
}
