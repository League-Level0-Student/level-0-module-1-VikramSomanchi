void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(250,0,0);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(0,150,0);
    rect(176, 103, 12, 32);
    if(mousePressed){
      fill(200, 200, 200);
      ellipse(90, 190, 70, 70);
    }
}
