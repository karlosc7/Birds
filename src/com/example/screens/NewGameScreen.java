package com.example.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.example.screens.NewGameRenderer;
import com.example.screens.NewGameWorld;

public class NewGameScreen implements Screen {


	private NewGameWorld world;
	private NewGameRenderer renderer;
	private float runTime;

	public NewGameScreen() {
		float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight / 2);
		Gdx.app.log("GameScreen", "Attached");
		world = new NewGameWorld(midPointY);
		renderer = NewGameRenderer();

	}

	private NewGameRenderer NewGameRenderer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Gdx.app.log("GameScreen", "show called");
	}

	@Override
	public void render(float delta) {
		// Sets a Color to Fill the Screen with (RGB = 10, 15, 230), Opacity of
		// 1 (100%)
		Gdx.gl.glClearColor(10 / 255.0f, 15 / 255.0f, 230 / 255.0f, 1f);
		// Fills the screen with the selected color
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		// Covert Frame RATE to String, print it
		Gdx.app.log("GameScreen FPS", (1 / delta) + "");
		runTime += delta;
        world.update(delta);
        renderer.render();
	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.log("GameScreen", "resizing");
	}

	@Override
	public void pause() {
		Gdx.app.log("GameScreen", "pause called");
	}

	@Override
	public void resume() {
		Gdx.app.log("GameScreen", "resume called");
	}

	@Override
	public void hide() {
		Gdx.app.log("GameScreen", "hide called");

	}

	@Override
	public void dispose() {
		// Leave blank

	}
	public  void NewGameRenderer( float delta) {
	     // Define un color para llenar la pantalla con (RGB = 10, 15, 230), la opacidad de 1 (100%) 
	    Gdx . gl . glClearColor ( 10 / 255.0f , 15 / 255.0f , 230 / 255.0f , 1f );
	     // Llena la pantalla con el color seleccionado 
	    Gdx . gl . glClear ( GL20 . GL_COLOR_BUFFER_BIT );
	     // Velocidad de cuadros Covert a String, imprimirlo 
	    Gdx . app . log ( "GameScreen FPS " , ( 1 / delta) +  "" );
	}

}
