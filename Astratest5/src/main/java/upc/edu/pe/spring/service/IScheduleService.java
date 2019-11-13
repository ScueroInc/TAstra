package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Schedule;



public interface IScheduleService {

	public boolean Insert(Schedule id);
	public void eliminar(int id);
	public boolean modificar(Schedule schedule);
	public Schedule listarid(int id);
	List<Schedule> listar();
}
