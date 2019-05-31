package com.bsw.inmobiliario.panel.PlanDePagos;

import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import java.util.Date;
import java.util.List;
import org.apache.wicket.datetime.StyleDateConverter;
import org.apache.wicket.datetime.markup.html.form.DateTextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

public class PlanDePagos extends Panel {

	private final AjaxEnabledTextField numeroUnidad;
	private final AjaxEnabledTextField estadoUnidad;
	private final AjaxEnabledTextField tarjeta;
	private final AjaxEnabledTextField principal;
	private final AjaxEnabledTextField porcentajeSeparacion;
	private final DateTextField fechaSeparacion;
	private final AjaxEnabledTextField valorCuotaInicial;
	private final AjaxEnabledTextField numeroDeCuotas;
	private final DateTextField fechaPrimerCuota;
	private final AjaxEnabledTextField valorCredito;
	private final DateTextField fechaCredito;
	private final AjaxEnabledTextField totalInmueble;
	private final AjaxEnabledTextField calculoAutoMan;
	private final PlanDePagosBean planDePagosBean;

    public PlanDePagos(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        planDePagosBean = new PlanDePagosBean();

        numeroUnidad = new AjaxEnabledTextField<String>("numeroUnidad",new PropertyModel<String>(this,"planDePagosBean.numeroUnidad"));
        queue(numeroUnidad);

        estadoUnidad = new AjaxEnabledTextField<String>("estadoUnidad",new PropertyModel<String>(this,"planDePagosBean.estadoUnidad"));
        queue(estadoUnidad);

        tarjeta = new AjaxEnabledTextField<String>("tarjeta",new PropertyModel<String>(this,"planDePagosBean.tarjeta"));
        queue(tarjeta);

        
        principal = new AjaxEnabledTextField<String>("principal",new PropertyModel<String>(this,"planDePagosBean.principal"));
        queue(principal);

        
        porcentajeSeparacion = new AjaxEnabledTextField<Integer>("porcentajeSeparacion",new PropertyModel<Integer>(this,"planDePagosBean.porcentajeSeparacion"));
        queue(porcentajeSeparacion);


        fechaSeparacion = new DateTextField("fechaSeparacion",new PropertyModel<Date>(this,"planDePagosBean.fechaSeparacion"), new StyleDateConverter("S-", true));
        fechaSeparacion.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        queue(fechaSeparacion);
        
        valorCuotaInicial = new AjaxEnabledTextField<Integer>("valorCuotaInicial",new PropertyModel<Integer>(this,"planDePagosBean.valorCuotaInicial"));
        queue(valorCuotaInicial); 

         
        numeroDeCuotas = new AjaxEnabledTextField<Integer>("numeroDeCuotas",new PropertyModel<Integer>(this,"planDePagosBean.numeroDeCuotas"));
        queue(numeroDeCuotas);

	
        fechaPrimerCuota = new DateTextField("fechaPrimerCuota",new PropertyModel<Date>(this,"planDePagosBean.fechaPrimerCuota"), new StyleDateConverter("S-", true));
        fechaPrimerCuota.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        queue(fechaPrimerCuota);
        
        valorCredito = new AjaxEnabledTextField<Integer>("valorCredito",new PropertyModel<Integer>(this,"planDePagosBean.valorCredito"));
        queue(valorCredito); 

        
        fechaCredito = new DateTextField("fechaCredito",new PropertyModel<Date>(this,"planDePagosBean.fechaCredito"), new StyleDateConverter("S-", true));
        fechaCredito.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        queue(fechaCredito);

         totalInmueble = new AjaxEnabledTextField<Integer>("totalInmueble",new PropertyModel<Integer>(this,"planDePagosBean.totalInmueble"));
        queue(totalInmueble); 

        calculoAutoMan = new AjaxEnabledTextField<String>("calculoAutoMan",new PropertyModel<String>(this,"planDePagosBean.calculoAutoMan"));
        queue(calculoAutoMan); 

    }
}