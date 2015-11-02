/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapFindNoOpRequest.java
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
 * NoOp class used to simulate a HqgroupUsageRedirectMapFindNoOpRequest Udt Request/Response
 *
 */
public class HqgroupUsageRedirectMapFindNoOpRequest extends HqgroupUsageRedirectMapRequest {
/**
 *
 * Constructor to create a   HqgroupUsageRedirectMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqgroupUsageRedirectMapFindNoOpRequest(String id, HqGroupUsageRedirectMapObjectDataList noOpIn) {
    super(id, "HqgroupUsageRedirectMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = HqGroupUsageRedirectMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqgroupUsageRedirectMap", noOpIn);
      }
      addInput("HqgroupUsageRedirectMap", mapList);
    }
  }
/**
 *
 * Retrieves the HqGroupUsageRedirectMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupUsageRedirectMapObjectDataList getOutput() {
    return HqGroupUsageRedirectMapObjectHelper.fromMapList(outputMap, "HqgroupUsageRedirectMapList");
  }
}
