/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndFindNoOpRequest.java
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
 * NoOp class used to simulate a InvdReserveEndFindNoOpRequest Udt Request/Response
 *
 */
public class InvdReserveEndFindNoOpRequest extends InvdReserveEndRequest {
/**
 *
 * Constructor to create a   InvdReserveEndFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdReserveEndFindNoOpRequest(String id, InvdReserveEndObjectDataList noOpIn) {
    super(id, "InvdReserveEndFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvdReserveEndObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdReserveEnd", noOpIn);
      }
      addInput("InvdReserveEnd", mapList);
    }
  }
/**
 *
 * Retrieves the InvdReserveEndObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvdReserveEndObjectDataList getOutput() {
    return InvdReserveEndObjectHelper.fromMapList(outputMap, "InvdReserveEndList");
  }
}
