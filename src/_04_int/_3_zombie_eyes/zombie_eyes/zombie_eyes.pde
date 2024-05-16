PImage pikachu;
void setup() {
pikachu  = loadImage("pikachu.jpeg");
pikachu.resize(600, 600);
image(pikachu, 0, 0);
size(600, 600);
}
void draw() {
fill(255, mouseX, mouseY);
ellipse(200, 240, 70, 70);
ellipse(359, 240, 70, 70);
fill(0,0,0);
ellipse(200, 240, 30, 30);
ellipse(359, 240, 30, 30);
}
