package models;

public class Target {
    private short[] data =  new short[10];
    //El atributo pos se utiliza para retornar los indices que cumplen el target
    private short[] pos = {-1,-1};

    //Método para establecer los valores del arreglo data
    public void setData(short[] array){
        for (short i=0;i<array.length;i++)
            data[i] = array[i];
    }
    //Método utilizado para retornar las posiciones que suman al target
    public short[] getPos(){
        return pos;
    }

    // El método returna true si en el arreglo se encuentra el target
    public boolean searchTarget(short target){
        boolean flag = false;
        for (short i=0;i<data.length && !flag;i++)
            for (short j=(short)(i+1);j<data.length && !flag;j++)
                if (isEqual(data[i], data[j], target)){
                    flag =true;
                    pos[0] = i;
                    pos[1] = j;
                }
        return  flag;
    }
    public boolean isEqual(short a, short b, short target){
        boolean flag = false;
        if (a+b == target)
            flag = true;
        return flag;
    }
}
