package plantAdv;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class plantMain {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean plantGrowup = false;

		//1日目（始まり。プレイヤーが植物の種を買ってきた）
		while (true) {
			System.out.println("1日目");
			System.out.println("馴染みのお花屋さんで花の種を買った。せっかくだから植えよう。");
			System.out.println("そういえば種に水を吸わせるとよく育つって聞いたな…。");
			System.out.println("シーン1: どうする？ (1: 種に水を吸わせる, 2: 種に水を吸わせない)");
			int choice = Integer.parseInt(reader.readLine());

			if (choice == 1) {
				System.out.println("種に水を吸わせた。");

			}

			if (choice != 1) {
				System.out.println("その後、仕事に追われて一日が終わり、植えるのをすっかり忘れてしまった…。");
				System.out.println("終わり");

				continue;

			}


		//2日目（種を植える準備）

			System.out.println("2日目");
			System.out.println("種が水を吸って膨らんでいる。");
			System.out.println("これなら立派に育つかもしれない。");
			System.out.println("種を植える？ (1: 植える, 2: 植えない)");
			choice = Integer.parseInt(reader.readLine());

				System.out.println("植木鉢に種を入れて土を被せ、水をあげた。");

			 if (choice != 1) {
					System.out.println("やる気が無くなって寝ていたら、植えるのをすっかり忘れてしまった…。");
					System.out.println("終わり");
					continue;

			}

			 //3日目（少し芽が出た）
			 System.out.println("3日目");
			  System.out.println("ほんの少し芽が出ている。");
			  System.out.println("何日か根気よく水をあげてみよう。");
			  System.out.println("どのくらいあげたらいいのかな…。");
			  System.out.println
			  ("あげすぎに気を付けて、ジョウロで植物に水を与えよう。（回数を入力してください）");


			   choice = Integer.parseInt(reader.readLine());
				for (int i = 0; i < choice; i++) {
					System.out.println("ちょろ…");
				}
				System.out.println("慎重に水をあげた。");
				System.out.println("大きく育ってくれるかな？");

				if (choice != 2) {
					System.out.println("その後、芽は全く成長しなかった。");
					if (choice <=1) {
						System.out.println("そのまま枯れてしまって悲しかった。");
					} else {
						System.out.println("水をあげすぎて根腐れを起こしてしまった…。");
					}
					System.out.println("終わり");
					continue;

				}

			//7日目（芽が成長してきた）
			System.out.println("7日目");
			System.out.println("芽が段々大きくなってきた。");
			System.out.println("このまま無事に育ってくれるだろうか。");
			System.out.println("そういえば、この部屋は日当たりが悪い。");
			System.out.println("植木鉢を日当たりの良いベランダに置こうかな？");
			System.out.println("どうする？ (1:何もしない 2:ベランダに置く)");

			choice = Integer.parseInt(reader.readLine());

			System.out.println("植木鉢をベランダに置いた。");
			System.out.println("日差しが程よく降り注いでいる。");
			System.out.println("きっと今より成長してくれる筈だ。");

			 if (choice != 2) {
					System.out.println("面倒なのでそのままにしておいた。");
					System.out.println("芽はそれ以上成長することなく、そのまま萎れてしまった…。");
					System.out.println("終わり");
					continue;

		}
			 //8日目（嵐がやってきた）
			 System.out.println("8日目");
			 System.out.println("芽はどんどん伸びて、しっかりとした枝葉が育ってきている。");
			 System.out.println("『次は天気予報をお知らせします』");
			 System.out.println("…ニュース番組から天気予報が流れている…");
			 System.out.println("『最近は良い天気ですが、明日は一段と強い嵐になる恐れがあります』");
			 System.out.println("気象予報士と思われる老年の男が、ゆっくり話し始めた。");
			 System.out.println("『不要な外出は控え、自宅で過ごすことを心がけて下さい』");
			 System.out.println("その言葉を聞きながら私は「ふーん」と思った。");
			 System.out.println("私は在宅勤務だから問題ないけど…");
			 System.out.println("あの鉢植えは部屋に置いた方がいいのかな？");
			 System.out.println("でもベランダは屋根もついてるし、そのままでも平気かな…");
			 System.out.println("鉢植えをどうする？ (1:部屋にしまう 2:そのままにする)");

			 choice = Integer.parseInt(reader.readLine());

				if (choice == 1) {
					System.out.println("鉢植えを室内に移動させた。");
					System.out.println("早く嵐が過ぎてほしい。");
					plantGrowup = true;

				}

				if (plantGrowup == false) {
						System.out.println("まぁ、何もしなくても問題ないかな。");
						System.out.println("いつも通り水をあげておくか。");
						System.out.println("もう遅い時間だし、そろそろ寝よう。");
						//次の日（選択肢はあるが、どちらを選んでもバッドEDなので影響なし）
						System.out.println("次の日");
						System.out.println("嵐が来る様子はない。天気予報は外れたのかな");
						System.out.println("いつも通り水やりしようかな…。");
						System.out.println("でも土は湿っている。どうしよう？");
						System.out.println("1:水を少なめにあげる 2:水はあげない");

						choice = Integer.parseInt(reader.readLine());
						if (choice == 1) {
							System.out.println("少しだけあげておこう。");
							System.out.println("このまま育ってくれたらいいな。");
						}else {
							System.out.println("あげすぎも良くないから止めておこう。");
							System.out.println("さて、仕事に戻るか。");

						}
				if (plantGrowup == false) {
						System.out.println("………ゴロゴロゴロゴロ………");
						System.out.println("ピシャーン！！！！");
						System.out.println("……ザーザー……ザーザー……");

						System.out.println("…その翌日、朝からとんでもない雷雨が降った。");
						System.out.println("風の唸り声も聞こえてくる。");
						System.out.println("ベランダの屋根から大雨が染み出し、");
						System.out.println("そこに晒された鉢植えは枯れてしまった…。");
						System.out.println("終わり");
						continue;
					}
				}
				//9日目（嵐が来る。選択肢なし）
				System.out.println("9日目");
				System.out.println("ザーザー……ザーザー……");
				System.out.println("雨が地面を強く叩きつけている。予報通り、酷い天気だ。");
				System.out.println("ゴオォォ……ゴオオォ……");
				System.out.println("嵐は激しく吹き荒れており、どことなく不気味さを感じさせる。");
				System.out.println("鉢植えを避難しておいて正解だった。");
				System.out.println("土は…湿っている。");
				System.out.println("今日はこのままにしておこう。");
				System.out.println("さて、そろそろ仕事にとりかかろうか。");


				//10日目（嵐が去る）
				System.out.println("10日目");
				System.out.println("チュンチュン……チュンチュン……");
				System.out.println("のどかな雀の鳴き声が聞こえてくる。");
				System.out.println("昨日までの悪天候が、嘘みたいな快晴だった。");
				System.out.println("鉢植えは……小さいけれど、いつの間にやら蕾を付けている。");
				System.out.println("もう嵐は去った。鉢植えはベランダに戻そうかな。");
				System.out.println("でももうかなり育っているし、また室内でお世話してもいいかも…。");
				System.out.println("(1:鉢植えをベランダに移す 2:鉢植えを室内に置く)");

				choice = Integer.parseInt(reader.readLine());

				System.out.println("やっぱりベランダに置いておこう。");
				System.out.println("…うん、これで良し。");
				System.out.println("さっき水もあげたから、きっと大丈夫。");
				System.out.println("また天気が悪くなったら置き場所を変えよう。");


				if (choice != 1) {
					System.out.println("部屋で様子を見たいし、ここに置いておこう。");
					System.out.println("早く咲いてくれないかな…。");

					//次の日（ゲームオーバー）
					System.out.println("ガシャーン！！！！");
					System.out.println("翌日。随分大きな音が聞こえて、慌てて飛び起きた。");
					System.out.println("一体何があったんだ！？");
					System.out.println("あっ……！");
					System.out.println("『にゃーん』");
					System.out.println("割れて土まみれになった鉢植えと、飼い猫のタマがそこにいた。");
					System.out.println("どうもタマが鉢植えにイタズラしたみたいだ。");
					System.out.println("「タマ、大丈夫！？」");
					System.out.println("タマの身体を抱いてよく観察するが、ケガはどこにもない。");
					System.out.println("『……んにゃあん……』");
					System.out.println("申し訳ないと思ったのか、タマは小さく鳴く。そしてするりと抜けてどこかへ行った。");
					System.out.println("やってしまった。油断して鉢植えを室内に置いたのがまずかった。");
					System.out.println("せめてタマの届かない場所に置いておけば良かった。");
					System.out.println("その後鉢植えを植え替えたが、その甲斐もなく枯れた…。");
					System.out.println("終わり");
					continue;
				}

				//11日目（花が咲く。ゲームクリア）
				System.out.println("11日目");
				System.out.println("今日は久しぶりの休みだ。");
				System.out.println("いつもより遅く起きて朝食を取った。");
				System.out.println("あの鉢植え、どうなってるだろう。ちゃんと育っていればいいけど…。");
				System.out.println("恐る恐る窓を開けてベランダに出る。");
				System.out.println("あっ！！");
				System.out.println("小さいけれど可憐な花が一輪、見事に咲いている。");
				System.out.println("よく見たら他にも蕾がついているし、徐々に開花しているものもあった。");
				System.out.println("無事に咲いたんだ、やったー！！");
				System.out.println("その後。花はやがて実を結び、たくさんの種が取れた。");
				System.out.println("今度はもっと大きなプランターに植えようかな？ とても楽しみだ。");
				System.out.println("THE END");
}
	}
	}
