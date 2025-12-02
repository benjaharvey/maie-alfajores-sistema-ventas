import java.util.*;
import java.time.*;

public class pedido {
    private LocalDate fechaEntrega;

    private int cantEspeciales;
    private int cantBlancos;
    private int cantChocolate;

    private float totalAPagar;

    private int monto;

    private int totalAlfajores;

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }


    public int getCantEspeciales() {
        return cantEspeciales;
    }

    public void setCantEspeciales(int cantEspeciales) {
        this.cantEspeciales = cantEspeciales;
    }


    public int getCantBlancos() {
        return cantBlancos;
    }

    public void setCantBlancos(int cantBlancos) {
        this.cantBlancos = cantBlancos;
    }


    public int getCantChocolate() {
        return cantChocolate;
    }

    public void setCantChocolate(int cantChocolate) {
        this.cantChocolate = cantChocolate;
    }


    public float getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar() {
        this.totalAPagar = this.getTotalAlfajores() + this.getMonto();
    }


    public int getMonto(){
        return this.monto;
    }

    private void setMonto(int p_monto){
        this.monto = p_monto;
    }


    private void setTotalAlfajores(){
        this.totalAlfajores = (this.getCantBlancos() + this.getCantChocolate() + this.getCantEspeciales());
    }

    public int getTotalAlfajores(){
        return this.totalAlfajores;
    }
}