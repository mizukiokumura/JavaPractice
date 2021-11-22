import java.util.ArrayList;

class Practice29 {
  public static void main(String[] args) {
    // プログラム作成問題 28

    // int diff1 = diff(5,2);
    // System.out.println(diff1);

    // int diff2 = diff(2,5);
    // System.out.println(diff2);

    // プログラム作成問題 29

    // int total = total(10);
    // System.out.println(total);

    // プログラム作成問題 30

    // int[] nums = { 1, 2, 3, 4, 5};

    // int sum = sumOfArray(nums);
    // System.out.println(sum);

    // プログラム作成問題 31

    // int[] nums = { 1, 2, 3, 4};

    // System.out.println(averageOfArray(nums));

    // プログラム作成問題 32
    // int num = 10;
    // for(int i = 0; i <= 10; i++ ) {
      
    //   System.out.println(num);
    //   num -= 1;
    // }
    
    // // 回答例

    // for (int i = 0; i <= 10; i++) {
    //   System.out.println(10 - i);
    // }

    // プログラム作成問題 33

    // int num = 0;

    // while(num <= 30) {
    //   num++;
    //   if(num % 3 == 0) {
    //     System.out.println(num);
    //   }

    // プログラム作成問題 34

    // ArrayList<String> array = new ArrayList<String>();
    // array.add("武田信玄");
    // array.add("武田信繁");
    // array.add("藤堂高虎");
    // array.add("羽柴秀吉");
    // array.add("長宗我部元親");

    // String max = "";
    // for(String name : array) {
    //   if(name.length() >= max.length() ) {
    //     max = name;
    //   }
    // }
    // System.out.println(max);

    // 回答例

    // ArrayList<String> strList = new ArrayList<>();
    //     strList.add("あいう");
    //     strList.add("あいうえ");
    //     strList.add("あいうえお");
    //     strList.add("かきくけこ");
    //     strList.add("かきくけ");
    //     strList.add("かきく");
 
    //     // 最多文字数を取得
    //     int maxLength = 0;
    //     for(String str : strList) {
    //         if(maxLength < str.length()) {
    //             maxLength = str.length();
    //         }
    //     }
 
    //     // 最多文字数と同じ文字数の文字列を表示
    //     for(String str : strList) {
    //         if(str.length() == maxLength) {
    //             System.out.println(str);
    //         }
    //     }
  }

  // プログラム作成問題 28

  // public static int diff(int a, int b) {
  //   return Math.abs(a - b);
  // }

  // 回答例

  // public static int diff(int x, int y) {
  //   int diff;
  //   if(x > y) {
  //       diff = x - y;
  //   } else {
  //       diff = y - x;
  //   }
 
  //   return diff;
  // }

  // プログラム作成問題 29

  // public static int total(int num) {
  //   int total = 0;
  //   for(int i = 0; i < num; i++) {
  //     total += i + 1;
  //   }
  //   return total;
  // }

  // プログラム作成問題 30

  // public static int sumOfArray(int[] nums) {
  //   int total = 0;
  //   for(int i = 0; i < nums.length; i++) {
  //     total += nums[i];
  //   }
  //   return total;
  // }
  
  // プログラム作成問題 31

  // public static double averageOfArray(int[] nums) {
  //   int avg = 0;
  //   for(int i = 0; i < nums.length; i++) {
  //     avg += nums[i];
  //   }
  //   return (double) avg / nums.length;
  // }
}