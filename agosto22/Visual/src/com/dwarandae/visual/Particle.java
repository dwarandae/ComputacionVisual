package com.dwarandae.visual;
import java.util.Random;

import processing.core.PGraphics;
import processing.core.PImage;
import processing.core.PVector;

public class Particle {
	
	private int m;
	private double life;
	private int size;
	private PVector pos;
	private PVector vel;
	private PVector acc;
	private PImage img;
	
	
	public Particle(PVector pos, PImage img) {
		this.img = img;
		this.acc = new PVector();
		this.vel = new PVector();
		this.pos = pos.copy();
		this.life = 100;
		
		float vx = (float) (new Random().nextGaussian() * 0.3);
		float vy = (float) (new Random().nextGaussian() * 0.3);		
		this.vel = new PVector(vx, vy -1);
		
		this.size = new Random().nextInt(100) + 5;
		this.m = 1;
	}
	
	public void applyForce(PVector f) {
		//F = m*a
		acc.add(PVector.mult(f,m));
		
	}
	public void run(PGraphics pg) {
		
		//Update 
		
		vel = vel.add(acc);
		pos = pos.add(vel);
		life -= 0.5;
		acc.mult(0);
		
		//Render
		//pg.noStroke();
		//pg.fill(255, (float)life);
		//pg.ellipse(pos.x, pos.y, size, size);
		
		pg.tint(255, 0, 2*(float)life, (float)life);
		pg.image(img, pos.x, pos.y, size, size);
	}
	
	public boolean isDead() {
		return life <=0;
	}
	

	
	
}
