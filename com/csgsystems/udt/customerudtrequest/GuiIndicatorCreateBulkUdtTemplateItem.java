/*
 * Generated code DO NOT EDIT
 * Generated file: GuiIndicatorCreateBulkUdtTemplateItem.java
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
 * Class used to create a GuiIndicatorCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GuiIndicatorCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GuiIndicatorObjectData GICreateIn;
/**
 *
 * Constructor to create a  GuiIndicatorCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GuiIndicatorCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiIndicatorObjectData GICreateInIn) {
    super(id, context, "GuiIndicatorCreate");
    GICreateIn = GICreateInIn;
  }

  public void translateToMap() {
    if (GICreateIn != null) {
      GICreateIn.resetFlags(true, true);
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(GICreateIn, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }


/**
 *
 * Sets the GuiIndicator
 * @param GICreateInIn Value of the GICreateIn
 *
 */

  public void setGuiIndicator(GuiIndicatorObjectData GICreateInIn) {
    GICreateIn = GICreateInIn;
  }

  public void translateFromMap() {
    GICreateIn = GuiIndicatorObjectHelper.fromMap(inputMap, "GuiIndicator");
  }

/**
 *
 * Gets the GuiIndicator
 * @return Value of the GuiIndicator
 *
 */

  public GuiIndicatorObjectData getGuiIndicator( ) {
    return GICreateIn;
  }

}
