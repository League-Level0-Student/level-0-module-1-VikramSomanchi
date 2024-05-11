   PImage olive;
   
void setup() {
  olive = loadImage("olive.png");
  olive.resize(30,30);
  size(600, 600);
}
void draw() {
    fill(#E3B78C);
   ellipse(300,300,500,500);
   fill(#FA1900);
   ellipse(300,300,450,450);
   fill(#FAF200);
   ellipse(300,300,440,440);
image(olive,200,200);
image(olive,100,200);
image(olive,300,200);
image(olive,200,100);
image(olive,200,300);
image(olive,300,300);
image(olive,200,400);
image(olive,400,200);
image(olive,200,500);
image(olive,500,200);
}
