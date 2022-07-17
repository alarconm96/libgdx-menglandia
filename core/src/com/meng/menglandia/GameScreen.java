package com.meng.menglandia;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

public class GameScreen implements Screen {
	final Menglandia game;
	
	Texture playerImg;
	OrthographicCamera camera;
	
	public GameScreen(Menglandia game) {
		this.game = game;
		
		// textures
		playerImg = new Texture(Gdx.files.internal("caesarThink.png"));
		
		// camera
		camera = new OrthographicCamera();
		camera.setToOrtho(false);
		
		
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
