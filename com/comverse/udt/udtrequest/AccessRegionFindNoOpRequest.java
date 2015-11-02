/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccessRegionFindNoOpRequest.java
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
 * NoOp class used to simulate a AccessRegionFindNoOpRequest Udt Request/Response
 *
 */
public class AccessRegionFindNoOpRequest extends AccessRegionRequest {
/**
 *
 * Constructor to create a   AccessRegionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccessRegionFindNoOpRequest(String id, AccessRegionObjectDataList noOpIn) {
    super(id, "AccessRegionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AccessRegionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccessRegion", noOpIn);
      }
      addInput("AccessRegion", mapList);
    }
  }
/**
 *
 * Retrieves the AccessRegionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AccessRegionObjectDataList getOutput() {
    return AccessRegionObjectHelper.fromMapList(outputMap, "AccessRegionList");
  }
}
