int n = nums.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {   // by default array mai 0 rehta hai
                temp[index++] = nums[i];
            }
        }

        System.out.println("New Array is: " +Arrays.toString(temp))