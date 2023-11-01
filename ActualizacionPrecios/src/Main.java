import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        //INSTANCIA DE LOS PRODUCTOS//                ACA VA EL PRECIO                ACA VA EL NOMBRE
        ProductoGabbos limpiaLlantas500cc = new ProductoGabbos(1260,"LimpiaLlantas 500cc");
        ProductoGabbos shampooMelon1litro = new ProductoGabbos(1890,"Shampoo Melon 1litro");
        ProductoGabbos shampooMelon500cc = new ProductoGabbos(1890,"Shampoo Melon 500cc");
        ProductoGabbos shampooCarnauba1litro = new ProductoGabbos(2520,"Shampoo Carnauba 1LITRO");
        ProductoGabbos ceraCarnaubaXX = new ProductoGabbos(2520,"Cera CarnaubaXX");
        ProductoGabbos ceraCarnauba500cc = new ProductoGabbos(2660,"Cera Carnauba 500cc");
        ProductoGabbos siliconaVIP250cc = new ProductoGabbos(3220,"SiliconaVIP 250cc");
        ProductoGabbos miniPerfumes70cc = new ProductoGabbos(840,"Mini Perfumes 70cc");
        ProductoGabbos pincelBrocha = new ProductoGabbos(1,"Pincel/Brocha");
        ProductoGabbos limpiaTapizados = new ProductoGabbos(1540,"Limpia Tapizados");
        ProductoGabbos microFibraMarca3D = new ProductoGabbos(1,"Microfibra marca 3D");
        ProductoGabbos ceraCarnauba250cc = new ProductoGabbos(2300,"Cera carnauba 250cc");
        ProductoGabbos route66 = new ProductoGabbos(1,"Route66");
        ProductoGabbos ceraVinilos= new ProductoGabbos(2380,"Cera Vinilos");
        ProductoGabbos panioMicrofibra50x50 = new ProductoGabbos(1,"PAÑO DE MICROFIBRA 50x50");
        ProductoGabbos shampooCarnauba500cc = new ProductoGabbos(1680,"Shampoo carnauba 500cc");
        ProductoGabbos limpiaCristales500cc = new ProductoGabbos(1260,"Limpia cristales 500cc");
        ProductoGabbos ceraCarnauba1litro = new ProductoGabbos(4060,"Cera carnauba 1LITRO");
        ProductoGabbos gelAcondicionadorInterior250cc = new ProductoGabbos(2520,"Gel acondicionar - Interior 250cc");
        ProductoGabbos padAplicadorParaLlantas = new ProductoGabbos(1,"PAD Aplicador para llantas");
        ProductoGabbos polishStarCorteMedio250cc = new ProductoGabbos(3080,"Polish Star corte medio 250cc");
        ProductoGabbos limpiaMotoresForte500cc = new ProductoGabbos(2100,"Limpia motores FORTE 500cc");
        ProductoGabbos shampooPink1litro    = new ProductoGabbos(2520,"Shampoo PINK 1LITRO");
        ProductoGabbos shampooCarnauba5litros = new ProductoGabbos(1,"SHAMPOO CARNAUBA 5LITROS");
        ProductoGabbos ceraCarnaubaBrilloRapido5litros = new ProductoGabbos(1,"Cera Carnauba brillo rapido 5LITROS");
        ProductoGabbos restauradorSatinado250cc = new ProductoGabbos(2100,"Restaurador Satinado 250cc");
        ProductoGabbos shampooSnowShow5litros = new ProductoGabbos(1,"Shampoo SNOW SHOW 5LITROS");
        ProductoGabbos limpiaMotoresECO500cc = new ProductoGabbos(2100,"Limpia motores ECO 500cc");
        ProductoGabbos gabbox = new ProductoGabbos(1,"GABBOX(CAJA PLASTICA)");
        ProductoGabbos shampooPHNeutro1Litro = new ProductoGabbos(2520,"Shampoo PH Neutro 1LITRO");
        ProductoGabbos guantesLafitteXl = new ProductoGabbos(1,"Guantes Lafitte XL");
        ProductoGabbos blackBorns = new ProductoGabbos(2520,"Black Borns");
        ProductoGabbos apc500cc = new ProductoGabbos(6020,"APC 500cc");
        ProductoGabbos franelaParaSecado = new ProductoGabbos(1,"Franela Para Secado");
        ProductoGabbos ceraCarnaubaConcentrada250cc = new ProductoGabbos(1,"Cera carnauba Concentrada 250cc");
        ProductoGabbos aromatizantesParaTuAuto = new ProductoGabbos(1,"Aromatizantes para tu auto");
        ProductoGabbos siliconaTipoMiel250cc = new ProductoGabbos(4200,"Silicona - Tipo Miel 250cc");
        ProductoGabbos shampooPHNeutro500cc = new ProductoGabbos(1,"Shampoo PH Neutro 500cc");
        ProductoGabbos cepilloLimpiaLlantas = new ProductoGabbos(1,"Cepillo limpia llantas");
        ProductoGabbos shampooBubbleGum5litros = new ProductoGabbos(1,"Shampoo - Bubble Gum 5LITROS");
        ProductoGabbos panioTipoWaffle = new ProductoGabbos(1,"Paño tipo waffle");
        ProductoGabbos padAplicadorDePoliespuma = new ProductoGabbos(1,"PAD Aplicador de poliespuma");
        ProductoGabbos shakeItExteriores250cc = new ProductoGabbos(2100,"Shake It - Exteriores 250cc");
        ProductoGabbos shampooPink500cc = new ProductoGabbos(1,"Shampoo Pink 500cc");
        ProductoGabbos clayBar = new ProductoGabbos(1,"Clay Bar");
        ProductoGabbos baldeParaLavado = new ProductoGabbos(1,"Balde para Lavado");
        ProductoGabbos cepilloLimpiaCadena = new ProductoGabbos(1,"Cepillo Limpia Cadena");
        ProductoGabbos foamerMini = new ProductoGabbos(1,"Foamer Mini");





        //ACA VA LA GANANCIA, EJ: 40% =0.15, 50%= 0.5
        limpiaLlantas500cc.aplicarGanancia(0.15);
        shampooMelon1litro.aplicarGanancia(0.15);
        shampooMelon500cc.aplicarGanancia(0.15);
        shampooCarnauba1litro.aplicarGanancia(0.15);
        ceraCarnaubaXX.aplicarGanancia(0.15);
        ceraCarnauba500cc.aplicarGanancia(0.15);
        siliconaVIP250cc.aplicarGanancia(0.15);
        miniPerfumes70cc.aplicarGanancia(0.15);
        pincelBrocha.aplicarGanancia(0.15);
        limpiaTapizados.aplicarGanancia(0.15);
        microFibraMarca3D.aplicarGanancia(0.15);
        ceraCarnauba250cc.aplicarGanancia(0.15);
        route66.aplicarGanancia(0.15);
        ceraVinilos.aplicarGanancia(0.15);
        panioMicrofibra50x50.aplicarGanancia(0.15);
        shampooCarnauba500cc.aplicarGanancia(0.15);
        limpiaCristales500cc.aplicarGanancia(0.15);
        ceraCarnauba1litro.aplicarGanancia(0.15);
        gelAcondicionadorInterior250cc.aplicarGanancia(0.15);
        padAplicadorParaLlantas.aplicarGanancia(0.15);
        polishStarCorteMedio250cc.aplicarGanancia(0.15);
        limpiaMotoresForte500cc.aplicarGanancia(0.15);
        shampooPink1litro.aplicarGanancia(0.15);
        shampooCarnauba5litros.aplicarGanancia(0.15);
        ceraCarnaubaBrilloRapido5litros.aplicarGanancia(0.15);
        restauradorSatinado250cc.aplicarGanancia(0.15);
        shampooSnowShow5litros.aplicarGanancia(0.15);
        limpiaMotoresECO500cc.aplicarGanancia(0.15);
        gabbox.aplicarGanancia(0.15);
        shampooPHNeutro1Litro.aplicarGanancia(0.15);
        guantesLafitteXl.aplicarGanancia(0.15);
        blackBorns.aplicarGanancia(0.15);
        apc500cc.aplicarGanancia(0.15);
        franelaParaSecado.aplicarGanancia(0.15);
        ceraCarnaubaConcentrada250cc.aplicarGanancia(0.15);
        aromatizantesParaTuAuto.aplicarGanancia(0.15);
        siliconaTipoMiel250cc.aplicarGanancia(0.15);
        shampooPHNeutro500cc.aplicarGanancia(0.15);
        cepilloLimpiaLlantas.aplicarGanancia(0.15);
        shampooBubbleGum5litros.aplicarGanancia(0.15);
        panioTipoWaffle.aplicarGanancia(0.15);
        padAplicadorDePoliespuma.aplicarGanancia(0.15);
        shakeItExteriores250cc.aplicarGanancia(0.15);
        shampooPink500cc.aplicarGanancia(0.15);
        clayBar.aplicarGanancia(0.15);
        baldeParaLavado.aplicarGanancia(0.15);
        cepilloLimpiaCadena.aplicarGanancia(0.15);
        foamerMini.aplicarGanancia(0.15);
        //MUESTRA LOS PRECIOS

        System.out.println(limpiaLlantas500cc.getNombreProducto()+"="+limpiaLlantas500cc.getPrecioProducto());
        System.out.println(shampooMelon1litro.getNombreProducto()+"="+shampooMelon1litro.getPrecioProducto());
        System.out.println(shampooMelon500cc.getNombreProducto()+"="+shampooMelon500cc.getPrecioProducto());
        System.out.println(shampooCarnauba1litro.getNombreProducto()+"="+shampooCarnauba1litro.getPrecioProducto());
        System.out.println(ceraCarnaubaXX.getNombreProducto()+"="+ceraCarnaubaXX.getPrecioProducto());
        System.out.println(ceraCarnauba500cc.getNombreProducto()+"="+ceraCarnauba500cc.getPrecioProducto());
        System.out.println(siliconaVIP250cc.getNombreProducto()+"="+siliconaVIP250cc.getPrecioProducto());
        System.out.println(miniPerfumes70cc.getNombreProducto()+"="+miniPerfumes70cc.getPrecioProducto());
        System.out.println(pincelBrocha.getNombreProducto()+"="+pincelBrocha.getPrecioProducto());
        System.out.println(limpiaTapizados.getNombreProducto()+"="+limpiaTapizados.getPrecioProducto());
        System.out.println(microFibraMarca3D.getNombreProducto()+"="+microFibraMarca3D.getPrecioProducto());

        System.out.println(ceraCarnauba250cc.getNombreProducto()+"="+ceraCarnauba250cc.getPrecioProducto());
        System.out.println(route66.getNombreProducto()+"="+route66.getPrecioProducto());
        System.out.println(ceraVinilos.getNombreProducto()+"="+ceraVinilos.getPrecioProducto());
        System.out.println(panioMicrofibra50x50.getNombreProducto()+"="+panioMicrofibra50x50.getPrecioProducto());
        System.out.println(shampooCarnauba500cc.getNombreProducto()+"="+shampooCarnauba500cc.getPrecioProducto());
        System.out.println(limpiaCristales500cc.getNombreProducto()+"="+limpiaCristales500cc.getPrecioProducto());
        System.out.println(ceraCarnauba1litro.getNombreProducto()+"="+ceraCarnauba1litro.getPrecioProducto());
        System.out.println(gelAcondicionadorInterior250cc.getNombreProducto()+"="+gelAcondicionadorInterior250cc.getPrecioProducto());
        System.out.println(padAplicadorParaLlantas.getNombreProducto()+"="+padAplicadorParaLlantas.getPrecioProducto());
        System.out.println(polishStarCorteMedio250cc.getNombreProducto()+"="+polishStarCorteMedio250cc.getPrecioProducto());
        System.out.println(limpiaMotoresForte500cc.getNombreProducto()+"="+limpiaMotoresECO500cc.getPrecioProducto());
        System.out.println(shampooPink1litro.getNombreProducto()+"="+shampooPink1litro.getPrecioProducto());
        System.out.println(shampooCarnauba5litros.getNombreProducto()+"="+shampooCarnauba5litros.getPrecioProducto());
        System.out.println(ceraCarnaubaBrilloRapido5litros.getNombreProducto()+"="+ceraCarnaubaBrilloRapido5litros.getPrecioProducto());
        System.out.println(restauradorSatinado250cc.getNombreProducto()+"="+restauradorSatinado250cc.getPrecioProducto());
        System.out.println(shampooSnowShow5litros.getNombreProducto()+"="+shampooSnowShow5litros.getPrecioProducto());
        System.out.println(limpiaMotoresECO500cc.getNombreProducto()+"="+limpiaMotoresECO500cc.getPrecioProducto());
        System.out.println(gabbox.getNombreProducto()+"="+gabbox.getPrecioProducto());
        System.out.println(shampooPHNeutro1Litro.getNombreProducto()+"="+shampooPHNeutro1Litro.getPrecioProducto());
        System.out.println(guantesLafitteXl.getNombreProducto()+"="+guantesLafitteXl.getPrecioProducto());
        System.out.println(blackBorns.getNombreProducto()+"="+blackBorns.getPrecioProducto());
        System.out.println(apc500cc.getNombreProducto()+"="+apc500cc.getPrecioProducto());
        System.out.println(franelaParaSecado.getNombreProducto()+"="+franelaParaSecado.getPrecioProducto());
        System.out.println(ceraCarnaubaConcentrada250cc.getNombreProducto()+"="+ceraCarnaubaConcentrada250cc.getPrecioProducto());
        System.out.println(aromatizantesParaTuAuto.getNombreProducto()+"="+aromatizantesParaTuAuto.getPrecioProducto());
        System.out.println(siliconaTipoMiel250cc.getNombreProducto()+"="+siliconaTipoMiel250cc.getPrecioProducto());
        System.out.println(shampooPHNeutro500cc.getNombreProducto()+"="+shampooPHNeutro500cc.getPrecioProducto());
        System.out.println(cepilloLimpiaLlantas.getNombreProducto()+"="+cepilloLimpiaLlantas.getPrecioProducto());
        System.out.println(shampooBubbleGum5litros.getNombreProducto()+"="+shampooBubbleGum5litros.getPrecioProducto());
        System.out.println(panioTipoWaffle.getNombreProducto()+"="+panioTipoWaffle.getPrecioProducto());
        System.out.println(padAplicadorDePoliespuma.getNombreProducto()+"="+padAplicadorDePoliespuma.getPrecioProducto());
        System.out.println(shakeItExteriores250cc.getNombreProducto()+"="+shakeItExteriores250cc.getPrecioProducto());
        System.out.println(shampooPink500cc.getNombreProducto()+"="+shampooPink500cc.getPrecioProducto());
        System.out.println(clayBar.getNombreProducto()+"="+clayBar.getPrecioProducto());
        System.out.println(baldeParaLavado.getNombreProducto()+"="+baldeParaLavado.getPrecioProducto());
        System.out.println(cepilloLimpiaCadena.getNombreProducto()+"="+cepilloLimpiaCadena.getPrecioProducto());
        System.out.println(foamerMini.getNombreProducto()+"="+limpiaLlantas500cc.getPrecioProducto());
        System.out.println(limpiaLlantas500cc.getNombreProducto()+"="+limpiaLlantas500cc.getPrecioProducto());
    }
}