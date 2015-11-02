/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdObjectFindNoOpRequest Udt Request/Response
 *
 */
public class BsdObjectFindNoOpRequest extends BsdObjectRequest {
/**
 *
 * Constructor to create a   BsdObjectFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdObjectFindNoOpRequest(String id, BsdObjectObjectDataList noOpIn) {
    super(id, "BsdObjectFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdObjectObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdObject", noOpIn);
      }
      addInput("BsdObject", mapList);
    }
  }
/**
 *
 * Retrieves the BsdObjectObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectObjectDataList getOutput() {
    return BsdObjectObjectHelper.fromMapList(outputMap, "BsdObjectList");
  }
}
