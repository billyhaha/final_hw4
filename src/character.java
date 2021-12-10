public class character 
{
	public int hp;
	public int mp;
	public int cd;
	public int team;
	public character(int health,int mana,int time,int _team)
	{
		hp = health;
		mp = mana;
		cd = time;
		team = _team;
		
	}
	/*public static void rest(String cha,shortRange knight,shortRange assassin,longRange master,longRange archer,support priest)
	{
		switch(cha)
		{
			case"knight":
				if(knight.hp<90)
				{
					knight.hp = knight.hp+10;
				}
				else
				{
					knight.hp = 100;
				}
				
				if(knight.mp<30)
				{
					knight.mp = knight.mp+10;
				}
				else
				{
					knight.mp = 40;
				}
				break;
			case"assassin":
				if(assassin.hp<70)
				{
					assassin.hp = assassin.hp+10;
				}
				else
				{
					assassin.hp = 80;
				}
				
				if(assassin.mp<40)
				{
					assassin.mp = assassin.mp+10;
				}
				else
				{
					assassin.mp = 50;
				}
				break;
			case"master":
				if(master.hp<40)
				{
					master.hp = master.hp+10;
				}
				else
				{
					master.hp = 50;
				}
				
				if(master.mp<90)
				{
					master.mp = master.mp+10;
				}
				else
				{
					master.mp = 100;
				}
				break;
			case"archer":
				if(archer.hp<50)
				{
					archer.hp = archer.hp+10;
				}
				else
				{
					archer.hp = 60;
				}
				
				if(archer.mp<70)
				{
					archer.mp = archer.mp+10;
				}
				else
				{
					archer.mp = 80;
				}
				break;
			case"priest":
				if(priest.hp<50)
				{
					priest.hp = priest.hp+10;
				}
				else
				{
					priest.hp = 60;
				}
				
				if(priest.mp<90)
				{
					priest.mp = priest.mp+10;
				}
				else
				{
					priest.mp = 100;
				}
				break;
			default:
				break;
		}
	}*/
	
}