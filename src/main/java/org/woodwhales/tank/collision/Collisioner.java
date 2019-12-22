package org.woodwhales.tank.collision;

import org.woodwhales.tank.GameObject;

/**
 * 碰撞接口
 *
 */
public interface Collisioner {

	boolean collise(GameObject object1, GameObject object2);
}
