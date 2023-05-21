

public class Data {
    private int dia;
    private int mes;
    private int ano;
   
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        boolean anoBissexto = verificarAnoBissexto();
      
        if(dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Dia ou mês inválido.");
        }

        if(dia == 29 && mes == 2 && !anoBissexto) {
            throw new IllegalArgumentException("Data inválida. O mês de fevereiro em um ano não-bissexto só pode ter 28 dias.");
        }

        if(mes == 2 && dia > 29) {
            throw new IllegalArgumentException("Data inválida. Fevereiro só pode ter até 29 dias.");
        }

        if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            throw new IllegalArgumentException("Data inválida. Abril, Junho, Setembro e Novembro só podem ter até 30 dias.");
        }
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    private boolean verificarAnoBissexto() { 

        if (ano % 4 == 0 && ano % 100 != 0){ 
            return true;
        }

        if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
            return true;
        }else {

            return false;
        }

    }

    @Override
    public String toString() {
        return "Data: " + dia + "/" + mes + "/" + ano;
    }

}
