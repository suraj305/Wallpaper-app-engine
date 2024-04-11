package com.sadpoetry.blackwallpapers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<customItems> itemsList;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        itemsList = new ArrayList<>();

        itemsList.add(new customItems("https://www.hdwallpapers.in/download/spider_man_ps4_game_4k_3-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/2f/3a/f8/2f3af8633b3b45a3a2ff31455e292f83.jpg"));
        itemsList.add(new customItems("https://c4.wallpaperflare.com/wallpaper/1014/816/853/batman-batman-logo-minimalism-portrait-display-wallpaper-preview.jpg"));
        itemsList.add(new customItems("https://www.jakpost.travel/wimages/large/200-2003533_blurry-full-hd-4k-mobile-wallpaper-screen-wallpaper.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/94/4e/db/944edbb21a421464e657ec8884d9de1a.jpg"));
        itemsList.add(new customItems("https://movieposterhd.com/wp-content/uploads/2019/01/Mobile-Wallpaper-Spider-Man-Into-the-Spider-Verse.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/pFcRfMR7sbbK-sUsQYDq2zqRbIloO5MMdeaSYK6q4KsSFUkjaOL5MMz-RCAXl3hvgD9aS75PLAOqncFKieNAG8ADsW1HxKnHOGd0_Gl5OidYGUA-l8R0014zL62gCx2-b2tfu185K5vfuL55FA"));
        itemsList.add(new customItems("https://movieposterhd.com/wp-content/uploads/2019/04/Mobile-Wallpaper-HD-Avengers-Endgame-2019.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/474x/3e/b1/6c/3eb16c07ff522972843e954a019ad09e.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/474x/d3/16/05/d3160520177871ea3b049b2d909f02f9.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/1a/4a/fb/1a4afbbbd96f8c7f2fbb1c3b16b96047.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/57/97/7b/57977b999cc8d6d8a85e3aa4fb0a5f78.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/8e/bc/f8/8ebcf8b25250555fff2738fe1ab1f84d.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/cc/5c/22/cc5c220fb761d336f7e3214fc54ed2f4.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/8f/a8/89/8fa889d3d5138f8d79313223cf8c9582.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/9e/2d/72/9e2d72ad158f2fb9686087ab43563172.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/be/66/48/be6648700946a9ea1799a439432a842a.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/39/fc/f9/39fcf97499c538d3a696ecef0c237e1e.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/95/4b/fd/954bfdc3ec0f1c94b21058bd664cb6d4.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/13/f2/f5/13f2f59c26ddbb985d9f4ec31b909e37.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/56/35/5e/56355efc4e867a6271c25a9690af2774.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/5a/1c/bb/5a1cbbaf5e145d131b277553d24d9d45.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/a9/d7/24/a9d7242bec0d04b963248c734475956d.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/f0/d3/9c/f0d39ce4edbbbd2f636c15b014b1a945.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/94/f3/5b/94f35b2a45e7fd74cd1ef91bff34b6e2.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/5e/dc/97/5edc97c0316d40913da32132608cca63.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/4e/66/de/4e66de009698d6864e02a306391a26ff.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/99/97/1b/99971b8cebb131961ea07a95ef87d8bf.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/7c/fe/26/7cfe260532fa4e6edf1075132ed7b039.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/45/4a/ab/454aab26cd385aa801adea5f3f7c4744.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/a1/e2/ef/a1e2ef59dbe84cf756a3af724b212679.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/8a/b0/df/8ab0df630af303d8930c71a89fca3f55.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/2d/31/d1/2d31d16aaed6c31d840b48263f723b2a.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/40/ad/89/40ad8999148319342545382c95034be9.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/30/51/7f/30517fe76f087d6fe15a497fdcf0d7d5.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/ae/93/a7/ae93a79f5c1a69f0e1cb0bc7bd3f517e.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/d5/6d/23/d56d236d4b21b73476d411145e4cd7a5.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/9b/eb/c0/9bebc06dc5e172ff43c72ed220dcfba7.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/5f/a0/4d/5fa04da1c8a892c14a63db8280590186.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/ee/cd/34/eecd343cf40588dbe4fdc45b31abe119.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/47/ed/92/47ed92e88c3038a37020f186f63ab5e2.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/73/c9/83/73c983896d30466612b350c56119e499.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/a5/86/e9/a586e90d4378b3efc31b3417e2d35679.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/a4/13/3f/a4133ffba46271eb671105ea816fc06f.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/f2/84/f3/f284f3c4713373a31429e074ccff46ed.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/fe/6e/cd/fe6ecdd328aabeeaf038c0405b0972a8.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/94/24/22/9424227749d092b85ae74908a35e29e7.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/83/4c/d0/834cd0ace742deaa4ea7e0392da7f701.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/e2/b4/6d/e2b46d7e00ceace4a01b3115033d2f6e.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/e5/ed/6c/e5ed6c42fe116183475ad7e8db908411.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/c1/e8/d0/c1e8d0a3e4ecf4d850db1669eafa55a0.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/4c/48/74/4c487435f89b5fce36a32be7cdb7ffe5.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/21/c7/fd/21c7fdf7ce14c93adb36b98e496bae84.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/ed/96/ed/ed96ed44f540882687e077dea21c7e12.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/8f/04/94/8f0494b342f0a9eda32d6b6b42f163f0.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/3f/17/33/3f1733a6bd6b751b215e3ab41525f150.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/48/e2/79/48e279540e4b002bc30098abff147175.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/01/ff/80/01ff808b2ab6333f27c8a1a507e6447e.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/13/e5/4d/13e54d78ee8be603a4db787b35381de4.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/42/ce/2e/42ce2e1b457ad1d902936129c0244eb8.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/78/91/c0/7891c0afa540243459676767cd266c89.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/e2/e5/c2/e2e5c2f9b531f1bcfd2d4036a8a1be91.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/68/ec/ff/68ecff1cd837f918d59636bde7ac8a25.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/a9/61/61/a96161c77ff3fe880904906a8973c988.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/db/7e/fc/db7efc4afc6d1cc5cb825c325f94ed52.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/3c/cb/98/3ccb9861798fa0e05d669aeb6a886d63.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/35/b2/0e/35b20e9a6d084519e99d97fe7b17ef8f.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/c4/b3/5d/c4b35d9d600b23ebf19e3e4753618741.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/e3/61/76/e361764b927c3a585b1a84e904ec3bbe.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/fd/7f/0a/fd7f0a1c87d917027bd1f279e24321e0.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/93/c0/63/93c063470a91f53225a411db31b0ed41.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/55/6c/07/556c07790a7b6835a8086de03b11f3b5.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/85/4a/1c/854a1c724492c18b72a84e72f644bc7f.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/5e/61/50/5e6150308c6d2fdb8c630aa0ac52fe8b.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/5f/1a/34/5f1a34e8831a1639d0fdc120d399862e.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/2b/0d/9e/2b0d9ef2a8f75ac0fd9a8f7c796e5372.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/21/a3/e9/21a3e9fc25cb0d9fe962284c4e721481.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/83/46/1d/83461d0ef2351335f037cb38f42cbac7.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/c4/3e/cc/c43ecc5b70ed0e71cbba1b6adcba870c.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/d1/68/87/d16887d4a6a08f8c02540bc38c687ebd.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/77/21/5e/77215effdb21663deebe18bd8e1fc79a.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/28/41/5a/28415a6f484c4fc75ea9187886cc39ca.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/b7/03/0f/b7030f223d511cb00348b231f4fcd56c.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/0e/2a/64/0e2a64e3deb3092cd52317b9d53b8e6a.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/b7/4d/15/b74d15d48e5a8ef2cab12d97d8a7e694.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/c1/61/68/c16168831d1fd00629b80b361bf2dcf8.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/2f/ba/80/2fba80cd6d7777c42f0215fd27425b21.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/fb/be/e7/fbbee75603d68916106b120eb97239d8.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/d4/a9/38/d4a938f313c3a896a1da974862906da4.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/b3/0e/5f/b30e5f92401b2fd8d9dcb7e201546720.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/34/cd/7e/34cd7ed17c64a2a87f97137eccee1950.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/564x/ef/34/4c/ef344c7d8822031933c2ea49f5f78e1d.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2014/03/25/22/53/smoke-298243_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2015/07/10/14/04/coffee-839233_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2018/05/07/16/36/rio-antirrio-bridge-3381158_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2013/07/04/15/25/match-143175_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2015/09/29/20/16/animal-964454_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2013/07/02/08/22/butterfly-142734_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2018/09/01/22/49/wallpaper-3647834_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2017/11/30/06/15/smoke-2987727_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2017/10/09/08/45/drop-and-sky-2832793_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2013/07/25/11/52/candles-166864_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2015/08/28/18/39/focus-912294_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2016/07/14/13/28/analog-1516724_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2016/11/19/13/11/water-1839211_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2018/04/08/09/57/transport-system-3300842_960_720.jpg"));
        itemsList.add(new customItems("https://cdn.pixabay.com/photo/2017/07/19/20/39/rain-2520307_960_720.jpg"));




        recyclerViewAdapter = new RecyclerViewAdapter(itemsList,this);
        recyclerView.setAdapter(recyclerViewAdapter);


    }


}
