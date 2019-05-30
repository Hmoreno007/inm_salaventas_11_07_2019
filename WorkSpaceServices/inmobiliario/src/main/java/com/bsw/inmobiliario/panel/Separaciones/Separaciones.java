package com.bsw.inmobiliario.panel.Separaciones;

import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.wicket.datetime.StyleDateConverter;
import org.apache.wicket.datetime.markup.html.form.DateTextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

public class Separaciones extends Panel {

    private final AjaxEnabledTextField codigoUnidad;
    private final AjaxEnabledTextField numeroUnidad;
    private final DateTextField fechaEntrega;
    private final AjaxEnabledTextField tarjeta;
    private final AjaxEnabledTextField teceros;
    private final AjaxEnabledTextField valorUnidad;
    private final AjaxEnabledTextField valorOriginal;
    private final AjaxEnabledTextField cuotaInicial;
    private final AjaxEnabledTextField porcentajeSeparacion;
    private final AjaxEnabledTextField totalUnidad;
    private final AjaxEnabledTextField credito;
    private final AjaxEnabledTextField confirmarSeparacion;

    private final SeparacionesBean separacionesBean;

    public Separaciones(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        separacionesBean = new SeparacionesBean();

        codigoUnidad = new AjaxEnabledTextField<String>("codigoUnidad", new PropertyModel<String>(this, "separacionesBean.codigoUnidad"));
        queue(codigoUnidad);

        numeroUnidad = new AjaxEnabledTextField<Integer>("numeroUnidad", new PropertyModel<Integer>(this, "separacionesBean.numeroUnidad"));
        queue(numeroUnidad);

        fechaEntrega = new DateTextField("fechaEntrega", new PropertyModel<Date>(this, "separacionesBean.fechaEntrega"), new StyleDateConverter("S-", true));
        //queue(fechaEntrega);
        fechaEntrega.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);

        tarjeta = new AjaxEnabledTextField<>("tarjeta", new PropertyModel<List>(this, "separacionesBean.tarjeta"));
        queue(tarjeta);

        teceros = new AjaxEnabledTextField<>("teceros", new PropertyModel<List>(this, "separacionesBean.teceros"));
        queue(teceros);

        valorUnidad = new AjaxEnabledTextField<BigDecimal>("valorUnidad", new PropertyModel<BigDecimal>(this, "separacionesBean.valorUnidad"));
        queue(valorUnidad);

        valorOriginal = new AjaxEnabledTextField<BigDecimal>("valorOriginal", new PropertyModel<BigDecimal>(this, "separacionesBean.valorOriginal"));
        queue(valorOriginal);

        cuotaInicial = new AjaxEnabledTextField<BigDecimal>("cuotaInicial", new PropertyModel<BigDecimal>(this, "separacionesBean.cuotaInicial"));
        queue(cuotaInicial);

        porcentajeSeparacion = new AjaxEnabledTextField<BigDecimal>("porcentajeSeparacion", new PropertyModel<BigDecimal>(this, "separacionesBean.porcentajeSeparacion"));
        queue(porcentajeSeparacion);

        totalUnidad = new AjaxEnabledTextField<BigDecimal>("totalUnidad", new PropertyModel<BigDecimal>(this, "separacionesBean.totalUnidad"));
        queue(totalUnidad);

        credito = new AjaxEnabledTextField<BigDecimal>("credito", new PropertyModel<BigDecimal>(this, "separacionesBean.credito"));
        queue(credito);

        confirmarSeparacion = new AjaxEnabledTextField<Boolean>("confirmarSeparacion", new PropertyModel<Boolean>(this, "separacionesBean.confirmarSeparacion"));
        queue(confirmarSeparacion);

    }

}
