package jp.shuma.recruit.studio_umi.work1;

/**
 * Mainクラス．<br>
 * 課題「指定された年の 1 年間の合計秒数を返すプログラムを書いてください．」<br>
 *
 * @author shumaF
 * @since 0.1 2014/09/20 0:30
 */
public class Year {
	/**
	 * 年数を持つ．
	 */
	private int year = 0;
	/**
	 * コンストラクタ．
	 * @param args Command Line Arguments.
	 */
	public Year(int year) {
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
