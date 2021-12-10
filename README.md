# final_hw4
程式檔案名稱：
  hw4.java
  fight.java
  printMap.java
  shortRange.java
  longRange.java
  support.java
  character.java

使用說明
  相傳所羅門王離世後，留下了大量的寶藏，而其中最具價值的便是據說能夠
毀滅世界的指環，為了找到所羅門王的寶藏，一群冒險家集結，準備踏上至今
仍無人能歸的冒險旅途，而你，就是這群冒險家的首領，請發揮你的智慧與機
智，帶領這群冒險家突破萬難，找到所羅門王遺失已久的寶藏吧！

  step1.選擇路線與冒險者
  根據不同的路線，有不同的人數限制，玩家必須根據人數限制，選擇路線與
  出發的冒險者與進攻順序，注意！一個小小的排序可是會影響到戰鬥的結果喔

    任務列表：
      任務1-訓練課程，在出發冒險前，先小試身手吧。
      任務2-黑暗叢林，在黑夜的叢林中，尋找所羅門王寶藏的線索。
      任務3-地獄峽谷，穿越環境嚴困的地獄峽谷，前往所羅門王寶藏之處。
      任務4-靈魂深淵，在地獄峽谷中不慎掉進了靈魂深淵，突破萬難繼續前往最終目標。
      任務5-地獄之路，擊敗所羅門王的守衛，證明自己夠格得到所羅門王的寶藏吧。

  step.2移動
  在地圖上輸入(U,D,L,R)可以移動，前往目的地Y邁進吧

  step.3戰鬥
  遇見敵人後，對不同角色下達不同命令，努力擊敗敵人吧

   指令格式 [共同基礎技能的技能名稱或特定職業的技能類型] [位置]
   指令說明 第一項為輪到該角色施放技能時所選擇施放的技能，若選
            擇施放共同基礎技能，則輸入該技能名稱，若選擇施放該
            角色的職業技能，則輸入該技能類型。

            第二項非必要輸入，若施放的技能會指定特定位置上的角
            色(友軍或敵人)才必須輸入。

  指令範例 1 exchange 5 該角色使用換位技能，和在戰鬥位置 5 的友
                        方角色互換位置

  指令範例 2 rest       該角色使用休息技能

  指令範例 3 normal     該角色使用基本類型的技能

  指令範例 4 normal 7   該角色使用基本類型的技能，對象為戰鬥位
                        置 7 上的角色，例如天弓箭手的破甲箭

  指令範例 5 special    該角色使用特殊類型的技能

  step.4 努力擊敗所有敵人吧

額外功能：完成所有任務後，可解鎖指令soloman(玩家攻擊階段)，可直接擊敗場上所有敵人。

注意事項：編譯時，請輸入javac -encoding utf-8 hw4.java以顯示中文。
