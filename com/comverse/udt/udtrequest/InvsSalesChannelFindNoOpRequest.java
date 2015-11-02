/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsSalesChannelFindNoOpRequest Udt Request/Response
 *
 */
public class InvsSalesChannelFindNoOpRequest extends InvsSalesChannelRequest {
/**
 *
 * Constructor to create a   InvsSalesChannelFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSalesChannelFindNoOpRequest(String id, InvsSalesChannelObjectDataList noOpIn) {
    super(id, "InvsSalesChannelFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsSalesChannelObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSalesChannel", noOpIn);
      }
      addInput("InvsSalesChannel", mapList);
    }
  }
/**
 *
 * Retrieves the InvsSalesChannelObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSalesChannelObjectDataList getOutput() {
    return InvsSalesChannelObjectHelper.fromMapList(outputMap, "InvsSalesChannelList");
  }
}
