/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimResellerRefFindNoOpRequest Udt Request/Response
 *
 */
public class InvsSimResellerRefFindNoOpRequest extends InvsSimResellerRefRequest {
/**
 *
 * Constructor to create a   InvsSimResellerRefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimResellerRefFindNoOpRequest(String id, InvsSimResellerRefObjectDataList noOpIn) {
    super(id, "InvsSimResellerRefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsSimResellerRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimResellerRef", noOpIn);
      }
      addInput("InvsSimResellerRef", mapList);
    }
  }
/**
 *
 * Retrieves the InvsSimResellerRefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimResellerRefObjectDataList getOutput() {
    return InvsSimResellerRefObjectHelper.fromMapList(outputMap, "InvsSimResellerRefList");
  }
}
