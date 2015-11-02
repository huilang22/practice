/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnitFindNoOpRequest.java
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
 * NoOp class used to simulate a UsageTypeUnitFindNoOpRequest Udt Request/Response
 *
 */
public class UsageTypeUnitFindNoOpRequest extends UsageTypeUnitRequest {
/**
 *
 * Constructor to create a   UsageTypeUnitFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageTypeUnitFindNoOpRequest(String id, UsageTypeUnitObjectDataList noOpIn) {
    super(id, "UsageTypeUnitFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UsageTypeUnitObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageTypeUnit", noOpIn);
      }
      addInput("UsageTypeUnit", mapList);
    }
  }
/**
 *
 * Retrieves the UsageTypeUnitObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeUnitObjectDataList getOutput() {
    return UsageTypeUnitObjectHelper.fromMapList(outputMap, "UsageTypeUnitList");
  }
}
