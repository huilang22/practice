/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupUsageRedirectGroupFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a HqGroupUsageRedirectGroupFindNoOpRequest Udt Request/Response
 *
 */
public class HqGroupUsageRedirectGroupFindNoOpRequest extends HqGroupUsageRedirectGroupRequest {
/**
 *
 * Constructor to create a   HqGroupUsageRedirectGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupUsageRedirectGroupFindNoOpRequest(String id, HqGroupUsageRedirectGroupObjectDataList noOpIn) {
    super(id, "HqGroupUsageRedirectGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = HqGroupUsageRedirectGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroupUsageRedirectGroup", noOpIn);
      }
      addInput("HqGroupUsageRedirectGroup", mapList);
    }
  }
/**
 *
 * Retrieves the HqGroupUsageRedirectGroupObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupUsageRedirectGroupObjectDataList getOutput() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMapList(outputMap, "HqGroupUsageRedirectGroupList");
  }
}
