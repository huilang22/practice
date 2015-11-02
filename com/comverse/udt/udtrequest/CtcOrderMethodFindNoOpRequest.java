/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodFindNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcOrderMethodFindNoOpRequest Udt Request/Response
 *
 */
public class CtcOrderMethodFindNoOpRequest extends CtcOrderMethodRequest {
/**
 *
 * Constructor to create a   CtcOrderMethodFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOrderMethodFindNoOpRequest(String id, CtcOrderMethodObjectDataList noOpIn) {
    super(id, "CtcOrderMethodFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcOrderMethodObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOrderMethod", noOpIn);
      }
      addInput("CtcOrderMethod", mapList);
    }
  }
/**
 *
 * Retrieves the CtcOrderMethodObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOrderMethodObjectDataList getOutput() {
    return CtcOrderMethodObjectHelper.fromMapList(outputMap, "CtcOrderMethodList");
  }
}
