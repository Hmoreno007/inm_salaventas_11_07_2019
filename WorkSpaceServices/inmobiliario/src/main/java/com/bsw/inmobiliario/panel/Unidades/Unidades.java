package com.bsw.inmobiliario.panel.Unidades;

import com.bsw.inmobiliario.components.AjaxEnabledTextField;
import com.bsw.inmobiliario.panel.TipoUnidad.TipoUnidad;
import java.util.ArrayList;
import java.util.List;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;

public class Unidades extends Panel {

    private final AjaxEnabledTextField cantidadUnidades;
    private final DropDownChoice monedas;
    private final DropDownChoice tipos;
    private final UnidadesBean unidadesBean;
    private List<Monedas> listaMonedas;
    private List<TipoUnidad> listaTipos;

    public Unidades(String id) {
        super(id);
        this.setOutputMarkupId(true).setOutputMarkupPlaceholderTag(true);
        unidadesBean = new UnidadesBean();
        initVar();

        cantidadUnidades = new AjaxEnabledTextField<String>("cantidadUnidades", new PropertyModel<String>(this, "unidadesBean.cantidadUnidades"));
        queue(cantidadUnidades);

        ChoiceRenderer renderMonedas = new ChoiceRenderer("descripcionMoneda", "codigoMoneda");
        monedas = new DropDownChoice<Monedas>("perfil", new PropertyModel<Monedas>(this, "unidadesBean.monedas"), listaMonedas, renderMonedas);
        LoadableDetachableModel<List<Monedas>> listaMonedas = new LoadableDetachableModel<List<Monedas>>() {
            @Override
            protected List<Monedas> load() {
                return null;
            }
        };
        queue(monedas);

        ChoiceRenderer renderTipos = new ChoiceRenderer("dercripcionTipo", "codigoTipo");
        tipos = new DropDownChoice<TipoUnidad>("tipos", new PropertyModel<TipoUnidad>(this, "unidadesBean.tipos"), listaTipos, renderTipos);
        LoadableDetachableModel<List<TipoUnidad>> listaTipos = new LoadableDetachableModel<List<TipoUnidad>>() {
            @Override
            protected List<TipoUnidad> load() {
                return null;
            }
        };
    }

    public void initVar() {
        listaMonedas = new ArrayList<>();
        listaTipos = new ArrayList<>();
    }
}
