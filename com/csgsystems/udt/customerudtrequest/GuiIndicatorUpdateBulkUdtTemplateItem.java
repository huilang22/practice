/*
 * Generated code DO NOT EDIT
 * Generated file: GuiIndicatorUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GuiIndicatorUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GuiIndicatorUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GuiIndicatorObjectData GIUpdateIn;
/**
 *
 * Constructor to create a  GuiIndicatorUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GuiIndicatorUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiIndicatorObjectData GIUpdateInIn) {
    super(id, context, "GuiIndicatorUpdate");
    GIUpdateIn = GIUpdateInIn;
  }

  public void translateToMap() {
    if (GIUpdateIn != null) {
      GIUpdateIn.resetFlags(true, true);
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(GIUpdateIn, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }


/**
 *
 * Sets the GuiIndicator
 * @param GIUpdateInIn Value of the GIUpdateIn
 *
 */

  public void setGuiIndicator(GuiIndicatorObjectData GIUpdateInIn) {
    GIUpdateIn = GIUpdateInIn;
  }

  public void translateFromMap() {
    GIUpdateIn = GuiIndicatorObjectHelper.fromMap(inputMap, "GuiIndicator");
  }

/**
 *
 * Gets the GuiIndicator
 * @return Value of the GuiIndicator
 *
 */

  public GuiIndicatorObjectData getGuiIndicator( ) {
    return GIUpdateIn;
  }

}
