package jp.shuma.recruit.studio_umi.work1;

import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
/**
 * Mainクラス．<br>
 * 課題「指定された年の 1 年間の合計秒数を返すプログラムを書いてください．」<br>
 * なお，本プログラムは，グレゴリオ暦，かつ，紀元後を対象とする．<br>
 * @author shumaF
 * @version 0.2 2014/09/23 11:20
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
		try {
			int num = this.inputInt(args.length == 0 ? null : args[0]);
			Year year = new Year(num);
			int sec = year.toSecond();
			System.out.println(sec);
		} catch(InputMismatchException e) {
			System.err.println("入力は0以上の整数で行ってください．");
			return;
		}
	}
	/**
	 * 入力された数を返す．<br>
	 * 引数がnullの場合は，入力を受け付ける．<br>
	 * ~ とりあえずは，引数の場合のみ．
	 * @param arg intへ変換する数．<br>
	 *            nullの場合は，入力を受け付ける．
	 * @return 入力された数．
	 * @throws java.util.InputMismatchException 入力が数値になっていない．
	 */
	public int inputInt(String arg) throws InputMismatchException {
		int num = 0;
		try {
			if(arg  == null) {
				Scanner scan = new Scanner(System.in);
				num = scan.nextInt();
			} else {
				num = Integer.parseInt(arg);
			}
		}  catch(NumberFormatException e) {
			throw new InputMismatchException(); 
			//入力の値がちがうことから，InputMismatchExceptionと
			//同じであると考え，InputMismatchExceptionとして処理する．
		} catch(NoSuchElementException e) {
			e.printStackTrace();
		} catch(IllegalStateException e) {
			e.printStackTrace();
		}
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
