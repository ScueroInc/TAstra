package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Final_Report;
import upc.edu.pe.spring.repository.IFinal_ReportDAO;


public class Final_ReportService implements IFinal_ReportService{

	private IFinal_ReportDAO dFinal_Report;
	@Override
	public boolean Insert(Final_Report id) {
		Final_Report objFinal_Report=dFinal_Report.save(id);
		if(objFinal_Report==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dFinal_Report.delete(id);
	}

	@Override
	public boolean modificar(Final_Report final_report) {
		boolean flag=false;
		try {
			dFinal_Report.save(final_report);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Final_Report listarid(int id) {
		// TODO Auto-generated method stub
		return dFinal_Report.findOne(id);
	}

	@Override
	public List<Final_Report> listar() {
		// TODO Auto-generated method stub
		return dFinal_Report.findAll();
	}

	

}
