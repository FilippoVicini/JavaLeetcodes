public class test {
  public static void main(String[] args) {
    int[] nums = new int[] { 1, 2, 3, 4 };
    System.out.print(canJump(nums));

  }

  // Opimized O(n) and O(1) solution
  public static boolean canJump(int[] nums) {
    int goal = nums.length - 1;

    for (int i = nums.length - 2; i >= 0; i--) {
      if (i + nums[i] >= goal) {
        goal = i;
      }
    }

    return goal == 0;

  }

  //
   * 
   * 
   * blic static boolean ca
   * 
   * i
   * 
   * }
   * 
   * (int i = 0; 
   *  (nums[i] >=
   *  
   *  
   *   }
   * 
   * (int i = 1; i
   * i
   *  
   *   }
   *  
     return jump;
  }
  */
}
