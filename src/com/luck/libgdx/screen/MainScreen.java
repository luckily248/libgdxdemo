package com.luck.libgdx.screen;

import android.util.Log;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.luck.libgdx.game.MainGame;
import com.luck.libgdx.until.MainUntil;

public class MainScreen implements Screen {
	MainGame game;
	Vector3 touchPos = new Vector3(0, 0, 0);
	Stage mainstage;
	Actor background;

	public MainScreen(MainGame game) {
		this.game = game;
		mainstage = new Stage();
		Image grassland = new Image(MainUntil.grassland);
		mainstage.addActor(grassland);

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void hide() {
		// TODO Auto-generated method stub

	}

	public void pause() {
		// TODO Auto-generated method stub

	}

	public void render(float arg0) {
		// TODO Auto-generated method stub
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

		if (Gdx.input.isTouched()) {

			touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
			game.camera.unproject(touchPos);

		}

		game.spriteBatch.begin();
		mainstage.draw();
		Log.v("HERE", "x=" + touchPos.x + " y=" + touchPos.y);
		game.spriteBatch.end();
		// Log.v("HERE", Gdx.graphics.getHeight() + ":" +
		// Gdx.graphics.getWidth());
	}

	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	public void resume() {
		// TODO Auto-generated method stub

	}

	public void show() {

	}

}
