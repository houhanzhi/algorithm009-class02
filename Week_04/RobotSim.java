package com.datastructure.algorithm.week04;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 来自猩猩的攻城狮hhz
 * @date 2020-06-11 15:53
 */
public class RobotSim {
    public static int robotSim(int[] commands, int[][] obstacles) {
        // 定义方向，默认北：北、东、南、西
        int[][] direct = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        // 移动坐标
        int x = 0, y = 0;
        // 结果
        int result = 0;
        // 当前方向
        int cur_dir = 0;
        Set<String> oSet = new HashSet<>();
        for (int i = 0; i < obstacles.length; i++)
            oSet.add(obstacles[i][0] + "," + obstacles[i][1]);
        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == -1)
                cur_dir = (cur_dir + 1) % 4;
            else if (commands[i] == -2)
                cur_dir = (cur_dir + 3) % 4;
            else {
                for (int j = 1; j <= commands[i]; j++) {
                    int next_x = x + direct[cur_dir][0];
                    int next_y = y + direct[cur_dir][1];
                    if (oSet.contains(next_x + "," + next_y))
                        break;
                    x = next_x;
                    y = next_y;
                    result = Math.max(result, x * x + y * y);
                }
            }

        }
        return result;
    }
}
