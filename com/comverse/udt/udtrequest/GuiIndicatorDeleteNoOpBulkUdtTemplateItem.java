/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GuiIndicatorDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GuiIndicatorDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GuiIndicatorObjectData noOpIn;

/**
 *
 * Constructor to create a   GuiIndicatorDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GuiIndicatorDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiIndicatorObjectData noOpInIn) {
    super(id, context, "GuiIndicatorDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(noOpIn, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }
/**
 *
 * Sets the  GuiIndicator
 * @param noOpInIn GuiIndicatorObjectData to set
 *
 */
  public void setGuiIndicator(GuiIndicatorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GuiIndicator passed into the constructor
 * @return Simulated response
 *
 */
  public GuiIndicatorObjectData getGuiIndicator() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GuiIndicatorObjectHelper.fromMap(inputMap, "GuiIndicator");
  }
}
