/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimStockPropConfigGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimStockPropConfigGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimStockPropConfigGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimStockPropConfigObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSimStockPropConfigGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimStockPropConfigGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimStockPropConfigObjectData noOpInIn) {
    super(id, context, "InvsSimStockPropConfigGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }
/**
 *
 * Sets the  InvsSimStockPropConfig
 * @param noOpInIn InvsSimStockPropConfigObjectData to set
 *
 */
  public void setInvsSimStockPropConfig(InvsSimStockPropConfigObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimStockPropConfig passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimStockPropConfigObjectData getInvsSimStockPropConfig() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimStockPropConfigObjectHelper.fromMap(inputMap, "InvsSimStockPropConfig");
  }
}
