package co.edu.uniquindio.poo.proyecto_final_p2.model;


import java.util.ArrayList;
import java.util.List;

public class Administrador {

    private String id;
    private String contrasenia;
    private List<Usuario> listUsuarios;
    private List<Repartidor> listRepartidores;
    private List<Envio> listEnvios;
    private static Administrador instance;

    private Administrador(String id, String contrasenia) {
        this.id = id;
        this.contrasenia = contrasenia;
        this.listUsuarios = new ArrayList<>();
        this.listRepartidores = new ArrayList<>();
        this.listEnvios = new ArrayList<>();
    }

    // Patrón singelton

    public static Administrador getInstancia() {
        if (instance == null) {
            instance = new Administrador("admin", "1234");
        }
        return instance;
    }



    public void agregarUsuario(Usuario id) {
        listUsuarios.add(id);
    }

    public Usuario buscarUsuario(int id) {
        for (Usuario u : listUsuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public boolean eliminarUsuario(int id) {
        Usuario usuario = buscarUsuario(id);
        if (usuario != null) {
            listUsuarios.remove(id);
            return true;
        }
        return false;
    }

    public boolean actualizarUsuario(Usuario idActualizado) {
        for (int i = 0; i < listUsuarios.size(); i++) {
            if (listUsuarios.get(i).getId() == idActualizado.getId()) {
                listUsuarios.set(i, idActualizado);
                return true;
            }
        }
        return false;
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }


    public void agregarRepartidor(Repartidor repartidor) {
        listRepartidores.add(repartidor);
    }

    public Repartidor buscarRepartidor(int id) {
        for (Repartidor r : listRepartidores) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }

    public boolean eliminarRepartidor(int id) {
        Repartidor repartidor = buscarRepartidor(id);
        if (repartidor != null) {
            listRepartidores.remove(repartidor);
            return true;
        }
        return false;
    }

    public boolean actualizarRepartidor(Repartidor repartidorActualizado) {
        for (int i = 0; i < listRepartidores.size(); i++) {
            if (listRepartidores.get(i).getId() == repartidorActualizado.getId()) {
                listRepartidores.set(i, repartidorActualizado);
                return true;
            }
        }
        return false;
    }

    public void agregarEnvio(Envio envio) {
        listEnvios.add(envio);
    }

    public Envio buscarEnvioPorId(int id) {
        for (Envio e : listEnvios) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public boolean eliminarEnvio(int id) {
        Envio envio = buscarEnvioPorId(id);
        if (envio != null) {
            listEnvios.remove(envio);
            return true;
        }
        return false;
    }

    public List<Repartidor> getListRepartidores() {
        return listRepartidores;
    }

    public List<Envio> getListEnvios() {
        return listEnvios;
    }


    public String getUsuario() {
        return id;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setUsuario(String id) {
        this.id = id;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}

