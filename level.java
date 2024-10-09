//package edu.ncat.brickbreakerbackend;
public class Level {
        private int levelNum;
        private BrickRow[] brickRows;

        public Level(){
            this.levelNum = 0;
            this.brickRows = null;
        }

        public Level(int levelNum, int numBrickRows){ // Brick Row A
            this.setLevelNum(levelNum);
            this.brickRows = new BrickRow[numBrickRows];
        }

        public BrickRow getBrickRow(int index){
            return brickRows[index];
        }

        public void setBrickRow(int index, BrickRow brickRow){
            brickRows[index] = brickRow;
        }


        public int getLevelNum() {
            return levelNum;
        }

        public void setLevelNum(int levelNum) {
            this.levelNum = levelNum;
        }

        public String toString() {
            String toString = levelNum + "\n" + brickRows.length + "\n";
            for(int i = 0; i < brickRows.length; i++){
                toString += i + "\n" + brickRows[i].toString() + "\n";
            }
            return toString;
        }
    }
