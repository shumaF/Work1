package jp.shuma.recruit.studio_umi.work1;

/**
 * Mainクラス．<br>
 * 課題「指定された年の 1 年間の合計秒数を返すプログラムを書いてください．」<br>
 *
 * @author shumaF
 * @since 0.1 2014/09/20 0:30
 */
public class Main {
	/**
	 * コンストラクタ．<br>
	 * 一連の処理を逐次に行う．<br>
	 * 入力 -> Yearオブジェクト作成 -> 秒を取得 -> 出力
	 * @param args Command Line Arguments.
	 */
	public Main(String[] args) {
		int num = this.inputInt(args[0]);
		Year year = new Year(num);
		int sec = year.toSecond();
		System.out.println(sec);
	}
	/**
	 * 入力された数を返す．<br>
	 * 引数がnullの場合は，入力を受け付ける．<br>
	 * ~ とりあえずは，引数の場合のみ．
	 * @param arg intへ変換する数．<br>
	 *            nullの場合は，入力を受け付ける．
	 * @return 入力された数．
	 */
	public int inputInt(String arg) {
		int num = Integer.parseInt(arg);
		return num;
	}
	/**
	 * mainメソッド．
	 * @param args Command Line Arguments.
	 */
    public static void main(String[] args) {
    	new Main(args);
    }
}
