int x = 199;
int y = 201;
void setup(){
  size(800,500);
  background(200,200,200);
  
}
void draw(){
  background(200,200,200);
  fill(255,255,255);
  ellipse(200,200,300,200);
  fill(255,255,255);
  ellipse(600,200,300,200);
  x = mouseX;
  y = mouseY;
  if(mouseX<100){
    x=100;
  }
  if(mouseY<150){
    y=150;
  }
  if(mouseX>190){
    x=288;
  }
  if(mouseY>230){
    y=230;
  }
  
  fill(0,0,0);
  ellipse(x,y,100,100);
  fill(0,0,0);
  ellipse(x+400,y,100,100);
  
  println(mouseX);
  println(mouseY);
}