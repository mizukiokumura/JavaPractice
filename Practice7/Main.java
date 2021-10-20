import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
    // 練習問題 7-1
    // Dog dg = new Dog();
    // String name = "武田";
    // dg.SetName(name);
    // dg.ShowProfile();
    // 練習問題 7-2
    // Dog dg = new Dog();
    // String name = "武田";
    // int age = 18;
    // dg.SetName(name);
    // dg.SetAge(age);
    // dg.ShowProfile();
    // 練習問題 7-3
    // Dog dg = new Dog();
    // Dog dg2 = new Dog();
    // String name1 = "信長";
    // int age1 = 20;
    // String name2 = "武田";
    // int age2 = 27;
    // dg.SetName(name1);
    // dg.SetAge(age1);
    // dg2.SetName(name2);
    // dg2.SetAge(age2);
    // dg.ShowProfile();
    // dg2.ShowProfile();
    // 練習問題 7-4
    // Dog dg = new Dog("柴犬");
    // String name = "武田";
    // int age = 3;
    // dg.SetName(name);
    // dg.SetAge(age);
    // dg.ShowProfile();
    // 練習問題 7-6;
     BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        CoinCase MyCase = new CoinCase();

        for( int i = 0 ; i < 10 ; i++ )
        {
            System.out.print( "硬貨の種類は?" );
            int kind = Integer.parseInt( br.readLine() );
            System.out.print( "硬貨の枚数は?" );
            int count = Integer.parseInt( br.readLine() );

            MyCase.AddCoins( kind, count );
        }

        System.out.println( "500円は" + MyCase.GetCount( 500 ) + "枚" );
        System.out.println( "100円は" + MyCase.GetCount( 100 ) + "枚" );
        System.out.println( "50円は" + MyCase.GetCount( 50 ) + "枚" );
        System.out.println( "10円は" + MyCase.GetCount( 10 ) + "枚" );
        System.out.println( "5円は" + MyCase.GetCount( 5 ) + "枚" );
        System.out.println( "1円は" + MyCase.GetCount( 1 ) + "枚" );
        System.out.println( "総額は" + MyCase.GetAmount() + "円" );
    }
  }
}