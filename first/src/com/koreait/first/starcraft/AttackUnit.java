package com.koreait.first.starcraft;

public abstract class AttackUnit extends Unit {
	protected final int ATTACK_POINT;
	
	public AttackUnit(int hp, int attackPoint) {
		super(hp);
		this.ATTACK_POINT = attackPoint;
	}
	
	public void attack(Unit unit) {
		unit.hp -= ATTACK_POINT;
	}
}
