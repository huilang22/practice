/*
 * Generated code DO NOT EDIT
 * Generated file: InvsNetworkDeviceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsNetworkDeviceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsNetworkDeviceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsNetworkDeviceObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsNetworkDeviceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsNetworkDeviceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsNetworkDeviceObjectData noOpInIn) {
    super(id, context, "InvsNetworkDeviceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(noOpIn, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }
/**
 *
 * Sets the  InvsNetworkDevice
 * @param noOpInIn InvsNetworkDeviceObjectData to set
 *
 */
  public void setInvsNetworkDevice(InvsNetworkDeviceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsNetworkDevice passed into the constructor
 * @return Simulated response
 *
 */
  public InvsNetworkDeviceObjectData getInvsNetworkDevice() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsNetworkDeviceObjectHelper.fromMap(inputMap, "InvsNetworkDevice");
  }
}
