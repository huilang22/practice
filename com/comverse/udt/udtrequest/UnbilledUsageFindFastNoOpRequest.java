/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageFindFastNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a UnbilledUsageFindFastNoOpRequest Udt Request/Response
 *
 */
public class UnbilledUsageFindFastNoOpRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a   UnbilledUsageFindFastNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnbilledUsageFindFastNoOpRequest(String id, UnbilledUsageObjectDataList noOpIn) {
    super(id, "UnbilledUsageFindFastNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UnbilledUsageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnbilledUsage", noOpIn);
      }
      addInput("UnbilledUsage", mapList);
    }
  }
/**
 *
 * Retrieves the UnbilledUsageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UnbilledUsageObjectDataList getOutput() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
}
