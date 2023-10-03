/**
 * 
 */
package Sesion2B;

/**
 * 
 */
public class Empleado {

	public enum TipoEmpleado{Vendedor, Encargado};
	
	
public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) 
	{
	float salario=0;
		if(tipo==TipoEmpleado.Vendedor) //Calculo la nomina de vendedor
		{
			if(ventasMes<1000)
				salario=2000;
			else
				if(ventasMes<1500)
					salario=2000+100;
				else
					salario=2000+200;
		}
		else if (tipo==TipoEmpleado.Encargado) //calculo la nomina de encargado
		{
			if(ventasMes<1000)
				salario=2500;
			else
				if(ventasMes<1500)
					salario=2500+100;
				else
					salario=2500+200;
		}
		return salario;
	}
 public float calculoNominaNeta(float nominaBruta)
{
	 float retencion=0;
	if(nominaBruta>2100 && nominaBruta<2500)
	{
		retencion=0.15f;
	}
	else if(nominaBruta>2500)
	{
		retencion=0.18f;
	}
	return nominaBruta*(1-retencion);
}
}
/* 1 test encargado, 1 test vendedor, 1 test otro

1 test si el salario es menor de 0, mayor que 0, mayor que 1000, mayor que 1500

igual para las retenciones