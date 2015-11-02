/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a GuiIndicatorGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GuiIndicatorGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GuiIndicatorObjectKeyData GIGetIn;
/**
 *
 * Constructor to create a  GuiIndicatorGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GuiIndicatorGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiIndicatorObjectKeyData GIGetInIn) {
    super(id, context, "GuiIndicatorGet");
    GIGetIn = GIGetInIn;
  }

  public void translateToMap() {
    if (GIGetIn != null) {
      GIGetIn.resetFlags(true, true);
      addInput("GuiIndicator", GuiIndicatorObjectKeyHelper.toMap(GIGetIn, new HashMap(), "GuiIndicatorObjectKeyData").get("GuiIndicatorObjectKeyData"));
    }
  }


/**
 *
 * Sets the GuiIndicator
 * @param GIGetInIn Value of the GIGetIn
 *
 */

  public void setGuiIndicator(GuiIndicatorObjectKeyData GIGetInIn) {
    GIGetIn = GIGetInIn;
  }

  public void translateFromMap() {
    GIGetIn = GuiIndicatorObjectKeyHelper.fromMap(inputMap, "GuiIndicator");
  }

/**
 *
 * Gets the GuiIndicator
 * @return Value of the GuiIndicator
 *
 */

  public GuiIndicatorObjectKeyData getGuiIndicator( ) {
    return GIGetIn;
  }

}
