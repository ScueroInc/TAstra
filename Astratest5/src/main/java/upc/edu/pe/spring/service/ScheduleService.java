package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Schedule;
import upc.edu.pe.spring.repository.IScheduleDAO;



public class ScheduleService implements IScheduleService{

	private IScheduleDAO dSchedule;
	@Override
	public boolean Insert(Schedule id) {
		Schedule objSchedule=dSchedule.save(id);
		if(objSchedule==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dSchedule.delete(id);
	}

	@Override
	public boolean modificar(Schedule schedule) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			dSchedule.save(schedule);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Schedule listarid(int id) {
		// TODO Auto-generated method stub
		return dSchedule.findOne(id);
	}

	@Override
	public List<Schedule> listar() {
		// TODO Auto-generated method stub
		return dSchedule.findAll();
	}

	

}
