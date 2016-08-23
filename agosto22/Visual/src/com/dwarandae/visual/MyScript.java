package com.dwarandae.visual;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class MyScript extends PApplet{
	
	private ParticleSystem particleSystem;
	private PImage img;
	
	@Override
	public void settings() {
		size(480, 360, P2D);
		img = loadImage("fire.png");
	}
	
	@Override
	public void setup() {
		particleSystem = new ParticleSystem(new PVector(width/2, height - 20), img);
	}
	
	@Override
	public void draw() {
		background(0);
		blendMode(ADD);
		
		for(int i = 0; i< 5; i++) {
			particleSystem.addParticle();
		}
		
		float vx =map(mouseX, 0, width, -0.2F, 0.2F);
		PVector wind = new PVector(vx, 0);
		particleSystem.applyForce(wind);
		particleSystem.run(getGraphics());
	}
	
	public static void main(String[] args) {
		PApplet.main(MyScript.class.getName());
	}
	
}

