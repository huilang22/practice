/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsHlrFindNoOpRequest Udt Request/Response
 *
 */
public class InvsHlrFindNoOpRequest extends InvsHlrRequest {
/**
 *
 * Constructor to create a   InvsHlrFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsHlrFindNoOpRequest(String id, InvsHlrObjectDataList noOpIn) {
    super(id, "InvsHlrFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsHlrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsHlr", noOpIn);
      }
      addInput("InvsHlr", mapList);
    }
  }
/**
 *
 * Retrieves the InvsHlrObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsHlrObjectDataList getOutput() {
    return InvsHlrObjectHelper.fromMapList(outputMap, "InvsHlrList");
  }
}
