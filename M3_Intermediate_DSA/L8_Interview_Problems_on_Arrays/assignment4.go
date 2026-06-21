package main

func MajorityElement(A []int) int {
	freq := 1
	currEle := A[0]

	for i := 1; i < len(A); i++ {
		if freq == 0 {
			currEle = A[i]
			freq = 1
		} else if currEle == A[i] {
			freq++
		} else {
			freq--
		}
	}

	return currEle
}
