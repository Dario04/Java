var titulo;
var p1;
var p2;
var imagen;
var canvas;
var boton;
var BC = 255;

function setup() {
	createCanvas(1000,1000);
  titulo = createElement('h1',"El Librario");
  titulo.position(0,50);
  p1 = select("#parrafo1");
  p1.position(0,200);
  titulo.style("border-style","solid");
  titulo.style("border-width","thick");
  p2 = createElement('p', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.');
  p2.position(0,300);
  p2.mouseOver(cambiarFondo);
  imagen = createImg("https://i.ytimg.com/vi/H8Y0Xs5JgFc/maxresdefault.jpg");
  imagen.position(0,400);
  boton = createButton("background-color");
  boton.position(200,100);
  slider = createSlider(0,600,400);
  slider.position(0,120);
}

function draw() {
  background(BC);
  imagen.size(slider.value()-200,slider.value()-300);
  boton.mousePressed(colorFondo);
}
function cambiarFondo() {
	p2.style('background-color','blue');
}
function colorFondo() {
	BC = random(255);
}