package upc.edu.pe.spring.service;
import java.util.List;

import upc.edu.pe.spring.model.Machine_Review;
import upc.edu.pe.spring.repository.IMachine_ReviewDAO;



public class Machine_ReviewService implements IMachine_ReviewService{

	private IMachine_ReviewDAO dMachine_Review;
	@Override
	public boolean Insert(Machine_Review id) {
		Machine_Review objMachine_Review=dMachine_Review.save(id);
		if(objMachine_Review==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dMachine_Review.delete(id);
	}

	@Override
	public boolean modificar(Machine_Review machine_review) {
		boolean flag=false;
		try {
			dMachine_Review.save(machine_review);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Machine_Review listarid(int id) {
		// TODO Auto-generated method stub
		return dMachine_Review.findOne(id);
	}

	@Override
	public List<Machine_Review> listar() {
		// TODO Auto-generated method stub
		return dMachine_Review.findAll();
	}

	

}
