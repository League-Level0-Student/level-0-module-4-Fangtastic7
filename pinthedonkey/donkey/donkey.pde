import ddf.minim.*; 
AudioSample sound1;
AudioSample sound2;
boolean pinned = false;
PImage donkey;
PImage tail;
int tailX;
int tailY;
void setup(){
  Minim minim = new Minim(this);
  sound1 = minim.loadSample("success.wav");
  sound2 = minim.loadSample("wrong.wav");
  donkey = loadImage("donk.jpg");
  background(donkey);
  size(550,406);
  
  tail = loadImage("tail.png");
  tail.resize(263, 262);
  
 
}


void draw(){
  textSize(24);
text("How to Play: The goal of this game is to pin the tail onto the correct spot on the donkey.",100,20);
  if(mouseX<100){
   if(mouseY<100){
     background(donkey);
   }
  }
   else {
    
     background(0,0,0);
      fill(255,255,255);
     rect(0,0,100,80);
     
   }
  
  if(mousePressed==true){
    pinned = true;
    
  tailX = mouseX-138;
  tailY = mouseY-35;
  println(mouseX);
  println(mouseY);
  if(isNear(tailX, 499) && isNear(tailY, 129)){
   sound1.trigger();
 }
 else{
   sound2.trigger();
 }
  }
  if(pinned){
    image(tail, tailX, tailY);
  }
  else{
     image(tail, mouseX-138, mouseY-35);
  }
   

  }
  boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}