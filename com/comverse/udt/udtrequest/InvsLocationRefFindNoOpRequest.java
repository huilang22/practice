/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationRefFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationRefFindNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationRefFindNoOpRequest extends InvsLocationRefRequest {
/**
 *
 * Constructor to create a   InvsLocationRefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationRefFindNoOpRequest(String id, InvsLocationRefObjectDataList noOpIn) {
    super(id, "InvsLocationRefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsLocationRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocationRef", noOpIn);
      }
      addInput("InvsLocationRef", mapList);
    }
  }
/**
 *
 * Retrieves the InvsLocationRefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationRefObjectDataList getOutput() {
    return InvsLocationRefObjectHelper.fromMapList(outputMap, "InvsLocationRefList");
  }
}
