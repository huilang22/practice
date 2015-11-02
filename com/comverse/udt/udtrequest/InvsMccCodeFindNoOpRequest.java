/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMccCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsMccCodeFindNoOpRequest Udt Request/Response
 *
 */
public class InvsMccCodeFindNoOpRequest extends InvsMccCodeRequest {
/**
 *
 * Constructor to create a   InvsMccCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsMccCodeFindNoOpRequest(String id, InvsMccCodeObjectDataList noOpIn) {
    super(id, "InvsMccCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsMccCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsMccCode", noOpIn);
      }
      addInput("InvsMccCode", mapList);
    }
  }
/**
 *
 * Retrieves the InvsMccCodeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsMccCodeObjectDataList getOutput() {
    return InvsMccCodeObjectHelper.fromMapList(outputMap, "InvsMccCodeList");
  }
}
