package fran.poe.APIpoeCurrency;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Currency {
    
    @Id
    private String id;

    private String nombre;
    private String icono;
    private int dropLevel;
    private int stackSize;
    private int tabStackSize;
    private String helpText;

    public Currency(){}

    public Currency(String id, String nombre, String icono, int dropLevel, int stackSize, int tabStackSize, String helpText){
        super();
        this.id = id;
        this.nombre = nombre;
        this.icono = icono;
        this.dropLevel = dropLevel;
        this.stackSize = stackSize;
        this.tabStackSize = tabStackSize;
        this.helpText = helpText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public int getDropLevel() {
        return dropLevel;
    }

    public void setDropLevel(int dropLevel) {
        this.dropLevel = dropLevel;
    }

    public int getStackSize() {
        return stackSize;
    }

    public void setStackSize(int stackSize) {
        this.stackSize = stackSize;
    }

    public int getTabStackSize() {
        return tabStackSize;
    }

    public void setTabStackSize(int tabStackSize) {
        this.tabStackSize = tabStackSize;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }
}