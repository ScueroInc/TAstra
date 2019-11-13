package upc.edu.pe.spring.service;
import java.util.List;

import upc.edu.pe.spring.model.Final_Report;



public interface IFinal_ReportService {

	public boolean Insert(Final_Report id);
	public void eliminar(int id);
	public boolean modificar(Final_Report final_report);
	public Final_Report listarid(int id);
	List<Final_Report> listar();
}
