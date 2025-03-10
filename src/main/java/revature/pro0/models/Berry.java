package revature.pro0.models;

public class Berry {
    private String name;
    private String effect;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
    public Berry(String name, String effect){
        this.name = name;
        this.effect = effect;
    }

    public Berry(){

    }
}
