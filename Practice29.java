import java.util.ArrayList;
import java.util.*;

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

    // プログラム作成問題 35

    // String[] arrayList = { "abcde", "dsbd", "okad", "nums", "ddsa", "mumuq", null}; // nullでlengthメソッドを使ってしまうとエラーになる。
    // for(int i = 0; i < arrayList.length; i++) {
    //   if(arrayList[i] != null) {
    //     for(int n = 0; n < arrayList[i].length(); n++) {
    //       if(arrayList[i].charAt(n) == 'a') {
    //         System.out.println(arrayList[i]);
    //       }
    //     }
    //   }
    // }

    // 回答例

    // String fruits[] = { "banana", "apple", "acerola", null, "grape" };
 
    //     for (String fruit : fruits) {
    //         if (fruit == null) {
    //             continue;
    //         }
    //         if (fruit.charAt(0) == 'a') {
    //             System.out.println(fruit);
    //         }
    //     }

    // プログラム作成問題 36

    // int num = 1234;
    // int len = String.valueOf(num).length();
    // int d = (int)Math.pow(10, len - 1);
    // for(int i = 1; i <= len; i++) {
    //   if(num / d == 3) {
    //     System.out.println(num);
    //   }
    //   num %= d;
    //   d /= 10;
    // }

    // 回答例

    // int num = 321;
    // int temp = num;
    // String result = "3は含まれていません";

    // while(temp > 0) {
    //   if(temp % 10 == 3) {
    //     result = "3が含まれています";
    //     break;
    //   }
    //   temp /= 10;
    // }
    // System.out.println(result);

    // プログラム作成問題 37

    // int num = 123;

    // int one = num % 10;
    // int ten = one % 10;
    // int hyaku = ten % 10;
    // if(one == ten || ten == hyaku || one == hyaku) {
    //   System.out.println("同じ数字は含まれています");
    // } else {
    //   System.out.println("同じ数字は含まれていません");
    // }

    // // 回答例

    // int num = 121;
    // String strNum = String.valueOf(num);

    // String result = "同じ数字は含まれていません";

    // outerFor: for (int i1 = 0; i1 < strNum.length() - 1; i1++) {
    //     for (int i2 = 1; i2 < strNum.length(); i2++) {
    //         if (i1 == i2) {
    //             continue;
    //         }
    //         if (strNum.charAt(i1) == strNum.charAt(i2)) {
    //             result = "同じ数字が含まれています";
    //             break outerFor; // これはラベル付きのbreak文と呼ばれるもので、break ラベル名;と記述することで、ラベル名(任意)の処理を停止させることができる。この場合だと、親のfor文に書かれているので、親の処理を停止させることができる。
    //         }
    //     }
    // }
    // System.out.println(result);

    // プログラム作成問題 38

    // char[] chars = { 'a','p','p','l','e'};
    // char s = 'p';
    // int n = 0;
    // System.out.println("検索文字:" + s);

    // for(int i = 1; i <= chars.length; i++) {
    //   if(chars[i] == s) {
    //     n = 1;
    //     break;
    //   } else {
    //     n = -1;
    //   }
    // }
    // System.out.println("表示結果:" + n);

    // プログラム作成問題 39

    // char[] chars = {'a','p','p','l','e'};
    // char n = 'p';
    // int u = -1;
    // for(int i = 1; i <= chars.length - 1; i++) {
    //   if(chars[i] == n) {
    //     u = i;
    //   } 
    // }
    // System.out.println(u);

    // // 回答例
    // char chars[] = { 'a', 'p', 'p', 'l', 'e' };
 
    // char key = 'p';
    // int index = -1;

    // for(int i = chars.length - 1; i >= 0; i--) { // 逆からfor文を回しているというところがなるほどなと思った。
    //   if(chars[i] == key) {
    //     index = i;
    //     break;
    //   }
    // }

    // System.out.println(index);

    // プログラム作成問題 40
    // Scanner sc = new Scanner(System.in);
    // char[] chars = { 'a', 'p', 'p', 'l', 'e'};
    // int count = 0;
    // char search = sc.next().charAt(0);

    // for(int i = 1; i <= chars.length - 1 ; i++) {
    //   if(chars[i] == search) {
    //     count++;
    //   }
    // }
    // System.out.println("検索文字:" + count);

    // プログラム作成問題 41

    // char[] chars = {'a', 'p', 'p', 'l', 'e'} ;// { 'o', 'r', 'a', 'n', 'g', 'e'} ;
    // int charNum = chars.length - 1;
    // int num = 0;
    // for(int i = 0; i < charNum; i++) {
    //   int count = 0;
    //   for(int u = 0; u < charNum; u++) {
    //     if(chars[i] == chars[u]) {
    //       count++;
    //       if(count >= 2) {
    //         num = count;
    //       }
    //     }
    //   }
    // }
    // if(num >= 2) {
    //   System.out.println("要素が重複しています");
    // } else {
    //   System.out.println("要素が重複していません");
    // }

    // 回答例
    // char[] chars = { 'a', 'p', 'p', 'l', 'e' };
    // boolean isDuplicated = false; // boolean型で判定することで、条件式を省略できる。

    // for(int i1 = 0; i1 < chars.length - 1; i1++) {
    //     for(int i2 = i1 + 1; i2 < chars.length; i2++) { // i1に対して+1をする事で、i1の次の要素からか判定がしていける。
    //       if(chars[i1] == chars[i2]) {
    //         isDuplicated = true; 
    //         break; // このbreak文はもう重複が確定した段階でそれ以上回す必要ないよねという意味だと思われる
    //       }
    //     }
    //   if(isDuplicated) { // 上のif文以外にboolean型の判定を変えるものがないのにどうしてもう一度書かれているのか。
    //     break; 
    //   }
    // }

    // if(isDuplicated) {
    //     System.out.println("要素が重複しています");
    // } else {
    //     System.out.println("要素が重複していません");
    // }
    

    // プログラム作成問題 42

    // double d = 3.14;
    // int num = (int)d;

    // System.out.println(num);

    // 回答例

    // double d = 12.34;
 
    // String str = "" + d;

    // for(int i = 0; i < str.length(); i++) {
    //   if(str.charAt(i) == '.') { // ここの条件式で'.'に到達した場合にbreakして周回を終わらせている。
    //     break;
    //   }
    //   System.out.print(str.charAt(i)); // 周回が終わるまで、charAtで文字になった数値を表示し続ける。
    // }

    // プログラム作成問題 43;
    
    // char n = 'あ';

    // int nn = (int)n + 1;
    // char nnn = (char)nn;
    // System.out.println(nnn);

    // // 回答例

    // char c = 'a';
 
    // System.out.println((char)(c + 1));


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