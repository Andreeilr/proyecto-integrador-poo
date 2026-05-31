public class Main {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" SISTEMA DE GESTIÓN - AGENCIA DE VIAJES");
        System.out.println("==========================================");

        // CLIENTE
        Cliente cliente = new Cliente(
                1,
                "Andree",
                "Illescas",
                "0999999999",
                "andree@gmail.com",
                "2026-05-25",
                "Cuenca",
                "Ecuatoriana",
                "AB12345"
        );

        System.out.println("\n========== CLIENTE ==========");
        System.out.println(cliente);

        // HOTEL
        Hotel hotel = new Hotel(
                1,
                "Hotel Paradise",
                "Centro Cuenca",
                5,
                "072222222"
        );

        System.out.println("\n========== HOTEL ==========");
        System.out.println(hotel);

        // RESERVA
        Reserva reserva = new Reserva(
                1,
                "2026-05-25",
                "2026-06-10",
                4,
                "Confirmada",
                850.50,
                "Familiar",
                "Sí",
                "Ninguna"
        );

        System.out.println("\n========== RESERVA ==========");
        System.out.println(reserva);

        // FACTURA
        Factura factura = new Factura(
                1,
                "2026-05-25",
                760.00,
                90.50,
                850.50
        );

        System.out.println("\n========== FACTURA ==========");
        System.out.println(factura);

        // GUÍA
        GuiaTuristico guia = new GuiaTuristico(
                1,
                "Carlos",
                "Mendoza",
                "Español/Inglés",
                "5 años"
        );

        System.out.println("\n========== GUÍA TURÍSTICO ==========");
        System.out.println(guia);

        // SERVICIO
        ServicioTuristico servicio = new ServicioTuristico(
                1,
                "Tour por Cuenca",
                50.00,
                5,
                "08:00 AM",
                "Disponible"
        );

        System.out.println("\n========== SERVICIO TURÍSTICO ==========");
        System.out.println(servicio);

        // CITY TOUR
        CityTour cityTour = new CityTour(
                1,
                "Carlos Mendoza",
                "Español",
                "Parque Calderón y Turi"
        );

        System.out.println("\n========== CITY TOUR ==========");
        System.out.println(cityTour);

        // EXCURSIÓN
        Excursion excursion = new Excursion(
                1,
                "Senderismo",
                "Medio"
        );

        System.out.println("\n========== EXCURSIÓN ==========");
        System.out.println(excursion);

        // TOUR INTERNACIONAL
        TourInternacional tour = new TourInternacional(
                1,
                "España",
                true,
                "Iberia",
                true,
                7
        );

        System.out.println("\n========== TOUR INTERNACIONAL ==========");
        System.out.println(tour);

        // RUTA
        Ruta ruta = new Ruta(
                1,
                250.5,
                4,
                "Cuenca",
                "Guayaquil"
        );

        System.out.println("\n========== RUTA ==========");
        System.out.println(ruta);

        // VEHÍCULOS
        Vehiculo vehiculo = new Vehiculo(
                1,
                "ABC-123",
                "Chevrolet",
                "NPR",
                "Blanco",
                30
        );

        System.out.println("\n========== VEHÍCULO ==========");
        System.out.println(vehiculo);

        Bus bus = new Bus(
                1,
                2,
                true,
                true,
                "Turístico"
        );

        System.out.println("\n========== BUS ==========");
        System.out.println(bus);

        Minibus minibus = new Minibus(
                1,
                10,
                true
        );

        System.out.println("\n========== MINIBUS ==========");
        System.out.println(minibus);

        Minivan minivan = new Minivan(
                1,
                "XYZ-456",
                12
        );

        System.out.println("\n========== MINIVAN ==========");
        System.out.println(minivan);

        Vehiculo4x4 vehiculo4x4 = new Vehiculo4x4(
                1,
                "Montaña",
                true
        );

        System.out.println("\n========== VEHÍCULO 4X4 ==========");
        System.out.println(vehiculo4x4);

        // CONDUCTOR
        Conductor conductor = new Conductor(
                1,
                "Luis",
                "Torres",
                "Tipo E",
                "0988888888",
                "luis@gmail.com",
                "10 años",
                "Activo"
        );

        System.out.println("\n========== CONDUCTOR ==========");
        System.out.println(conductor);

        // PAGOS
        PagoTarjeta pagoTarjeta = new PagoTarjeta(
                1,
                "1234567890123456",
                "Pichincha",
                "Visa",
                "Andree Illescas",
                "12/29"
        );

        System.out.println("\n========== PAGO TARJETA ==========");
        System.out.println(pagoTarjeta);

        PagoOnline pagoOnline = new PagoOnline(
                1,
                "PayPal",
                "correo@gmail.com",
                "TRX123"
        );

        System.out.println("\n========== PAGO ONLINE ==========");
        System.out.println(pagoOnline);

        PagoEfectivo pagoEfectivo = new PagoEfectivo(
                1,
                100,
                "Recepcionista",
                15
        );

        System.out.println("\n========== PAGO EFECTIVO ==========");
        System.out.println(pagoEfectivo);

        PagoTransferencia pagoTransferencia = new PagoTransferencia(
                1,
                "Banco Pichincha",
                "22001144",
                "TRF001",
                "2026-05-25"
        );

        System.out.println("\n========== PAGO TRANSFERENCIA ==========");
        System.out.println(pagoTransferencia);


        Empresa empresa = new Empresa(
                1,
                "Viajes Ecuador",
                "Agencia de Viajes",
                "Cuenca",
                25,
                true,
                "2020-01-15"
        );

        EvaluacionMadurezDigital evaluacion =
                new EvaluacionMadurezDigital(
                        1,
                        "2026-05-31",
                        "",
                        85,
                        "Excelente presencia digital y uso de tecnología."
                );

        IndicadorDigital indicador1 =
                new IndicadorDigital(
                        1,
                        "Reservas Online",
                        "Reservas realizadas mediante internet",
                        "Ventas",
                        90,
                        "Reservas"
                );

        IndicadorDigital indicador2 =
                new IndicadorDigital(
                        2,
                        "Pagos Digitales",
                        "Pagos realizados por medios electrónicos",
                        "Finanzas",
                        80,
                        "Pagos"
                );

        empresa.registrarEvaluacion(evaluacion);

        System.out.println("\n=================================");
        System.out.println("TRANSFORMACIÓN DIGITAL");
        System.out.println("=================================");

        System.out.println("Empresa: " + empresa.getNombre());
        System.out.println("Sector: " + empresa.getSector());
        System.out.println("Ciudad: " + empresa.getCiudad());

        System.out.println("Nivel de Madurez Digital: "
                + empresa.obtenerNivelMadurezActual());

        System.out.println("Puntaje General: "
                + evaluacion.calcularPromedio());

        System.out.println("\nIndicador 1: "
                + indicador1.getNombre());

        System.out.println("Estado: "
                + indicador1.obtenerEstado());

        System.out.println("\nIndicador 2: "
                + indicador2.getNombre());

        System.out.println("Estado: "
                + indicador2.obtenerEstado());
    }
}