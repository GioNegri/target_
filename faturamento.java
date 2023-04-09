import java.text.DecimalFormat;


public class faturamento {
    public static void main(String[] args) {
       
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;
        double faturamentoTotal = 0;
        
     
        faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        
        DecimalFormat df = new DecimalFormat("0.00%");
        
        double percSP = (faturamentoSP / faturamentoTotal) * 100;
        double percRJ = (faturamentoRJ / faturamentoTotal) * 100;
        double percMG = (faturamentoMG / faturamentoTotal) * 100;
        double percES = (faturamentoES / faturamentoTotal) * 100;
        double percOutros = (faturamentoOutros / faturamentoTotal) * 100;
        
    
        System.out.println("Percentual de representação de cada estado:");
        System.out.println("SP: " + percSP + "%");
        System.out.println("RJ: " + percRJ + "%");
        System.out.println("MG: " + percMG + "%");
        System.out.println("ES: " + percES + "%");
        System.out.println("Outros: " + percOutros + "%");
    }
}
