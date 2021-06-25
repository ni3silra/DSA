package com.problemsolving.tree;

public class SortedArrayToBalancedBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public TreeNode sortedArrayToBST(final int[] A) {
		if (A.length == 0) {
			return null;
		}
		if (A.length == 1) {
			return new TreeNode(A[0]);
		}
		return sortedArrayToBSTUtil(A, 0, A.length);
	}

	TreeNode sortedArrayToBSTUtil(int arr[], int start, int end) {
		if (start > end) {
			return null;
		}
		try {
			int mid = (start + end) / 2;
			TreeNode node = new TreeNode(arr[mid]);
			node.left = sortedArrayToBSTUtil(arr, start, mid - 1);
			node.right = sortedArrayToBSTUtil(arr, mid + 1, end);
			return node;
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}

}
