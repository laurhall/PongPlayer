package player;

import com.rharel.pong.ai.ArtificialPlayer;
import com.rharel.pong.core.Paddle;
import com.rharel.pong.core.Player;
import com.rharel.pong.core.Table;

public class MyPlayer extends ArtificialPlayer {
    private int count = 0;

    public MyPlayer(Position position, float brakingDistance) {
        super(position, brakingDistance);
    }

    @Override
    public void play(Paddle paddle, Table table) {
        if (++count == 3) paddle.moveLeft();
        else paddle.dontMove();
        if (table.ball.position.x< paddle.position.x) paddle.moveLeft (paddle.position.x-5);
        if (table.ball.position.x > paddle.position.x + paddle.size.width) paddle.moveRight (paddle.position.x + 5);

    }
}

