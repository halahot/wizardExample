package com.company.wizard.web.screens.livingbuilding;

import com.haulmont.cuba.gui.screen.*;
import com.company.wizard.entity.LivingBuilding;

@UiController("wizard_LivingBuilding.browse")
@UiDescriptor("living-building-browse.xml")
@LookupComponent("livingBuildingsTable")
@LoadDataBeforeShow
public class LivingBuildingBrowse extends StandardLookup<LivingBuilding> {
}