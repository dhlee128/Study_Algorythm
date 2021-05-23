package week5;

import java.util.LinkedList;
import java.util.Queue;

//994. Rotting Oranges
public class Q994 {
    static int[] x={-1,1,0,0};
    static int[] y={0,0,-1,1};
    static int[][] map;
    static int result;
    static Queue<Orange> queue=new LinkedList<>();

    public static int orangesRotting(int[][] grid) {
        result=0;//최종 시간(분)
        map=new int[grid.length][grid[0].length];

        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[i].length; j++) {
                map[i][j]=grid[i][j];
                if(grid[i][j]==2){//썩은 오렌지만 큐에 담기
                    queue.offer(new Orange(i,j,0));//x,y좌표+0분
                }
            }
        }

        while(!queue.isEmpty()){
            bfs(queue.poll());
        }

        if(!check()){//신선한 오렌지가 하나라도 있으면 -1반환
            result=-1;
        }

        return result;
    }

    public static void bfs(Orange orange){
        for(int i=0;i<4;i++){
            int _x=orange.x+x[i];
            int _y=orange.y+y[i];

            if(_x>=0&&_x<map.length&&_y>=0&&_y< map[0].length){
                if(map[_x][_y]==1){//인접한 오렌지가 신선한 오렌지 일떄
                    map[_x][_y]=2;//썩은 오렌지 처리하고
                    queue.add(new Orange(_x,_y,orange.mm+1));//큐에 좌표를 담아주는데 인접한 오렌지는 썩는데 +1분이 걸림
                    result=Math.max(result,orange.mm+1);//제일 마지막에 썩은 오렌지의 시간(분)으로 갱신
                }
            }
        }
    }

    //모든 오렌지가 썩음->true
    public static boolean check(){
        for(int i=0;i< map.length;i++){
            for(int j=0;j<map[i].length; j++) {
                if(map[i][j]==1){
                    return false;
                }
            }
        }
        return true;
    }

    //오렌지
    static class Orange{
        int x,y;
        int mm;

        public Orange(int x, int y, int mm){
            this.x=x;
            this.y=y;
            this.mm=mm;
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }

}
