/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyRetrieveNoOpRequest.java
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
 * NoOp class used to simulate a DependencyRetrieveNoOpRequest Udt Request/Response
 *
 */
public class DependencyRetrieveNoOpRequest extends DependencyRequest {
/**
 *
 * Constructor to create a   DependencyRetrieveNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DependencyRetrieveNoOpRequest(String id, DependencyObjectDataList noOpIn) {
    super(id, "DependencyRetrieveNoOpRequest");
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
