/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsNetworkDeviceFindNoOpRequest Udt Request/Response
 *
 */
public class InvsNetworkDeviceFindNoOpRequest extends InvsNetworkDeviceRequest {
/**
 *
 * Constructor to create a   InvsNetworkDeviceFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsNetworkDeviceFindNoOpRequest(String id, InvsNetworkDeviceObjectDataList noOpIn) {
    super(id, "InvsNetworkDeviceFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsNetworkDeviceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsNetworkDevice", noOpIn);
      }
      addInput("InvsNetworkDevice", mapList);
    }
  }
/**
 *
 * Retrieves the InvsNetworkDeviceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsNetworkDeviceObjectDataList getOutput() {
    return InvsNetworkDeviceObjectHelper.fromMapList(outputMap, "InvsNetworkDeviceList");
  }
}
