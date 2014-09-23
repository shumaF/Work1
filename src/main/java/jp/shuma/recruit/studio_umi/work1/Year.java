package jp.shuma.recruit.studio_umi.work1;

import java.util.InputMismatchException;
/**
 * Yearクラス．<br>
 * 年数を持ち，各時間単位への変換を行うメソッドを持つ．<br>
 * グレゴリオ暦(紀元後を対象とする)．
 * @author shumaF
 * @version 0.2 2014/09/23 11:20
 * @since 0.1 2014/09/20 0:30
 */
public class Year {
	/**
	 * 年数を持つ．<br>
	 * 0以上の値を持つ(=紀元後)．
	 */
	private int year = 0;
	/**
	 * コンストラクタ．
	 * @param args Command Line Arguments.
	 * @throws java.util.InputMismatchException 紀元前が入力された場合．
	 */
	public Year(int year) throws InputMismatchException {
		if(year < 0) {
			throw new InputMismatchException();
		}
		this.year = year;
	}
	/**
	 * 閏年かどうかを判定する．
	 * @return 閏年かどうか．trueならば，閏年，falseならば，閏年ではない．
	 */
	public boolean isLeapYear() {
		if ((year % 4 == 0 && year % 100 != 0) || 
			  (year % 400 == 0)) {
            return true;
		} else {
        	return false;
        }
	}
	/**
	 * 対象の一年間の日数を返す．
	 * @return 一年間の日数．
	 */
	public int toDay() {
		if(this.isLeapYear()) {
			return 366;
		} else {
			return 365;
		}
	}
	/**
	 * 対象の一年間の時間を返す．
	 * @return 一年間の日数．
	 */
	public int toHour() {
		return this.toDay() * 24;
	}
	/**
	 * 対象の一年間の分を返す．
	 * @return 一年間の日数．
	 */
	public int toMinute() {
		return this.toHour() * 60;
	}
	/**
	 * 対象の一年間の秒数を返す．
	 * @return 一年間の日数．
	 */
	public int toSecond() {
		return this.toMinute() * 60;
	}
}
