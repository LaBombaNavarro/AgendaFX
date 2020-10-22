package agendafx;
    /*nombre (campo string)
    *sexo
    *foto(imagen)
    *nivel de ingles (slider 1-5)
    *color favorito (color)
    */
public class Persona {
    private String nombre;
    private char sexo;
    private String foto;
    private int ingles;
    private String color;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public void setIngles(int ingles) {
        this.ingles = ingles;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getNombre() {
        return nombre;
    }
    public char getSexo() {
        return sexo;
    }
    public String getFoto() {
        return foto;
    }
    public int getIngles() {
        return ingles;
    }
    public String getColor() {
        return color;
    }

    public Persona(String nombre, char sexo, String foto, int ingles, String color) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.foto = foto;
        this.ingles = ingles;
        this.color = color;
    }
}
