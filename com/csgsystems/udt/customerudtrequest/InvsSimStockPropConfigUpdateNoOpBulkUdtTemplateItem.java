/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimStockPropConfigUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsSimStockPropConfigUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimStockPropConfigUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimStockPropConfigObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSimStockPropConfigUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimStockPropConfigUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimStockPropConfigObjectData noOpInIn) {
    super(id, context, "InvsSimStockPropConfigUpdate");
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
