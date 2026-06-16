package main

import "math"

func SolveA3(A []int) int {
	maxValue := math.MinInt
	minValue := math.MaxInt

	for _, val := range A {
		if val > maxValue {
			maxValue = val
		}
		if val < minValue {
			minValue = val
		}
	}

	if maxValue == minValue {
		return 1
	}

	ans := len(A)
	maxIndex := -1
	minIndex := -1

	for index, val := range A {
		if maxValue == val {
			maxIndex = index
			if minIndex != -1 {
				len := maxIndex - minIndex + 1
				if len < ans {
					ans = len
				}
			}
		} else if minValue == val {
			minIndex = index
			if maxIndex != -1 {
				len := minIndex - maxIndex + 1
				if len < ans {
					ans = len
				}
			}
		}
	}

	return ans
}
