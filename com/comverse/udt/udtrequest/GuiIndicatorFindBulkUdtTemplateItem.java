/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorFindBulkUdtTemplateItem.java
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
 * Class used to create a GuiIndicatorFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GuiIndicatorFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GuiIndicatorObjectFilter GIFindIn;
/**
 *
 * Constructor to create a  GuiIndicatorFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GuiIndicatorFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiIndicatorObjectFilter GIFindInIn) {
    super(id, context, "GuiIndicatorFind");
    GIFindIn = GIFindInIn;
  }

  public void translateToMap() {
    if (GIFindIn != null) {
      Integer index =  GIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(GIFindIn, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }


/**
 *
 * Sets the GuiIndicator
 * @param GIFindInIn Value of the GIFindIn
 *
 */

  public void setGuiIndicator(GuiIndicatorObjectFilter GIFindInIn) {
    GIFindIn = GIFindInIn;
  }

  public void translateFromMap() {
    GIFindIn = GuiIndicatorObjectHelper.fromMapFilter(inputMap, "GuiIndicator");
  }

/**
 *
 * Gets the GuiIndicator
 * @return Value of the GuiIndicator
 *
 */

  public GuiIndicatorObjectFilter getGuiIndicator( ) {
    return GIFindIn;
  }

}
