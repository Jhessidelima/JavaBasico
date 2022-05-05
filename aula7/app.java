
public class app {
    public static void main(String[] args) {
        System.out.println("---------------------- Costantes Atribuidas -----------------------------");
        int dia = DiasSemana.SEGUNDA;
        System.out.println(dia);
        System.out.println("---------------------- ENUM Atribuidos -----------------------------");
        DiaSemana dEnum = DiaSemana.DOMINGO;
        System.out.println(dEnum.toString() + " - "+dEnum.getValor());
        System.out.println("---------------------- Classes Atribuidas -----------------------------");
        Data dataPrincipal = new Data(1, 4, 2022, DiaSemana.SEXTA);
        System.out.println(dataPrincipal.getDiaSemana());
        System.out.println("---------------------- Classes Repetição -----------------------------");
        DiaSemana[] diasVetor = DiaSemana.values();

        for(int i=0; i<diasVetor.length;i++){
            System.out.println(diasVetor[i]);
            if(diasVetor[i].getValor() == dataPrincipal.getDiaSemana().getValor()){
                System.out.println(", foi este dia aqui");
            }else{
                System.out.println(", não foi este dia.");
            }
        }
        System.out.println("---------------------- Classes Repetição Rápida -----------------------------");
        for(DiaSemana diaRapido : DiaSemana.values()){
            if(diaRapido.getValor() == dataPrincipal.getDiaSemana().getValor()){
                System.out.println(diaRapido+", foi este dia aqui.");
            }else{
                System.out.println(diaRapido+", não foi este dia.");
            }
        }
        System.out.println("------------------- Classes Enum Separadas por Valor -------------------------");
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
    }  
}
