/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a CtmParamTypeFindNoOpRequest Udt Request/Response
 *
 */
public class CtmParamTypeFindNoOpRequest extends CtmParamTypeRequest {
/**
 *
 * Constructor to create a   CtmParamTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmParamTypeFindNoOpRequest(String id, CtmParamTypeObjectDataList noOpIn) {
    super(id, "CtmParamTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtmParamTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtmParamType", noOpIn);
      }
      addInput("CtmParamType", mapList);
    }
  }
/**
 *
 * Retrieves the CtmParamTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtmParamTypeObjectDataList getOutput() {
    return CtmParamTypeObjectHelper.fromMapList(outputMap, "CtmParamTypeList");
  }
}
