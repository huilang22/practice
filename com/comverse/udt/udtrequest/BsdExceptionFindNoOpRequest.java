/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionFindNoOpRequest.java
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

import com.csgsystems.sfq.data.*;

/**
 *
 * NoOp class used to simulate a BsdExceptionFindNoOpRequest Udt Request/Response
 *
 */
public class BsdExceptionFindNoOpRequest extends BsdExceptionRequest {
/**
 *
 * Constructor to create a   BsdExceptionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdExceptionFindNoOpRequest(String id, BsdExceptionObjectDataList noOpIn) {
    super(id, "BsdExceptionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdExceptionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdException", noOpIn);
      }
      addInput("BsdException", mapList);
    }
  }
/**
 *
 * Retrieves the BsdExceptionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdExceptionObjectDataList getOutput() {
    return BsdExceptionObjectHelper.fromMapList(outputMap, "BsdExceptionList");
  }
}
