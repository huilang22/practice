/*
 * Generated code DO NOT EDIT
 * Generated file: InvsNetworkDeviceGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsNetworkDeviceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsNetworkDeviceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsNetworkDeviceObjectKeyData InvsNetworkDeviceGetIn;
/**
 *
 * Constructor to create a  InvsNetworkDeviceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsNetworkDeviceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsNetworkDeviceObjectKeyData InvsNetworkDeviceGetInIn) {
    super(id, context, "InvsNetworkDeviceGet");
    InvsNetworkDeviceGetIn = InvsNetworkDeviceGetInIn;
  }

  public void translateToMap() {
    if (InvsNetworkDeviceGetIn != null) {
      InvsNetworkDeviceGetIn.resetFlags(true, true);
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectKeyHelper.toMap(InvsNetworkDeviceGetIn, new HashMap(), "InvsNetworkDeviceObjectKeyData").get("InvsNetworkDeviceObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsNetworkDevice
 * @param InvsNetworkDeviceGetInIn Value of the InvsNetworkDeviceGetIn
 *
 */

  public void setInvsNetworkDevice(InvsNetworkDeviceObjectKeyData InvsNetworkDeviceGetInIn) {
    InvsNetworkDeviceGetIn = InvsNetworkDeviceGetInIn;
  }

  public void translateFromMap() {
    InvsNetworkDeviceGetIn = InvsNetworkDeviceObjectKeyHelper.fromMap(inputMap, "InvsNetworkDevice");
  }

/**
 *
 * Gets the InvsNetworkDevice
 * @return Value of the InvsNetworkDevice
 *
 */

  public InvsNetworkDeviceObjectKeyData getInvsNetworkDevice( ) {
    return InvsNetworkDeviceGetIn;
  }

}
