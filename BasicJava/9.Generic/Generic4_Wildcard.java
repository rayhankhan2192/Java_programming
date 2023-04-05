class TwoD{
    int x,y;
    TwoD(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class ThreeD extends TwoD{
    int z;
    ThreeD(int x, int y, int z){
        super(X, Y);
        this.z = z;
    }
}
class FourD extends ThreeD{
    int t;
    FourD(int x, int y, int z, int t){
        super(X, Y, z);
        this.t = t;
    }
}

class Dimention<D extends TwoD>{
    D[] objD;
    Dimention(D[] objD){
        this.objD = objD;
    }
}


public class Generic4_Wildcard {//Demonstrate a bounden wildcart
    static void showXY(Dimention<?> D){// from class Dimention<T extends TwoD>
        System.out.println("XY Dimention: ");
        for(int i=0; i<D.objD.length; i++){
            System.out.println("X: "+D.objD[i].X +" Y: "+D.objD[i].Y);
        }
    }
    static void showXYZ(Dimention<? extends ThreeD>D){
        System.out.println("XYZ Dimention: ");
        for(int i=0; i<D.objD.length; i++){
            System.out.println("X "+D.objD[i].X+" Y : "+D.objD[i].Y+" Z : "+D.objD[i].z);
        }
    }
    static void shpwAll(Dimention<? extends FourD>D){
        System.out.println("Show all: ");
        for(int i=0; i<D.objD.length; i++){
            System.out.println("X "+D.objD[i].X+" Y : "+D.objD[i].Y+" Z : "+D.objD[i].z+" T : "+D.objD[i].t);
        }
    }

    public static void main(String[] args) {
        System.out.println("Content of TwoDimention: ");
        TwoD twoD[] = {
            new TwoD(10, 20),
            new TwoD(30, 40),
            new TwoD(50, 60),
        };
        Dimention<TwoD> resultTwoD = new Dimention<TwoD>(twoD);
        showXY(resultTwoD);

        System.out.println("\nContent of Three Dimention: ");
        ThreeD threeD[] = {
            new ThreeD(100, 200, 300)
        };
        Dimention<ThreeD> resultThreeD = new Dimention<ThreeD>(threeD);
        showXY(resultThreeD);
        showXYZ(resultThreeD);

        System.out.println("\nContent of Four Dimention: ");
        FourD fourD[] = {
            new FourD(110, 210, 310, 410),
            new FourD(120, 220, 320, 420),
            new FourD(130, 230, 330, 430)
        };
        Dimention<FourD> resultFourD = new Dimention<FourD>(fourD);
        showXY(resultFourD);
        showXYZ(resultFourD);
        shpwAll(resultFourD);
    }
}
