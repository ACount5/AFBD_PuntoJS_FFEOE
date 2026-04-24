package AFBD.PuntoJS.AFBD.PuntoJS.Repositorio;

import AFBD.PuntoJS.AFBD.PuntoJS.Dominio.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioTarea extends JpaRepository<Tarea,Integer> {
}
