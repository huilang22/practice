/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineRefFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsLineRefFindNoOpRequest Udt Request/Response
 *
 */
public class InvsLineRefFindNoOpRequest extends InvsLineRefRequest {
/**
 *
 * Constructor to create a   InvsLineRefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLineRefFindNoOpRequest(String id, InvsLineRefObjectDataList noOpIn) {
    super(id, "InvsLineRefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsLineRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLineRef", noOpIn);
      }
      addInput("InvsLineRef", mapList);
    }
  }
/**
 *
 * Retrieves the InvsLineRefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLineRefObjectDataList getOutput() {
    return InvsLineRefObjectHelper.fromMapList(outputMap, "InvsLineRefList");
  }
}
