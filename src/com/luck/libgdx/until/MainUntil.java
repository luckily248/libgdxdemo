package com.luck.libgdx.until;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MainUntil {

	public static TextureRegion packRegion;
	public static TextureRegion warstand;
	public static TextureRegion blueeagle;
	public static TextureRegion cow;
	public static TextureRegion enf;
	public static TextureRegion snake;
	public static TextureRegion wolf;
	public static TextureRegion thinkbuff;
	public static Animation warturnleft;
	public static Animation warturnright;
	public static Animation warturnup;
	public static Animation warturndown;
	public static TextureRegion grassland;
	public int loadnum = 0;
	public static TextureRegion[][] ff24regions;
	public static TextureRegion[][] tubiao1regions;
	public static TextureAtlas packAtlas;

	public void load() {

		if (packAtlas == null) {
			packAtlas = new TextureAtlas(Gdx.files.internal("pic/pack"));
		}
		if (ff24regions == null) {
			ff24regions = packAtlas.findRegion("ff24").split(25, 33);
			if (ff24regions != null)
				loadnum++;
		}
		if (tubiao1regions == null) {
			tubiao1regions = packAtlas.findRegion("tubiao1").split(24, 24);
			if (tubiao1regions != null)
				loadnum++;
		}
		if (grassland == null) {
			grassland = packAtlas.findRegion("grass");
			if (grassland != null)
				loadnum++;
		}
		if (blueeagle == null) {
			blueeagle = packAtlas.findRegion("blue-eagle");
			if (blueeagle != null)
				loadnum++;
		}
		if (cow == null) {
			cow = packAtlas.findRegion("cow");
			if (cow != null)
				loadnum++;
		}
		if (enf == null) {
			enf = packAtlas.findRegion("enf");
			if (enf != null)
				loadnum++;
		}
		if (snake == null) {
			snake = packAtlas.findRegion("snake");
			if (snake != null)
				loadnum++;
		}

		if (wolf == null) {
			wolf = packAtlas.findRegion("wolf");
			if (wolf != null)
				loadnum++;
		}

		if (warstand == null) {
			warstand = ff24regions[2][1];
			if (warstand != null)
				loadnum++;
		}

		if (thinkbuff == null) {
			thinkbuff = tubiao1regions[14][3];
			if (thinkbuff != null)
				loadnum++;
		}

	}
}
