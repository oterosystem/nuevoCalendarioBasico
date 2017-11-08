
/**
 * Write a description of class calendario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // Declarando variables dia, mes y año
    private DisplayDosCaracteres dia;
    private DisplayDosCaracteres mes;
    private DisplayDosCaracteres ano;

    /**
     * Constructor de la clase CalendarioBasico
     */ 
    public CalendarioBasico()
    {
        dia = new DisplayDosCaracteres(31) ;
        mes = new DisplayDosCaracteres(13);
        ano = new DisplayDosCaracteres(100);
    }

    /**
     * Fijamos la fecha nueva
     */
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
    {
        dia.setValorAlmacenado(nuevoDia);
        mes.setValorAlmacenado(nuevoMes);
        ano.setValorAlmacenado(nuevoAnio);
    }

    /**
     *Metodo para obtener el facha
     */
    public String obtenerFecha()
    {   
        dia.getTextoDelDisplay();
        mes.getTextoDelDisplay();
        ano.getTextoDelDisplay();
        String devolverFecha= dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-" + ano.getTextoDelDisplay();
        return devolverFecha;
    }

    public void avanzarFecha()
    {   
        dia.incrementaValorAlmacenado();

        if(dia.getValorAlmacenado() ==1){
            mes.incrementaValorAlmacenado();
            if(mes.getValorAlmacenado() ==1){
                ano.incrementaValorAlmacenado();
            }
        }

    }
}
