package com.luck.libgdx.game;

import android.content.Context;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.luck.libgdx.screen.LoadScreen;

public class MainGame extends Game {
	Context context;
	LoadScreen loadScreen;
	public BitmapFont bitmapFont;
	public SpriteBatch spriteBatch;
	public OrthographicCamera camera;

	public void create() {
		bitmapFont = new BitmapFont(Gdx.files.internal("fonts/yahei.fnt"),
		Gdx.files.internal("fonts/yahei.png"), false);
		spriteBatch = new SpriteBatch();
		camera = new OrthographicCamera(480, 800);
		loadScreen = new LoadScreen(this);
		setScreen(loadScreen);

	}

	public MainGame(Context context) {
		this.context = context;

	}
}
