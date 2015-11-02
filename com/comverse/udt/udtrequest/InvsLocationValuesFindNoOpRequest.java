/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationValuesFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationValuesFindNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationValuesFindNoOpRequest extends InvsLocationValuesRequest {
/**
 *
 * Constructor to create a   InvsLocationValuesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationValuesFindNoOpRequest(String id, InvsLocationValuesObjectDataList noOpIn) {
    super(id, "InvsLocationValuesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsLocationValuesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocationValues", noOpIn);
      }
      addInput("InvsLocationValues", mapList);
    }
  }
/**
 *
 * Retrieves the InvsLocationValuesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationValuesObjectDataList getOutput() {
    return InvsLocationValuesObjectHelper.fromMapList(outputMap, "InvsLocationValuesList");
  }
}
