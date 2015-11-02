/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectorFindNoOpRequest.java
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

import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a CollectorFindNoOpRequest Udt Request/Response
 *
 */
public class CollectorFindNoOpRequest extends CollectorRequest {
/**
 *
 * Constructor to create a   CollectorFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CollectorFindNoOpRequest(String id, CollectorObjectDataList noOpIn) {
    super(id, "CollectorFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CollectorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Collector", noOpIn);
      }
      addInput("Collector", mapList);
    }
  }
/**
 *
 * Retrieves the CollectorObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CollectorObjectDataList getOutput() {
    return CollectorObjectHelper.fromMapList(outputMap, "CollectorList");
  }
}
