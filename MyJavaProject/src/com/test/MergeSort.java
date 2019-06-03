package com.test;

public class MergeSort {
	int[] array;
	int[] tempMergeArray;
	int length;

	public static void main(String[] args) {
		int[] inputArr = { 48, 36, 13, 52, 19, 94, 21 };
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		for (int i : inputArr) {
			System.out.println(i + " ");
		}
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArray = new int[length];
		divideArray(0, length - 1);
	}

	public void divideArray(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			divideArray(lowerIndex, middle);
			divideArray(middle + 1, higherIndex);
			meargArray(lowerIndex, middle, higherIndex);
		}
	}

	public void meargArray(int loverIndex, int middle, int higherIndex) {
		for (int i = loverIndex; i <= higherIndex; i++) {
			tempMergeArray[i] = array[i];
		}
		int i = loverIndex;
		int j = middle + 1;
		int k = loverIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergeArray[i] <= tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;
			} else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}
	}
}
