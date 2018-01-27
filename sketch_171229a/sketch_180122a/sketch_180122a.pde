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
  if(mouseX<120){
    x=120;
  }
  if(mouseY<170){
    y=170;
  }
  if(mouseX>280){
    x=280;
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