/*
 * Generated code DO NOT EDIT
 * Generated file: GuiIndicatorUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GuiIndicatorUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GuiIndicatorUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GuiIndicatorObjectData noOpIn;

/**
 *
 * Constructor to create a   GuiIndicatorUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GuiIndicatorUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiIndicatorObjectData noOpInIn) {
    super(id, context, "GuiIndicatorUpdate");
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
