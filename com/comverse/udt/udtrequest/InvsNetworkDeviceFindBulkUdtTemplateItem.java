/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsNetworkDeviceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsNetworkDeviceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsNetworkDeviceObjectFilter InvsNetworkDeviceFindIn;
/**
 *
 * Constructor to create a  InvsNetworkDeviceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsNetworkDeviceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsNetworkDeviceObjectFilter InvsNetworkDeviceFindInIn) {
    super(id, context, "InvsNetworkDeviceFind");
    InvsNetworkDeviceFindIn = InvsNetworkDeviceFindInIn;
  }

  public void translateToMap() {
    if (InvsNetworkDeviceFindIn != null) {
      Integer index =  InvsNetworkDeviceFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(InvsNetworkDeviceFindIn, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }


/**
 *
 * Sets the InvsNetworkDevice
 * @param InvsNetworkDeviceFindInIn Value of the InvsNetworkDeviceFindIn
 *
 */

  public void setInvsNetworkDevice(InvsNetworkDeviceObjectFilter InvsNetworkDeviceFindInIn) {
    InvsNetworkDeviceFindIn = InvsNetworkDeviceFindInIn;
  }

  public void translateFromMap() {
    InvsNetworkDeviceFindIn = InvsNetworkDeviceObjectHelper.fromMapFilter(inputMap, "InvsNetworkDevice");
  }

/**
 *
 * Gets the InvsNetworkDevice
 * @return Value of the InvsNetworkDevice
 *
 */

  public InvsNetworkDeviceObjectFilter getInvsNetworkDevice( ) {
    return InvsNetworkDeviceFindIn;
  }

}
