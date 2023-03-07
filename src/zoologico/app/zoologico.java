package zoologico.app;

import zoologico.modelos.DepartamentoLogistica;

public class zoologico {
    public static void main(String[] args) {
        System.out.println("%%% Los Liones del Desierto %%%");
        DepartamentoLogistica.admonZoo();
    }
}

/*
* Un zoológico famoso nos ha contratado para ayudarle en la administración del dinero y nos ha solicitado lo siguiente:
*
* 1. Tener clase zoologico.modelos.Animal.
* 2. Tener clase AnimalesSalvajes.
* 3. Tener clase AnimalesDomesticos.
* 4. Tener clase Planes (Plan experiencia salvaje, plan alimentar pollos, plan amistoso)
* 5. Tener clase clientes.
* 6. Clase de venta de boletería, abonos
*
* Nos piden entregar un PDF con las ventas de un período.
* Debemos tener como mínimo 5 planes que son los más* pedidos por los clientes. Tener venta de
* boletas y Abonos del Zoo.
* Se tiene un programa cliente frecuente
* para lo cual necesitamos acumular las visitas al zoo.
*
* Adicionales:
*  - Animales para la venta
*  - Eventos
*  - Sistema de puntos
*  - Acuario
*  - etc.
*Herencia
Asociación: Relación más debil (Toda relación de entrada es de asociación)
Agregación
Composición: No puede vivir sin
*/