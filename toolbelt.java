import javax.swing.JFrame;

public class toolbelt extends JFrame{

    public toolbelt() {
        setSize(1920, 1080);
        setTitle("Tela de Cadastro");
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        cmpPctDesc cmpPctDesc = new cmpPctDesc();
        getContentPane().add(cmpPctDesc.iniciaComponent());
        cmpPctInc cmpPctInc = new cmpPctInc();
        getContentPane().add(cmpPctInc.iniciaComponent());
        cmpRepPct cmpRepPct = new cmpRepPct();
        getContentPane().add(cmpRepPct.iniciaComponent());
        cmpRepPart cmpRepPart = new cmpRepPart();
        getContentPane().add(cmpRepPart.iniciaComponent());
        cmpDescVar cmpDescVar = new cmpDescVar();
        getContentPane().add(cmpDescVar.iniciaComponent());
        // cmpVarDelta();
        // cmpValOrig();
        cmpRegraDeTres cmpRegraDeTres = new cmpRegraDeTres();
        getContentPane().add(cmpRegraDeTres.iniciaComponent());
        cmpPasswordGenerator cmpPasswordGenerator = new cmpPasswordGenerator();
        getContentPane().add(cmpPasswordGenerator.iniciaComponent());
        setVisible(true);
    }

    
    public static void main(String[] args) {
        new toolbelt();
    }
    
}