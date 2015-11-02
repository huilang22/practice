/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcProductFindNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a SvcProductFindNoOpRequest Udt Request/Response
 *
 */
public class SvcProductFindNoOpRequest extends SvcProductRequest {
/**
 *
 * Constructor to create a   SvcProductFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SvcProductFindNoOpRequest(String id, SvcProductObjectDataList noOpIn) {
    super(id, "SvcProductFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SvcProductObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcProduct", noOpIn);
      }
      addInput("SvcProduct", mapList);
    }
  }
/**
 *
 * Retrieves the SvcProductObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SvcProductObjectDataList getOutput() {
    return SvcProductObjectHelper.fromMapList(outputMap, "SvcProductList");
  }
}
