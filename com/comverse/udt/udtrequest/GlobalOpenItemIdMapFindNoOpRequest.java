/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapFindNoOpRequest.java
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
 * NoOp class used to simulate a GlobalOpenItemIdMapFindNoOpRequest Udt Request/Response
 *
 */
public class GlobalOpenItemIdMapFindNoOpRequest extends GlobalOpenItemIdMapRequest {
/**
 *
 * Constructor to create a   GlobalOpenItemIdMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GlobalOpenItemIdMapFindNoOpRequest(String id, GlobalOpenItemIdMapObjectDataList noOpIn) {
    super(id, "GlobalOpenItemIdMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = GlobalOpenItemIdMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GlobalOpenItemIdMap", noOpIn);
      }
      addInput("GlobalOpenItemIdMap", mapList);
    }
  }
/**
 *
 * Retrieves the GlobalOpenItemIdMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalOpenItemIdMapObjectDataList getOutput() {
    return GlobalOpenItemIdMapObjectHelper.fromMapList(outputMap, "GlobalOpenItemIdMapList");
  }
}
