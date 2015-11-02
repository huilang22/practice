/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimSalesChannelRefFindNoOpRequest Udt Request/Response
 *
 */
public class InvsSimSalesChannelRefFindNoOpRequest extends InvsSimSalesChannelRefRequest {
/**
 *
 * Constructor to create a   InvsSimSalesChannelRefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimSalesChannelRefFindNoOpRequest(String id, InvsSimSalesChannelRefObjectDataList noOpIn) {
    super(id, "InvsSimSalesChannelRefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsSimSalesChannelRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimSalesChannelRef", noOpIn);
      }
      addInput("InvsSimSalesChannelRef", mapList);
    }
  }
/**
 *
 * Retrieves the InvsSimSalesChannelRefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimSalesChannelRefObjectDataList getOutput() {
    return InvsSimSalesChannelRefObjectHelper.fromMapList(outputMap, "InvsSimSalesChannelRefList");
  }
}
