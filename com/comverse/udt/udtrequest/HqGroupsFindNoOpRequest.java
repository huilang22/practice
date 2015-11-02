/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsFindNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupsFindNoOpRequest Udt Request/Response
 *
 */
public class HqGroupsFindNoOpRequest extends HqGroupsRequest {
/**
 *
 * Constructor to create a   HqGroupsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupsFindNoOpRequest(String id, HqGroupsObjectDataList noOpIn) {
    super(id, "HqGroupsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = HqGroupsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroups", noOpIn);
      }
      addInput("HqGroups", mapList);
    }
  }
/**
 *
 * Retrieves the HqGroupsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupsObjectDataList getOutput() {
    return HqGroupsObjectHelper.fromMapList(outputMap, "HqGroupsList");
  }
}
