/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsNetworkDeviceCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsNetworkDeviceCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsNetworkDeviceObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsNetworkDeviceCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsNetworkDeviceCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsNetworkDeviceObjectData noOpInIn) {
    super(id, context, "InvsNetworkDeviceCreate");
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
