/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsOperatorFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsOperatorFindNoOpRequest Udt Request/Response
 *
 */
public class InvsOperatorFindNoOpRequest extends InvsOperatorRequest {
/**
 *
 * Constructor to create a   InvsOperatorFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsOperatorFindNoOpRequest(String id, InvsOperatorObjectDataList noOpIn) {
    super(id, "InvsOperatorFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsOperatorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsOperator", noOpIn);
      }
      addInput("InvsOperator", mapList);
    }
  }
/**
 *
 * Retrieves the InvsOperatorObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsOperatorObjectDataList getOutput() {
    return InvsOperatorObjectHelper.fromMapList(outputMap, "InvsOperatorList");
  }
}
