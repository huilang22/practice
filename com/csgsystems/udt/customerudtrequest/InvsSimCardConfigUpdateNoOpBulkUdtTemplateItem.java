/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimCardConfigUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimCardConfigUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimCardConfigUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimCardConfigObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSimCardConfigUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimCardConfigUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigObjectData noOpInIn) {
    super(id, context, "InvsSimCardConfigUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }
/**
 *
 * Sets the  InvsSimCardConfig
 * @param noOpInIn InvsSimCardConfigObjectData to set
 *
 */
  public void setInvsSimCardConfig(InvsSimCardConfigObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimCardConfig passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimCardConfigObjectData getInvsSimCardConfig() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimCardConfigObjectHelper.fromMap(inputMap, "InvsSimCardConfig");
  }
}
