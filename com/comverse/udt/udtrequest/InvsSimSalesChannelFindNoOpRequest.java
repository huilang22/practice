/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimSalesChannelFindNoOpRequest Udt Request/Response
 *
 */
public class InvsSimSalesChannelFindNoOpRequest extends InvsSimSalesChannelRequest {
/**
 *
 * Constructor to create a   InvsSimSalesChannelFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimSalesChannelFindNoOpRequest(String id, InvsSimSalesChannelObjectDataList noOpIn) {
    super(id, "InvsSimSalesChannelFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsSimSalesChannelObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimSalesChannel", noOpIn);
      }
      addInput("InvsSimSalesChannel", mapList);
    }
  }
/**
 *
 * Retrieves the InvsSimSalesChannelObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimSalesChannelObjectDataList getOutput() {
    return InvsSimSalesChannelObjectHelper.fromMapList(outputMap, "InvsSimSalesChannelList");
  }
}
