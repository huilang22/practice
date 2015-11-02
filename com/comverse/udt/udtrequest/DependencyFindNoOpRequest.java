/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DependencyFindNoOpRequest Udt Request/Response
 *
 */
public class DependencyFindNoOpRequest extends DependencyRequest {
/**
 *
 * Constructor to create a   DependencyFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DependencyFindNoOpRequest(String id, DependencyObjectDataList noOpIn) {
    super(id, "DependencyFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DependencyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Dependency", noOpIn);
      }
      addInput("Dependency", mapList);
    }
  }
/**
 *
 * Retrieves the DependencyObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyObjectDataList getOutput() {
    return DependencyObjectHelper.fromMapList(outputMap, "DependencyList");
  }
}
