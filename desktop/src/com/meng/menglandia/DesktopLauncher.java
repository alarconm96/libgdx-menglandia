package com.meng.menglandia;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.meng.menglandia.Menglandia;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		startGame();
	}
	
	private static void startGame() {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setResizable(true);
		config.useVsync(true);
		config.setForegroundFPS(60);
		config.setTitle("Menglandia");
		new Lwjgl3Application(new Menglandia(), config);
	}
}
