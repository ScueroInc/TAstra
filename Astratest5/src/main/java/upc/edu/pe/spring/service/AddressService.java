package upc.edu.pe.spring.service;
import java.util.List;

import upc.edu.pe.spring.model.Address;
import upc.edu.pe.spring.repository.IAddressDAO;


public class AddressService implements IAddressService{

	private IAddressDAO  dAddress;
	@Override
	public boolean Insert(Address id) {
		Address objAddress=dAddress.save(id);
		if(objAddress==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		
		dAddress.delete(id);
	}

	@Override
	public boolean modificar(Address address) {
		boolean flag=false;
		try {
			dAddress.save(address);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Address listarid(int id) {
		// TODO Auto-generated method stub
		return dAddress.findOne(id);
	}

	@Override
	public List<Address> listar() {
		// TODO Auto-generated method stub
		return dAddress.findAll();
	}

	
}
