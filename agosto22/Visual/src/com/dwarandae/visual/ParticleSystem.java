package com.dwarandae.visual;
import java.util.ArrayList;
import java.util.List;

import processing.core.PGraphics;
import processing.core.PImage;
import processing.core.PVector;

public class ParticleSystem {
	
	private List<Particle> particles;
	private PVector pos;
	private PImage img;
	
	public ParticleSystem(PVector pos, PImage img) {
		this.pos = pos;
		this.img = img;
		particles = new ArrayList<>();
		
	}
	
	public void run(PGraphics pg) {
		for(int i = particles.size() -1 ; i >=0; i--) {
			Particle particle = particles.get(i);
			if(particle.isDead()) {
				particles.remove(i);
			}
			else {
				particle.run(pg);
			}
			
		}
		
	}
	
	public void applyForce(PVector f) {
		for(Particle particle : particles) {
			particle.applyForce(f);
		}
	}
	
	public void addParticle() {
		particles.add(new Particle(pos, img));
	}
	

}
