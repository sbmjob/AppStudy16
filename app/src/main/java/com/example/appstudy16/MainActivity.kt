package com.example.appstudy16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //表示用データ作成
        val data= listOf(
            ListItem(1,"東京","Tokyo","（とうきょうと、（英: Tokyo Metropolis）は、日本の首都。関東地方に位置する都。都庁所在地は新宿区","to"),
            ListItem(2,"北海道","Hokkaido","（ほっかいどう、（英: Hokkaido）は、日本の北海道地方に位置する道。日本列島を構成する主要4島のひとつで、日本の北部に位置する島。道庁所在地は札幌市。","dou"),
            ListItem(3,"京都","Kyoto","令制国でいう山城国の全域、丹波国の東部および丹後国の全域を府域とする。恭仁京（木津川市）や長岡京（向日市・長岡京市・京都市西京区）、平安京（京都市）など、日本の首都が置かれていた歴史がある古都である。","fu"),
            ListItem(4,"大阪","Osaka","（おおさかふ、（英: Osaka Prefecture）は、日本の近畿地方に位置する府。府庁所在地は大阪市。","fu"),
            ListItem(5,"神奈川","Kanagawa","かながわけん、（英: Kanagawa Prefecture）は、日本の関東地方に位置する県。県庁所在地は横浜市。","ken"),
            ListItem(6,"愛知","Aichi","（あいちけん、（英: Aichi Prefecture）は、日本の中部地方に位置する県。県庁所在地は名古屋市。\n" +
                    "日本列島の中央部にあたり、人口は東京都、神奈川県、大阪府に次いで4番目に多い。名古屋市は中部地方最大の人口を擁し、同地方における中心都市となっている。","ken"),
            ListItem(7,"静岡","Shizuoka","（しずおかけん、（英: Shizuoka Prefecture）は、日本の中部地方に位置する県。県庁所在地は静岡市。","ken"),
            ListItem(8,"千葉","Chiba","（ちばけん、（英: Chiba Prefecture）は、日本の関東地方に位置する県。県庁所在地は千葉市。\n" +
                    "首都圏を構成し、都道府県人口・人口密度は第6位[1]、県の財政力指数は全国第5位[2]、面積は第28位の規模である。","ken"),
            ListItem(9,"埼玉","Saitama","（さいたまけん、（英: Saitama Prefecture）は、日本の関東地方に位置する県。県庁所在地はさいたま市。","ken"),
            ListItem(10,"山梨","Yamanashi","やまなしけん、（英: Yamanashi Prefecture）は、日本の中部地方に位置する県。県庁所在地は甲府市。","ken"),
            ListItem(11,"群馬","Gunma","ぐんまけん、（英: Gunma Prefecture）は、日本の関東地方に位置する県。県庁所在地は前橋市。","ken"),
            ListItem(12,"福岡","Fukuoka","ふくおかけん、（英: Fukuoka Prefecture）は、日本の九州地方に位置する県。県庁所在地は福岡市。","ken")
        )
        //リサイクルヴュー変数作成とセット
        val rv = findViewById<RecyclerView>(R.id.rv)

        rv.setHasFixedSize(true)

        rv.layoutManager=LinearLayoutManager(this).apply {
            orientation = LinearLayoutManager.VERTICAL//縦のリスト設定
        }
        //データの流し込み
        rv.adapter = MyListAdapter(data)


    }
}