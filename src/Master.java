public class Master extends character
{
	int rage;
	NormalAttack normalAtt;
	SpecialAttack specialAtt;
	public Master(int health, int mana, int time, int _team)
	{
		super(health, mana, time, _team);
		rage = 0;
	}
	public void setNormalAttack(NormalAttack normal)
	{
		this.normalAtt = normal;
	}
	public void setSpecialAttack(SpecialAttack special)
	{
		this.specialAtt = special;
	}
}
