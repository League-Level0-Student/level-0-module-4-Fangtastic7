PImage donkey;
PImage tail;

void setup(){
  donkey = loadImage("donk.jpg");
  background(donkey);
  size(550,406);
  
  tail = loadImage("tail.png");
  tail.resize(263, 262);
}


void draw(){
  
  if(mousePressed==true){
  image(tail, mouseX-138, mouseY-35);
  println(mouseX);
  println(mouseY);
  }
  //8
  
}