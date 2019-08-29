package com.company.wizard.web.screens.livingbuilding;

import com.haulmont.cuba.gui.screen.*;
import com.company.wizard.entity.LivingBuilding;

@UiController("wizard_LivingBuilding.edit")
@UiDescriptor("living-building-edit.xml")
@EditedEntityContainer("livingBuildingDc")
@LoadDataBeforeShow
public class LivingBuildingEdit extends StandardEditor<LivingBuilding> {
}