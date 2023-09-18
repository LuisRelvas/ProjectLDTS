package example.GUI;

import example.model.Position;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;

    void drawHero(Position position);

    void drawHeroPowered(Position position);

    void drawWall(Position position);

    void drawPowerBrick(Position position);

    void drawCoin(Position position);

    void drawPowerUp(Position position);

    void drawMonster(Position position);

    void drawEndFlag(Position position);

    void drawText(Position position, String text, String color);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;


    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT, PAUSE}
}
