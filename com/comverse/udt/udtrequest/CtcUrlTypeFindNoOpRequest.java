/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcUrlTypeFindNoOpRequest Udt Request/Response
 *
 */
public class CtcUrlTypeFindNoOpRequest extends CtcUrlTypeRequest {
/**
 *
 * Constructor to create a   CtcUrlTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcUrlTypeFindNoOpRequest(String id, CtcUrlTypeObjectDataList noOpIn) {
    super(id, "CtcUrlTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcUrlTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcUrlType", noOpIn);
      }
      addInput("CtcUrlType", mapList);
    }
  }
/**
 *
 * Retrieves the CtcUrlTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcUrlTypeObjectDataList getOutput() {
    return CtcUrlTypeObjectHelper.fromMapList(outputMap, "CtcUrlTypeList");
  }
}
