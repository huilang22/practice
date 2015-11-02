/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitFindNoOpRequest.java
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
 * NoOp class used to simulate a UsageTypeSplitFindNoOpRequest Udt Request/Response
 *
 */
public class UsageTypeSplitFindNoOpRequest extends UsageTypeSplitRequest {
/**
 *
 * Constructor to create a   UsageTypeSplitFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageTypeSplitFindNoOpRequest(String id, UsageTypeSplitObjectDataList noOpIn) {
    super(id, "UsageTypeSplitFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UsageTypeSplitObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageTypeSplit", noOpIn);
      }
      addInput("UsageTypeSplit", mapList);
    }
  }
/**
 *
 * Retrieves the UsageTypeSplitObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeSplitObjectDataList getOutput() {
    return UsageTypeSplitObjectHelper.fromMapList(outputMap, "UsageTypeSplitList");
  }
}
