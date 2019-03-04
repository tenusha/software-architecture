package com.sa.lab1.e1;

public class LightOffCommand implements Command {

	private Light light;

	public LightOffCommand(Light light) {

		this.light = light;

	}

	@Override
	public void execute() {

		light.off();

	}

}
