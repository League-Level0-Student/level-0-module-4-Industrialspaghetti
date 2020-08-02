  PImage face;
  int X;
  int Y;
void setup() {
    face = loadImage("face.jpg");
      size(800,600);
    face.resize(800,600);
}

void draw() {
  image(face,0,0);
  fill(#FFFFFF);
   ellipse(460,300,75,75);
   fill(#FFFFFF);
   ellipse(550,300,70,70);
    fill(#000000);
    ellipse(X,Y,10,10);
     fill(#000000);
   ellipse(X+90,Y,10,10);
   if (mousePressed == true){
   println("X; "+ mouseX); println("Y; "+ mouseY);}
   if (mouseY > 267 && mouseY < 331 && mouseX > 429 && mouseX < 490){
     Y = mouseY;
     X = mouseX;
     
     
   }
  //up: X:460,Y:267
  //left:X:429,Y:300
  //right:X:490 Y:300
  //down:X:460, Y:331
  
   
   
   
   
   
  
   
}
