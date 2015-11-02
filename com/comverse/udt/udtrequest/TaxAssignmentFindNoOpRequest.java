/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAssignmentFindNoOpRequest.java
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
 * NoOp class used to simulate a TaxAssignmentFindNoOpRequest Udt Request/Response
 *
 */
public class TaxAssignmentFindNoOpRequest extends TaxAssignmentRequest {
/**
 *
 * Constructor to create a   TaxAssignmentFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxAssignmentFindNoOpRequest(String id, TaxAssignmentObjectDataList noOpIn) {
    super(id, "TaxAssignmentFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TaxAssignmentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxAssignment", noOpIn);
      }
      addInput("TaxAssignment", mapList);
    }
  }
/**
 *
 * Retrieves the TaxAssignmentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TaxAssignmentObjectDataList getOutput() {
    return TaxAssignmentObjectHelper.fromMapList(outputMap, "TaxAssignmentList");
  }
}
