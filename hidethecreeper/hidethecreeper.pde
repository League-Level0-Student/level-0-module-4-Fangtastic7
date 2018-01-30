PImage creeper;

int randomX = (int) random(0,800);
int randomY = (int) random(0,600);
void setup(){
  size(800,600);
  PImage minecraft = loadImage("greenbackground.jpeg");
  minecraft.resize(800,600);
  background(minecraft);
  
  creeper = loadImage("creeper.png");
  creeper.resize(10,10);
}
void draw(){
 image(creeper, randomX, randomY);
 
 if(mousePressed == true){
  if(isNear(mouseX,randomX) && isNear(mouseY,randomY)){
    ellipse(mouseX,mouseY,10,10);
    fill(0,255,0);
    print("You found the creeper!");
    
  }
  else{
   ellipse(mouseX,mouseY,10,10);
   fill(255,0,0);
  }
 }
}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}