PImage img;
PGraphics pg;

void setup1() {
  size(1024,768);
  pg = createGraphics(1024, 513);
  img = loadImage("../../images/superMarioWorldMap.png");
}

void draw() {
   image(img, 0, 0);
}