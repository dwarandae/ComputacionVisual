void setup() {
  size(200, 200);
  background(255);
  //noStroke();
  
  //Draw a rectangle position in gray color
  fill(192);
  rect(20, 20, 40, 40);
  
  //Draw a translucent red rectangle by changing the coordinates
  fill(255, 0, 0, 128);
  rect(20 + 60, 20 + 80, 40, 40);
  
  //Draw a translicent blue rectangle by translating the grid
  fill(0, 0, 255, 128);
  
  /*Push matrix is a built-in function that saves the current position of the coordinate
  system */
  pushMatrix();
  /* translate(60, 80) moves the coordinate system 60 units right and 80 units down */
  translate(60, 80);
  /* rect draws the rectangle at the same place it was originally. The rectangle don't
     move, the grid moves instead */
  rect(20, 20, 40, 40);
  /* popMatrix() restores the coordinate system to the way where it was */
  popMatrix();
  
  /* References: 2D Transformations. Processing tutorial by J David Eisenberg available
  at www.proccesing.org/tutorials/transform2d */

  
}