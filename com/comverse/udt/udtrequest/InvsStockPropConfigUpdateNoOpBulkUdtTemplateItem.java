/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropConfigUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsStockPropConfigUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsStockPropConfigUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsStockPropConfigObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsStockPropConfigUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsStockPropConfigUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropConfigObjectData noOpInIn) {
    super(id, context, "InvsStockPropConfigUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(noOpIn, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }
/**
 *
 * Sets the  InvsStockPropConfig
 * @param noOpInIn InvsStockPropConfigObjectData to set
 *
 */
  public void setInvsStockPropConfig(InvsStockPropConfigObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsStockPropConfig passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStockPropConfigObjectData getInvsStockPropConfig() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsStockPropConfigObjectHelper.fromMap(inputMap, "InvsStockPropConfig");
  }
}
