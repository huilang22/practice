/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorFindNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupCorridorFindNoOpRequest Udt Request/Response
 *
 */
public class HqGroupCorridorFindNoOpRequest extends HqGroupCorridorRequest {
/**
 *
 * Constructor to create a   HqGroupCorridorFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupCorridorFindNoOpRequest(String id, HqGroupCorridorObjectDataList noOpIn) {
    super(id, "HqGroupCorridorFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = HqGroupCorridorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroupCorridor", noOpIn);
      }
      addInput("HqGroupCorridor", mapList);
    }
  }
/**
 *
 * Retrieves the HqGroupCorridorObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupCorridorObjectDataList getOutput() {
    return HqGroupCorridorObjectHelper.fromMapList(outputMap, "HqGroupCorridorList");
  }
}
