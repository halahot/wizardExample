package com.company.wizard.web.screens.own;

import com.haulmont.cuba.gui.screen.*;
import com.company.wizard.entity.Own;

@UiController("wizard_Own.browse")
@UiDescriptor("own-browse.xml")
@LookupComponent("ownsTable")
@LoadDataBeforeShow
public class OwnBrowse extends StandardLookup<Own> {
}