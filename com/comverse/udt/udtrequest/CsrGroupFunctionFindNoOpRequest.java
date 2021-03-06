/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a CsrGroupFunctionFindNoOpRequest Udt Request/Response
 *
 */
public class CsrGroupFunctionFindNoOpRequest extends CsrGroupFunctionRequest {
/**
 *
 * Constructor to create a   CsrGroupFunctionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CsrGroupFunctionFindNoOpRequest(String id, CsrGroupFunctionObjectDataList noOpIn) {
    super(id, "CsrGroupFunctionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CsrGroupFunctionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CsrGroupFunction", noOpIn);
      }
      addInput("CsrGroupFunction", mapList);
    }
  }
/**
 *
 * Retrieves the CsrGroupFunctionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CsrGroupFunctionObjectDataList getOutput() {
    return CsrGroupFunctionObjectHelper.fromMapList(outputMap, "CsrGroupFunctionList");
  }
}
