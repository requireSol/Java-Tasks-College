public class BoardGame {
  
  public static void main(String[] args) {
    new GameFigure(1, "gruen", 4);
    new GameFigure(1, "gruen", 7);
    new GameFigure(2, "gelb", 2);
    new GameFigure(3, "schwarz");
    GameFigure.printAllFigures();
    
    new GameFigure(1, "gruen", 7);
    new GameFigure("grau");
    new GameFigure("grau");
    new GameFigure("grau");
    new GameFigure("schwarz", 10);
    GameFigure.printAllFigures();
    
    GameFigure.deleteFigure(new GameFigure(1, "gruen", 7));
    GameFigure.deleteFigure(new GameFigure(99, "schwarz", 10));
    GameFigure.printAllFigures();
    
  }
  
}