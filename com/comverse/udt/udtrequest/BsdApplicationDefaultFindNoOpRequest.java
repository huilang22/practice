/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultFindNoOpRequest.java
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

import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdApplicationDefaultFindNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationDefaultFindNoOpRequest extends BsdApplicationDefaultRequest {
/**
 *
 * Constructor to create a   BsdApplicationDefaultFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationDefaultFindNoOpRequest(String id, BsdApplicationDefaultObjectDataList noOpIn) {
    super(id, "BsdApplicationDefaultFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdApplicationDefaultObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationDefault", noOpIn);
      }
      addInput("BsdApplicationDefault", mapList);
    }
  }
/**
 *
 * Retrieves the BsdApplicationDefaultObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationDefaultObjectDataList getOutput() {
    return BsdApplicationDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationDefaultList");
  }
}
