package com.company.wizard.web.screens.own;

import com.company.wizard.web.screens.checkout.Checkout;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;
import com.company.wizard.entity.Own;

import javax.inject.Inject;

@UiController("wizard_Own.edit")
@UiDescriptor("own-edit.xml")
@EditedEntityContainer("ownDc")
@LoadDataBeforeShow
public class OwnEdit extends StandardEditor<Own> {
    @Inject
    private Screens screens;

    @Subscribe("openWizardBtn")
    private void onOpenWizardBtnClick(Button.ClickEvent event)
    {
        screens.create(Checkout.class).show();
    }
}