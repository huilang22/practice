/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsNetworkDeviceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsNetworkDeviceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsNetworkDeviceObjectData InvsNetworkDeviceCreateIn;
/**
 *
 * Constructor to create a  InvsNetworkDeviceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsNetworkDeviceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsNetworkDeviceObjectData InvsNetworkDeviceCreateInIn) {
    super(id, context, "InvsNetworkDeviceCreate");
    InvsNetworkDeviceCreateIn = InvsNetworkDeviceCreateInIn;
  }

  public void translateToMap() {
    if (InvsNetworkDeviceCreateIn != null) {
      InvsNetworkDeviceCreateIn.resetFlags(true, true);
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(InvsNetworkDeviceCreateIn, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }


/**
 *
 * Sets the InvsNetworkDevice
 * @param InvsNetworkDeviceCreateInIn Value of the InvsNetworkDeviceCreateIn
 *
 */

  public void setInvsNetworkDevice(InvsNetworkDeviceObjectData InvsNetworkDeviceCreateInIn) {
    InvsNetworkDeviceCreateIn = InvsNetworkDeviceCreateInIn;
  }

  public void translateFromMap() {
    InvsNetworkDeviceCreateIn = InvsNetworkDeviceObjectHelper.fromMap(inputMap, "InvsNetworkDevice");
  }

/**
 *
 * Gets the InvsNetworkDevice
 * @return Value of the InvsNetworkDevice
 *
 */

  public InvsNetworkDeviceObjectData getInvsNetworkDevice( ) {
    return InvsNetworkDeviceCreateIn;
  }

}
