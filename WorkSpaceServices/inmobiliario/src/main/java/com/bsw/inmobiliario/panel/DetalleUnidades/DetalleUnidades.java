package com.bsw.inmobiliario.panel.DetalleUnidades;

import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.wicket.datetime.StyleDateConverter;
import org.apache.wicket.datetime.markup.html.form.DateTextField;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;

public class DetalleUnidades extends Panel {

    private final AjaxEnabledTextField numeroUnidad;
    private final DropDownChoice estado;
    private final DateTextField fechaEntrega;
    private final AjaxEnabledTextField numero;
    private final AjaxEnabledTextField tarjeta;
    private final DateTextField fechaSeparacion;
    private final AjaxEnabledTextField codigoInmueble;
    private final AjaxEnabledTextField areaPrivada;
    private final AjaxEnabledTextField detalleInmueble;
    private final AjaxEnabledTextField areaConstruida;
    private final DropDownChoice torres;
    private final DropDownChoice pisos;
    private final DropDownChoice interior;
    private final DropDownChoice manzana;
    private final AjaxEnabledTextField alcoba;
    private final AjaxEnabledTextField bano;
    private final AjaxEnabledTextField cuartosUtiles;
    private final AjaxEnabledTextField parqueos;
    private final AjaxEnabledTextField cocina;
    private final AjaxEnabledTextField observacion;
    private final AjaxEnabledTextField precioInmueble;
    private final AjaxEnabledTextField precioSeparacion;
    private final AjaxEnabledTextField precioUnidad;
    private final AjaxEnabledTextField cuotaInicial;
    private final AjaxEnabledTextField precioIncrementoUtil;
    private final AjaxEnabledTextField credito;
    private final AjaxEnabledTextField precioIncrementoPiso;
    private final AjaxEnabledTextField total;
    private final AjaxEnabledTextField precioIncrementoPaqueadero;
    private List<Torres> listatorres;
    private List<EstadoUnidad> listaEstado;
    private List<Pisos> listaPisos;
    private List<Interior> listaInterior;
    private List<Manzana> listaManzana;

    private final DetalleUnidadesBean detalleunidadesBean;

    public DetalleUnidades(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        detalleunidadesBean = new DetalleUnidadesBean();
        initVar();

        numeroUnidad = new AjaxEnabledTextField<Integer>("numeroUnidad", new PropertyModel<Integer>(this, "detalleunidadesBean.numeroUnidad"));
        queue(numeroUnidad);

        ChoiceRenderer renderEstado = new ChoiceRenderer("descripcionEstado", "codigoEstado");
        estado = new DropDownChoice<>("estado", new PropertyModel<EstadoUnidad>(this, "detalleunidadesBean.estado"), listaEstado, renderEstado);
        LoadableDetachableModel<List<EstadoUnidad>> listaTipoIdentificacion = new LoadableDetachableModel<List<EstadoUnidad>>() {
            @Override
            protected List<EstadoUnidad> load() {
                return null;
            }
        };
        queue(estado);

        fechaEntrega = new DateTextField("fechaEntrega", new PropertyModel<Date>(this, "detalleunidadesBean.fechaEntrega"), new StyleDateConverter("S-", true));
        queue(fechaEntrega);
        fechaEntrega.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);

        numero = new AjaxEnabledTextField<String>("numero", new PropertyModel<String>(this, "detalleunidadesBean.numero"));
        queue(numero);

        tarjeta = new AjaxEnabledTextField<List>("tarjeta", new PropertyModel<List>(this, "detalleunidadesBean.tarjeta"));
        queue(tarjeta);

        fechaSeparacion = new DateTextField("fechaSeparacion", new PropertyModel<Date>(this, "detalleunidadesBean.fechaSeparacion"), new StyleDateConverter("S-", true));
        queue(fechaSeparacion);

        codigoInmueble = new AjaxEnabledTextField<List>("codigoInmueble", new PropertyModel<List>(this, "detalleunidadesBean.codigoInmueble"));
        queue(codigoInmueble);

        areaPrivada = new AjaxEnabledTextField<Integer>("areaPrivada", new PropertyModel<Integer>(this, "detalleunidadesBean.areaPrivada"));
        queue(areaPrivada);

        detalleInmueble = new AjaxEnabledTextField<List>("detalleInmueble", new PropertyModel<List>(this, "detalleunidadesBean.detalleInmueble"));
        queue(detalleInmueble);

        areaConstruida = new AjaxEnabledTextField<Integer>("areaConstruida", new PropertyModel<Integer>(this, "detalleunidadesBean.areaConstruida"));
        queue(areaConstruida);

        ChoiceRenderer rendertorres = new ChoiceRenderer("nombretorre", "torreid");
        torres = new DropDownChoice<>("torres", new PropertyModel<Torres>(this, "detalleunidadesBean.torres"), listatorres, rendertorres);
        queue(torres);
        LoadableDetachableModel<List<Torres>> listatorres = new LoadableDetachableModel<List<Torres>>() {
            @Override
            protected List<Torres> load() {
                return null;///()invocacion a microservicio
            }
        };

        ChoiceRenderer renderPisos = new ChoiceRenderer("descripcionPiso", "codigoPiso");
        pisos = new DropDownChoice<>("pisos", new PropertyModel<Pisos>(this, "detalleunidadesBean.pisos"), listaPisos, renderPisos);
        queue(pisos);
        LoadableDetachableModel<List<Pisos>> listaPisos = new LoadableDetachableModel<List<Pisos>>() {
            @Override
            protected List<Pisos> load() {
                return null;///()
            }
        };

        ChoiceRenderer renderInterior = new ChoiceRenderer("descripcionInterior", "codigoInterior");
        interior = new DropDownChoice<>("interior", new PropertyModel<Interior>(this, "detalleunidadesBean.interior"), listaInterior, renderInterior);
        queue(interior);
        LoadableDetachableModel<List<Interior>> listaInterior = new LoadableDetachableModel<List<Interior>>() {
            @Override
            protected List<Interior> load() {
                return null;
            }
        };

        ChoiceRenderer renderManzana = new ChoiceRenderer("descripcionManzana", "codigoManzana");
        manzana = new DropDownChoice<>("manzana", new PropertyModel<Manzana>(this, "detalleunidadesBean.manzana"), listaManzana, renderManzana);
        queue(manzana);
        LoadableDetachableModel<List<Manzana>> listaManzana = new LoadableDetachableModel<List<Manzana>>() {
            @Override
            protected List<Manzana> load() {
                return null;
            }
        };

        alcoba = new AjaxEnabledTextField<Integer>("alcoba", new PropertyModel<Integer>(this, "detalleunidadesBean.alcoba"));
        queue(alcoba);

        bano = new AjaxEnabledTextField<Integer>("bano", new PropertyModel<Integer>(this, "detalleunidadesBean.bano"));
        queue(bano);

        cuartosUtiles = new AjaxEnabledTextField<List>("cuartosUtiles", new PropertyModel<List>(this, "detalleunidadesBean.cuartosUtiles"));
        queue(cuartosUtiles);

        parqueos = new AjaxEnabledTextField<List>("parqueos", new PropertyModel<List>(this, "detalleunidadesBean.parqueos"));
        queue(parqueos);

        cocina = new AjaxEnabledTextField<String>("cocina", new PropertyModel<String>(this, "detalleunidadesBean.cocina"));
        queue(cocina);

        observacion = new AjaxEnabledTextField<String>("observacion", new PropertyModel<String>(this, "detalleunidadesBean.observacion"));
        queue(observacion);

        precioInmueble = new AjaxEnabledTextField<String>("precioInmueble", new PropertyModel<String>(this, "detalleunidadesBean.precioInmueble"));
        queue(precioInmueble);

        precioSeparacion = new AjaxEnabledTextField<BigDecimal>("precioSeparacion", new PropertyModel<BigDecimal>(this, "detalleunidadesBean.precioSeparacion"));
        queue(precioSeparacion);

        precioUnidad = new AjaxEnabledTextField<BigDecimal>("precioUnidad", new PropertyModel<BigDecimal>(this, "detalleunidadesBean.precioUnidad"));
        queue(precioUnidad);

        cuotaInicial = new AjaxEnabledTextField<BigDecimal>("cuotaInicial", new PropertyModel<BigDecimal>(this, "detalleunidadesBean.cuotaInicial"));
        queue(cuotaInicial);

        precioIncrementoUtil = new AjaxEnabledTextField<BigDecimal>("precioIncrementoUtil", new PropertyModel<BigDecimal>(this, "detalleunidadesBean.precioIncrementoUtil"));
        queue(precioIncrementoUtil);

        credito = new AjaxEnabledTextField<BigDecimal>("credito", new PropertyModel<BigDecimal>(this, "detalleunidadesBean.credito"));
        queue(credito);

        precioIncrementoPiso = new AjaxEnabledTextField<BigDecimal>("precioIncrementoPiso", new PropertyModel<BigDecimal>(this, "detalleunidadesBean.precioIncrementoPiso"));
        queue(precioIncrementoPiso);

        precioIncrementoPaqueadero = new AjaxEnabledTextField<BigDecimal>("precioIncrementoPaqueadero", new PropertyModel<BigDecimal>(this, "detalleunidadesBean.precioIncrementoPaqueadero"));
        queue(precioIncrementoPaqueadero);

        total = new AjaxEnabledTextField<BigDecimal>("total", new PropertyModel<BigDecimal>(this, "detalleunidadesBean.total"));
        queue(total);
    }

    public void initVar() {
        listatorres = new ArrayList();
        listaEstado = new ArrayList();
        listaPisos = new ArrayList();
        listaInterior = new ArrayList();
        listaManzana = new ArrayList();
    }
}
