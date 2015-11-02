/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a UsageGroupFindNoOpRequest Udt Request/Response
 *
 */
public class UsageGroupFindNoOpRequest extends UsageGroupRequest {
/**
 *
 * Constructor to create a   UsageGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageGroupFindNoOpRequest(String id, UsageGroupObjectDataList noOpIn) {
    super(id, "UsageGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UsageGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageGroup", noOpIn);
      }
      addInput("UsageGroup", mapList);
    }
  }
/**
 *
 * Retrieves the UsageGroupObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UsageGroupObjectDataList getOutput() {
    return UsageGroupObjectHelper.fromMapList(outputMap, "UsageGroupList");
  }
}
