/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjprogra.prjarregloobjetos;

/**
 *
 * @author sjbla
 */
public class clsMenu {

    public void MenuCliente() {
        clsHelper clsH = new clsHelper();
        clsCliente clsC = new clsCliente();
        clsCliente clientes[] = new clsCliente[0];
        int poscCliente = 0;
        boolean listaCliente = false;
        char opcion = 'S';
        do {
            opcion = clsH.recibeChar("Seleccione una opcion:\n"
                    + " A. Generar lista de Clientes\n"
                    + " B. Agregar Cliente\n"
                    + " C. Modificar Cliente\n"
                    + " D. Eliminar Cliente\n"
                    + " E. Buscar Cliente\n"
                    + " F. Listar Cliente\n"
                    + " G. Administrar Mascotas\n"
                    + " S. Salir");
            switch (opcion) {
                case 'A':
                    if (listaCliente) {
                        char nueva = 'N';
                        do {
                            nueva = clsH.recibeChar("Desea generar una nueva lista?\nSi\nNo");
                        } while (nueva != 'S' && nueva != 'N');
                        if (nueva == 'S') {
                            clientes = clsC.generarListaCliente();
                            poscCliente = 0;
                            listaCliente = true;
                        }
                    } else {
                        clientes = clsC.generarListaCliente();
                        listaCliente = true;
                    }
                    break;
                case 'B':
                    if (listaCliente) {
                        if (poscCliente < clientes.length) {
                            poscCliente = clsC.agregarCliente(clientes, poscCliente);
                            clsH.imprimeMensaje("Cliente agregado satisfactoriamente.");
                        } else {
                            clsH.imprimeMensaje("La lista clientes se encuentra llena, ya no puede agregar más!");
                        }
                    } else {
                        clsH.imprimeMensaje("Debe generar primero la lista de clientes!");
                    }
                    break;
                case 'C':
                    if (poscCliente == 0) {
                        clsH.imprimeMensaje("Debe agregar un cliente primero!");
                    } else {
                        clsC.modificarCliente(clientes, poscCliente);
                    }
                    break;
                case 'D':
                    if (poscCliente == 0) {
                        clsH.imprimeMensaje("Debe agregar un cliente primero!");
                    } else {
                        poscCliente = clsC.eliminarCliente(clientes, poscCliente);
                    }
                    break;
                case 'E':
                    if (poscCliente == 0) {
                        clsH.imprimeMensaje("Debe agregar un cliente primero!");
                    } else {
                        clsC.buscarCliente(clientes, poscCliente);
                    }
                    break;
                case 'F':
                    if (poscCliente == 0) {
                        clsH.imprimeMensaje("Debe agregar un cliente primero!");
                    } else {
                        clsC.listarClientes(clientes, poscCliente);
                    }
                    break;
                case 'G':
                    int posc = clsC.obtenerPoscCliente(clientes, poscCliente, "buscar para administrar sus mascotas");
                    if (posc == -1) {
                        clsH.imprimeMensaje("No se encontraron coincidencias");
                    } else {
                        clientes[posc] = this.MenuMascota(clientes[posc]);
                        clsH.imprimeMensaje("Los datos de sus mascotas fueron almacenados correctamente");
                    }
                    break;
                case 'S':

                    break;
                default:
                    clsH.imprimeMensaje("La opción seleccionada no es válida!");
            }

        } while (opcion != 'S');

    }

    public clsCliente MenuMascota(clsCliente cliente) {
        clsHelper clsH = new clsHelper();
        clsMascota clsM = new clsMascota();
        clsMascota mascotas[] = cliente.getListaMascotas();
        int poscMascota = cliente.getCantMascotas();
        char opcion = 'S';
        do {
            opcion = clsH.recibeChar("Seleccione una opcion:\n"
                    + " A. Generar lista de Mascotas\n"
                    + " B. Agregar Mascota\n"
                    + " C. Modificar Mascota\n"
                    + " D. Eliminar Mascota\n"
                    + " E. Buscar Mascota\n"
                    + " F. Listar Mascota\n"
                    + " R. Regresar a Cliente");
            switch (opcion) {
                case 'A':
                    if (poscMascota >= 0) {
                        char nueva = 'N';
                        do {
                            nueva = clsH.recibeChar("Desea generar una nueva lista?\nSi\nNo");
                        } while (nueva != 'S' && nueva != 'N');
                        if (nueva == 'S') {
                            mascotas = clsM.generarListaMascota();
                            poscMascota = 0;
                        }
                    } else {
                        mascotas = clsM.generarListaMascota();
                        poscMascota = 0;
                    }
                    break;
                case 'B':
                    if (poscMascota == -1) {
                        clsH.imprimeMensaje("Debe generar primero la lista de mascotas!");
                    } else {
                        if (poscMascota < mascotas.length) {
                            poscMascota = clsM.agregarMascota(mascotas, poscMascota);
                            clsH.imprimeMensaje("Mascota agregada satisfactoriamente.");
                        } else {
                            clsH.imprimeMensaje("La lista mascotas se encuentra llena, ya no puede agregar más!");
                        }
                    }
                    break;
                case 'C':
                    if (poscMascota < 1) {
                        clsH.imprimeMensaje("Debe agregar una mascota primero!");
                    } else {
                        clsM.modificarMascota(mascotas, poscMascota);
                    }
                    break;
                case 'D':
                    if (poscMascota < 1) {
                        clsH.imprimeMensaje("Debe agregar una mascota primero!");
                    } else {
                        poscMascota = clsM.eliminarMascota(mascotas, poscMascota);
                    }
                    break;
                case 'E':
                    if (poscMascota < 1) {
                        clsH.imprimeMensaje("Debe agregar una mascota primero!");
                    } else {
                        clsM.buscarMascota(mascotas, poscMascota);
                    }
                    break;
                case 'F':
                    if (poscMascota < 1) {
                        clsH.imprimeMensaje("Debe agregar una mascota primero!");
                    } else {
                        clsM.listarMascotas(mascotas, poscMascota);
                    }
                    break;
                case 'R':

                    break;
                default:
                    clsH.imprimeMensaje("La opción seleccionada no es válida!");
            }

        } while (opcion != 'R');
        
        cliente.setCantMascotas(poscMascota);
        cliente.setListaMascotas(mascotas);
        
        return cliente;
    }
}
