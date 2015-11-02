/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a RbrUsageTypeFindNoOpRequest Udt Request/Response
 *
 */
public class RbrUsageTypeFindNoOpRequest extends RbrUsageTypeRequest {
/**
 *
 * Constructor to create a   RbrUsageTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrUsageTypeFindNoOpRequest(String id, RbrUsageTypeObjectDataList noOpIn) {
    super(id, "RbrUsageTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrUsageTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrUsageType", noOpIn);
      }
      addInput("RbrUsageType", mapList);
    }
  }
/**
 *
 * Retrieves the RbrUsageTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrUsageTypeObjectDataList getOutput() {
    return RbrUsageTypeObjectHelper.fromMapList(outputMap, "RbrUsageTypeList");
  }
}
