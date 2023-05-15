import javax.swing.JFrame;

public class toolbelt extends JFrame{

    public toolbelt() {
        setSize(1420, 700);
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
        cmpVarDelta cmpVarDelta = new cmpVarDelta();
        getContentPane().add(cmpVarDelta.iniciaComponent());
        cmpValOrig cmpValOrig = new cmpValOrig();
        getContentPane().add(cmpValOrig.iniciaComponent());
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