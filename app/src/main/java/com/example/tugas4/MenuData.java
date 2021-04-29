package com.example.tugas4;

import com.example.tugas4.Menu;

import java.util.ArrayList;

public class MenuData {
    private static String[] enhaNames = {
            "Jungwon",
            "Heeseung",
            "Jay",
            "Jake",
            "Sunghoon",
            "Sunoo",
            "Ni-ki",
    };

    private static String[] enhaImages = {
            "https://pbs.twimg.com/media/E0B9R8DVcAI5usW?format=jpg&name=360x360",
            "https://pbs.twimg.com/media/E0B81gLVcAUxkbm?format=jpg&name=360x360",
            "https://pbs.twimg.com/media/E0B81gWUcAAGdkb?format=jpg&name=360x360",
            "https://pbs.twimg.com/media/E0B9R8EVkAIY2o4?format=jpg&name=360x360",
            "https://pbs.twimg.com/media/E0B9R8CVUAYO9P1?format=png&name=360x360",
            "https://pbs.twimg.com/media/E0B81gMVoAU80n-?format=png&name=360x360",
            "https://pbs.twimg.com/media/E0B81gZVkAEvM9m?format=png&name=360x360",

    };

    private static String[] enhaProfile = {
            "+822-84880491",
            "+822-84880492",
            "+822-84880493",
            "+822-84880494",
            "+822-84880495",
            "+822-84880496",
            "+822-84880497",
    };

    private static String[] enhaPhone = {
            "+822-84880491",
            "+822-84880492",
            "+822-84880493",
            "+822-84880494",
            "+822-84880495",
            "+822-84880496",
            "+822-84880497",
    };

    static ArrayList<Menu> getListData(){
        ArrayList<Menu> list = new ArrayList<>();

        for (int position = 0; position < enhaNames.length; position++){
            Menu menu = new Menu(
                    enhaNames[position],
                    enhaProfile[position],
                    enhaImages[position],
                    enhaPhone[position]
            );
            list.add(menu);
        }
        return list;
    }
}
