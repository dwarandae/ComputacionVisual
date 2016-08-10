PImage img;
PGraphics pg;
int OFFSET = 10;
final int SIZE = 25;
color selected;

void setup() {
  size(1024,513);
  pg = createGraphics(1024, 513);
  img = loadImage("../../images/bojack.jpg");
}

void draw() {
  image(img, 0, 0);
  color c = img.get(mouseX, mouseY);
  fill(c);
  rect(mouseX + OFFSET, mouseY + OFFSET*1 + SIZE*0, SIZE, SIZE);
  fill(red(c), 0, 0);
  rect(mouseX + OFFSET, mouseY + OFFSET*2 + SIZE*1, SIZE, SIZE);
  fill(0, green(c), 0);
  rect(mouseX + OFFSET, mouseY + OFFSET*3 + SIZE*2, SIZE, SIZE);
  fill(0, 0, blue(c));
  rect(mouseX + OFFSET, mouseY + OFFSET*4 + SIZE*3, SIZE, SIZE);
  if(mousePressed) {
    pg.beginDraw();
    pg.strokeWeight(10);
    pg.stroke(selected);
    pg.line(mouseX, mouseY, pmouseX, pmouseY);
    pg.endDraw();
  }
  else {
    selected = c;
  }
  image(pg, 0, 0);
}