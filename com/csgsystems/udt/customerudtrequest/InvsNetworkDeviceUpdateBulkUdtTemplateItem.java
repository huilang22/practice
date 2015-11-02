/*
 * Generated code DO NOT EDIT
 * Generated file: InvsNetworkDeviceUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsNetworkDeviceUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsNetworkDeviceUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsNetworkDeviceObjectData InvsNetworkDeviceUpdateIn;
/**
 *
 * Constructor to create a  InvsNetworkDeviceUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsNetworkDeviceUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsNetworkDeviceObjectData InvsNetworkDeviceUpdateInIn) {
    super(id, context, "InvsNetworkDeviceUpdate");
    InvsNetworkDeviceUpdateIn = InvsNetworkDeviceUpdateInIn;
  }

  public void translateToMap() {
    if (InvsNetworkDeviceUpdateIn != null) {
      InvsNetworkDeviceUpdateIn.resetFlags(true, true);
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(InvsNetworkDeviceUpdateIn, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }


/**
 *
 * Sets the InvsNetworkDevice
 * @param InvsNetworkDeviceUpdateInIn Value of the InvsNetworkDeviceUpdateIn
 *
 */

  public void setInvsNetworkDevice(InvsNetworkDeviceObjectData InvsNetworkDeviceUpdateInIn) {
    InvsNetworkDeviceUpdateIn = InvsNetworkDeviceUpdateInIn;
  }

  public void translateFromMap() {
    InvsNetworkDeviceUpdateIn = InvsNetworkDeviceObjectHelper.fromMap(inputMap, "InvsNetworkDevice");
  }

/**
 *
 * Gets the InvsNetworkDevice
 * @return Value of the InvsNetworkDevice
 *
 */

  public InvsNetworkDeviceObjectData getInvsNetworkDevice( ) {
    return InvsNetworkDeviceUpdateIn;
  }

}
