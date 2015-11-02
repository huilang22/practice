/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRefFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimCardConfigRefFindNoOpRequest Udt Request/Response
 *
 */
public class InvsSimCardConfigRefFindNoOpRequest extends InvsSimCardConfigRefRequest {
/**
 *
 * Constructor to create a   InvsSimCardConfigRefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimCardConfigRefFindNoOpRequest(String id, InvsSimCardConfigRefObjectDataList noOpIn) {
    super(id, "InvsSimCardConfigRefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsSimCardConfigRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimCardConfigRef", noOpIn);
      }
      addInput("InvsSimCardConfigRef", mapList);
    }
  }
/**
 *
 * Retrieves the InvsSimCardConfigRefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimCardConfigRefObjectDataList getOutput() {
    return InvsSimCardConfigRefObjectHelper.fromMapList(outputMap, "InvsSimCardConfigRefList");
  }
}
