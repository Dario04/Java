int x;
int y;
int lado;
int cont = 0;
PImage Lucio;
//int diam;
//float speed;
//int g = 3;

void setup(){
size(1000, 600);
Lucio = loadImage("assets/Lucio.jpg");
imageMode(CENTER);
//rectMode(CENTER);
//x = 25;
//y = 25;
//lado = 50;
//x = width/2;
//y = height/2;
//diam = 150;
//speed = 1;
}
void draw(){
background(150);
image(Lucio,width/2,height/2,400,500);
//for(int i=0; i<20; i++){
  //x = i*lado;
  //rect(x+25,y,lado,lado);
//for(int o=0; o<20; o++){
  //cont +=1;
  //if((i+cont)%2==0){
  //fill(#ffcc80);
  //}else{
    //fill(#331f00);
  //}
  //y = o*lado;
  //rect(x+25,y+25,lado,lado);
//}  
//}
//display();
//move();
  //x = x+speed;
  //if (x>width-150) {
    //speed = -20;
    //C = color(0,0,255);
  //}if(x<0+150){
    //speed = speed*-1;
    //C = color(255,0,0);
  //fill(random(255), random(255), random(255));
  //stroke(255);
  //strokeWeight(1);

}
//void display(){
  //fill(0);
  //ellipse(x,y,diam,diam);
//}
//void move(){
  //y = y+speed;
  //speed = speed + g;
  //if(y>height){
  //y = height;
  //speed = speed * -0.7;
  //}
//}
//void mousePressed(){
  //speed *= 1.5;
//}
