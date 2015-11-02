/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointFindNoOpRequest.java
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
 * NoOp class used to simulate a UsagePointFindNoOpRequest Udt Request/Response
 *
 */
public class UsagePointFindNoOpRequest extends UsagePointRequest {
/**
 *
 * Constructor to create a   UsagePointFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsagePointFindNoOpRequest(String id, UsgPntObjectDataList noOpIn) {
    super(id, "UsagePointFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UsgPntObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsagePoint", noOpIn);
      }
      addInput("UsagePoint", mapList);
    }
  }
/**
 *
 * Retrieves the UsgPntObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UsgPntObjectDataList getOutput() {
    return UsgPntObjectHelper.fromMapList(outputMap, "UsagePointList");
  }
}
