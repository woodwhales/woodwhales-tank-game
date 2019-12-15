package org.woodwhales.tank.abstractfactory.rectskin;

import org.woodwhales.tank.Dir;
import org.woodwhales.tank.Group;
import org.woodwhales.tank.TankFrame;
import org.woodwhales.tank.abstractfactory.BaseBullet;
import org.woodwhales.tank.abstractfactory.BaseExplode;
import org.woodwhales.tank.abstractfactory.BaseTank;
import org.woodwhales.tank.abstractfactory.GameFactory;

public class RectGameFactory extends GameFactory {

	@Override
	public BaseTank createTank(int x, int y, Dir dir, Group group, TankFrame frame) {
		return new RectTank(x, y, dir, group, frame);
	}

	@Override
	public BaseExplode createExplode(int x, int y, TankFrame frame) {
		return new RectExplode(x, y, frame);
	}

	@Override
	public BaseBullet createBullet(int x, int y, Dir dir, Group group, TankFrame frame) {
		return new RectBullet(x, y, dir, group, frame);
	}

}