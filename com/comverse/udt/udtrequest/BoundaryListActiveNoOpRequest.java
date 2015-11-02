/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BoundaryListActiveNoOpRequest.java
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

import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a BoundaryListActiveNoOpRequest Udt Request/Response
 *
 */
public class BoundaryListActiveNoOpRequest extends BoundaryRequest {
/**
 *
 * Constructor to create a   BoundaryListActiveNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BoundaryListActiveNoOpRequest(String id, BoundaryObjectDataList noOpIn) {
    super(id, "BoundaryListActiveNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BoundaryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Boundary", noOpIn);
      }
      addInput("Boundary", mapList);
    }
  }
/**
 *
 * Retrieves the BoundaryObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BoundaryObjectDataList getOutput() {
    return BoundaryObjectHelper.fromMapList(outputMap, "BoundaryList");
  }
}
