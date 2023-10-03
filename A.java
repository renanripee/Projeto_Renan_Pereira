/* Renan Ribeiro Pereira - matricula 202210083 */

public class A{
    private int a1;
    private float a2;

    public int getA1(){
        return a1;
    }

    public float getA2(){
        return a2;
    }

    public void setA1(int a1){
        this.a1 = a1;
    }

    public void setA2(float a2){
        this.a2 = a2;
    }

    public void MA1(){
        System.out.println("MA1");
    }

    public void MA2(){
        System.out.println("MA2");
    }

    public void MA3(){
        System.out.println("Alteração da classe A partir do clone");
    }

    public int getSoma (int a, int b) {
        return a+b;
    }
}