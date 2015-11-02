/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsExtDataMapFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsExtDataMapFindNoOpRequest Udt Request/Response
 *
 */
public class InvsExtDataMapFindNoOpRequest extends InvsExtDataMapRequest {
/**
 *
 * Constructor to create a   InvsExtDataMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsExtDataMapFindNoOpRequest(String id, InvsExtDataMapObjectDataList noOpIn) {
    super(id, "InvsExtDataMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsExtDataMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsExtDataMap", noOpIn);
      }
      addInput("InvsExtDataMap", mapList);
    }
  }
/**
 *
 * Retrieves the InvsExtDataMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsExtDataMapObjectDataList getOutput() {
    return InvsExtDataMapObjectHelper.fromMapList(outputMap, "InvsExtDataMapList");
  }
}
