package org.woodwhales.tank.strategy;

import org.woodwhales.tank.Audio;
import org.woodwhales.tank.Bullet;
import org.woodwhales.tank.Group;
import org.woodwhales.tank.Tank;

public class DefultFireStrategy implements FireStrategy {

	@Override
	public void fire(Tank tank) {
		int bX = tank.getX() + Tank.WIDTH / 2 - Bullet.WIDTH / 2;
		int bY = tank.getY() + Tank.HEIGHT / 2 - Bullet.HEIGHT / 2;
		
		new Bullet(bX, bY, tank.getDir(), tank.getGroup());
		
		//TODO bug?? new bullet 的时候又把自己加了一遍
		// 装饰者模式
//		GameModel.getInstance().add(new ReactGameObjectDecorator(
//				new TailGameObjectDecorator(bullet)));
		
		if (tank.getGroup() == Group.GOOD) {
			new Thread(() -> new Audio("audio/tank_fire.wav").play()).start();
		}
	}

}
