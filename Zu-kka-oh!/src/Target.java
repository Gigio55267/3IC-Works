

public enum Target {
    ATK_FORTE,ATK_DEBOLE,DEF_DEBOLE,DEF_FORTE,HP_ALTO,HP_BASSO;

    public static Target targetRandom(){
        int random =(int)(Math.random()*6);
        return Target.values()[(int)random];
    }
}
