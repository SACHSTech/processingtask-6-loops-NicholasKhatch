import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255,255,255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    background(100);
    stroke(0);

    for (int lineX = width/20; lineX <= width/2; lineX += width/20){
      line(lineX, 0, lineX, width/2);
    }
    for (int lineY = height/20; lineY <= height/2; lineY += height/20){
      line(0, lineY, height/2, lineY);
    }

    for (int circleY = 0; circleY <= (height/2) - (height/40); circleY += height/10){
      for (int circleX = width - (width/10); circleX >= width/2; circleX -= height/10){
        fill(255);
        ellipse(circleX + 20, circleY + 20, (width/10) - width/40, (height/10) - height/40);
      }
    }

    for (int colourval = 0; colourval < (width/2); colourval++){
      stroke(colourval,colourval,colourval);
      line(colourval,200,colourval,height);
    }

    fill(232, 120, 245);
    for (int petalX = (int) (width/1.42857142857); petalX <= (width/1.25); petalX += (width/40)){
        if (petalX == (280)){
          ellipse(petalX, petalX + (float) (width/26.6666666667), width/16, height/16);
          ellipse(petalX, petalX + width/16, width/16, width/16);
        } else if (petalX == 290){
          ellipse(petalX, petalX - width/80, width/16, width/16);
          ellipse(petalX, petalX + width/16, width/16, width/16);
        } else if (petalX == 310){
          ellipse(petalX, petalX - width/16, width/16, width/16);
          ellipse(petalX, petalX + width/80, width/16, width/16);
        } else if (petalX == width/1.25){
          ellipse(petalX, (float) (petalX - (width/26.6666666667)), width/16, width/16);
          ellipse(petalX, petalX - width/16, width/16, width/16);
        }
    }
    fill(245, 201, 120);
    ellipse(3*(width/4), 3*(height/4), (width/10) - width/40, (height/10) - height/40);

  }
  
  // define other methods down here.
}