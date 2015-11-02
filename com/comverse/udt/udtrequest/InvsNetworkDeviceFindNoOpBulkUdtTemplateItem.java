/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsNetworkDeviceFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsNetworkDeviceFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsNetworkDeviceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsNetworkDeviceFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsNetworkDeviceFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsNetworkDeviceObjectDataList noOpInIn) {
    super(id, context, "InvsNetworkDeviceFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = InvsNetworkDeviceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsNetworkDevice", noOpIn);
      }
      addInput("InvsNetworkDevice", mapList);
    }
  }
/**
 *
 * Sets the  InvsNetworkDevice
 * @param noOpInIn InvsNetworkDeviceObjectDataList to set
 *
 */
  public void setInvsNetworkDevice(InvsNetworkDeviceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsNetworkDevice passed into the constructor
 * @return Simulated response
 *
 */
  public InvsNetworkDeviceObjectDataList getInvsNetworkDevice() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsNetworkDeviceObjectHelper.fromMapList(inputMap, "InvsNetworkDeviceList");
  }
}
