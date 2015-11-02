/*
 * Generated code DO NOT EDIT
 * Generated file: GuiIndicatorDeleteBulkUdtTemplateItem.java
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
 * Class used to create a GuiIndicatorDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GuiIndicatorDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GuiIndicatorObjectKeyData GIDeleteIn;
/**
 *
 * Constructor to create a  GuiIndicatorDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GuiIndicatorDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiIndicatorObjectKeyData GIDeleteInIn) {
    super(id, context, "GuiIndicatorDelete");
    GIDeleteIn = GIDeleteInIn;
  }

  public void translateToMap() {
    if (GIDeleteIn != null) {
      GIDeleteIn.resetFlags(true, true);
      addInput("GuiIndicator", GuiIndicatorObjectKeyHelper.toMap(GIDeleteIn, new HashMap(), "GuiIndicatorObjectKeyData").get("GuiIndicatorObjectKeyData"));
    }
  }


/**
 *
 * Sets the GuiIndicator
 * @param GIDeleteInIn Value of the GIDeleteIn
 *
 */

  public void setGuiIndicator(GuiIndicatorObjectKeyData GIDeleteInIn) {
    GIDeleteIn = GIDeleteInIn;
  }

  public void translateFromMap() {
    GIDeleteIn = GuiIndicatorObjectKeyHelper.fromMap(inputMap, "GuiIndicator");
  }

/**
 *
 * Gets the GuiIndicator
 * @return Value of the GuiIndicator
 *
 */

  public GuiIndicatorObjectKeyData getGuiIndicator( ) {
    return GIDeleteIn;
  }

}
