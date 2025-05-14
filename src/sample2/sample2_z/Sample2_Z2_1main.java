package sample2.sample2_z;
/*
【「Fizz Buzz」のルール】
・1から順にカウントアップして発言していく
・3で割り切れる数値の場合は数値の代わりに「Fizz」と発言する
・5で割り切れる数値の場合は数値の代わりに「Buzz」と発言する
・3,5の両方で割り切れる数値の場合は数値の代わりに「Fizz Buzz」と発言する
*/

import sample2.sample2_z.sample.Sample2_Z2_1sub;

class Sample2_Z2_1main {
	public static void main (String[] args) {

		int receiveNumber = Integer.parseInt(args[0]);

		Sample2_Z2_1sub sb = new Sample2_Z2_1sub();

		sb.executeFizzBuzz( receiveNumber );

		System.out.println("■■■処理終了■■■");


	}
}
