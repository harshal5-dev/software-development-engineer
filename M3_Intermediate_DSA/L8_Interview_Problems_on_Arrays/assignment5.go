package main

func MajorityElement2(nums []int) int {
	freq1 := 0
	currEle1 := -1
	freq2 := 0
	currEle2 := -1
	N := len(nums)

	for _, num := range nums {
		if currEle1 == num {
			freq1++
		} else if currEle2 == num {
			freq2++
		} else if freq1 == 0 {
			currEle1 = num
			freq1 = 1
		} else if freq2 == 0 {
			currEle2 = num
			freq2 = 1
		} else {
			freq1--
			freq2--
		}
	}

	freq1, freq2 = 0, 0
	for i := range nums {
		switch nums[i] {
		case currEle1:
			freq1++
		case currEle2:
			freq2++
		}
	}

	if freq1 > N/3 {
		return currEle1
	} else if freq2 > N/3 {
		return currEle2
	} else {
		return -1
	}
}
