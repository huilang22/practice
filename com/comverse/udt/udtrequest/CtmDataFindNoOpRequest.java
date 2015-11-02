/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataFindNoOpRequest.java
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
 * NoOp class used to simulate a CtmDataFindNoOpRequest Udt Request/Response
 *
 */
public class CtmDataFindNoOpRequest extends CtmDataRequest {
/**
 *
 * Constructor to create a   CtmDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmDataFindNoOpRequest(String id, CtmDataRowDataList noOpIn) {
    super(id, "CtmDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtmDataRowHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtmData", noOpIn);
      }
      addInput("CtmData", mapList);
    }
  }
/**
 *
 * Retrieves the CtmDataRowDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtmDataRowDataList getOutput() {
    return CtmDataRowHelper.fromMapList(outputMap, "CtmDataList");
  }
}
