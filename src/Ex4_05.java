public class Ex4_05 {
    String title;
    String author;

    public Ex4_05 () {
        this("헤리포터", "잘 몰라");
        //title = "해리포터"; author = "잘 몰라";
    }
    public Ex4_05(String title) {
        this(title, "작자미상");
        //title = t; author = "작자 미상";
    }

    public Ex4_05(String title, String author) {
       this.title=title; this.author=author;
       //title = t; author = a;
    }
    public static void main(String[] args) {
       Ex4_05 foo = new Ex4_05();
       Ex4_05 loveStroy = new Ex4_05("춘향전");
       Ex4_05 littlePrince = new Ex4_05("어린왕자", "생텍쥐페리");
       System.out.println(foo.title + "" + foo.author );
       System.out.println(loveStroy.title + "" + loveStroy.author );
       System.out.println(littlePrince.title + "" + littlePrince.author );
    }
}