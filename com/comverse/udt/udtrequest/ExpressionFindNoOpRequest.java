/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExpressionFindNoOpRequest.java
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
 * NoOp class used to simulate a ExpressionFindNoOpRequest Udt Request/Response
 *
 */
public class ExpressionFindNoOpRequest extends ExpressionRequest {
/**
 *
 * Constructor to create a   ExpressionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExpressionFindNoOpRequest(String id, ExprObjDataList noOpIn) {
    super(id, "ExpressionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ExprObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Expression", noOpIn);
      }
      addInput("Expression", mapList);
    }
  }
/**
 *
 * Retrieves the ExprObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ExprObjDataList getOutput() {
    return ExprObjHelper.fromMapList(outputMap, "ExpressionList");
  }
}
