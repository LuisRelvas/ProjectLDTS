package example.model.game.map;

import example.model.Position;
import example.model.game.elements.*;
import example.model.game.elements.brick.BreakableBrick;
import example.model.game.elements.brick.CoinBrick;
import example.model.game.elements.brick.NormalBrick;
import example.model.game.elements.brick.PowerUpBrick;
import example.model.game.elements.mario.Mario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LoaderMapBuilder extends MapBuilder {
    private final int level;
    List<String> lines;

    public LoaderMapBuilder(int level) throws IOException {
        this.level = level;

        URL resource = LoaderMapBuilder.class.getResource("/image/levels/level" + level + ".lvl");
        BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));

        lines = readlines(br);
    }

    private List<String> readlines(BufferedReader br) throws IOException {
        List<String> lines = new ArrayList<>();
        for (String line; (line = br.readLine()) != null; )
            lines.add(line);
        return lines;
    }

    @Override
    protected int getWidth() {
        int width = 0;
        for (String line : lines)
            width = Math.max(width, line.length());
        return width;
    }

    @Override
    protected int getHeight() {
        return lines.size();
    }




    @Override
    protected List<NormalBrick> createWalls() {
        List<NormalBrick> normalBricks = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '#') normalBricks.add(new NormalBrick(x, y));
        }



        for(NormalBrick normalBrick : normalBricks){
            normalBrick.setScreenPosition(new Position((normalBrick.getPosition().getX() - 20), (normalBrick.getPosition().getY()-28)));
        }

        return normalBricks;
    }

    @Override
    protected List<BreakableBrick> createBreakableBricks() {
        List<BreakableBrick> breakableBricks = new ArrayList<>();
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'B') breakableBricks.add(new BreakableBrick(x, y));
        }
        for(BreakableBrick breakableBrick : breakableBricks){
            breakableBrick.setScreenPosition(new Position((breakableBrick.getPosition().getX() - 20), (breakableBrick.getPosition().getY()-28)));
        }
        return breakableBricks;
    }
    @Override
    protected List<PowerUpBrick> createPowerUpBricks() {
        List<PowerUpBrick> powerUpBricks = new ArrayList<>();
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'P') powerUpBricks.add(new PowerUpBrick(x, y));
        }
        for(PowerUpBrick powerUpBrick : powerUpBricks){
            powerUpBrick.setScreenPosition(new Position((powerUpBrick.getPosition().getX() - 20), (powerUpBrick.getPosition().getY()-28)));
        }
        return powerUpBricks;
    }

    @Override
    protected List<CoinBrick> createCoinBricks() {
        List<CoinBrick> coinBricks = new ArrayList<>();
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'C') coinBricks.add(new CoinBrick(x, y));
        }
        for(CoinBrick coinBrick : coinBricks){
            coinBrick.setScreenPosition(new Position((coinBrick.getPosition().getX() - 20), (coinBrick.getPosition().getY()-28)));
        }
        return coinBricks;
    }


    @Override
    protected List<Coin> createCoins() {
        List<Coin> coins = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'O') coins.add(new Coin(x, y));
        }
        for(Coin coin : coins){
            coin.setScreenPosition(coin.getPosition());
        }
        return coins;
    }

    @Override
    protected List<PowerUp> createPowerUps() {
        List<PowerUp> powerUps = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '1') powerUps.add(new PowerUp(x, y));
        }
        for(PowerUp powerUp : powerUps){
            powerUp.setScreenPosition(powerUp.getPosition());
        }
        return powerUps;
    }

    @Override
    protected List<Enemy> createEnemies() {
        List<Enemy> enemies = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'M') enemies.add(new Enemy(x, y));
        }
        for(Enemy enemy : enemies){
            enemy.setScreenPosition(enemy.getPosition());
        }
        return enemies;
    }

    @Override
    protected Mario createHero() {
        return new Mario(1,1);
    }

    @Override
    protected EndFlag createEndFLag() {
        EndFlag endFlag = null;
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '?') endFlag = new EndFlag(x, y);
        }
        endFlag.setScreenPosition(endFlag.getPosition());
        return endFlag;
    }

    @Override
    protected Camera createCamera() {
        return new Camera(0,getHeight()-2);
    }


}