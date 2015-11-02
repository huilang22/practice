/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a TaxStatusFindNoOpRequest Udt Request/Response
 *
 */
public class TaxStatusFindNoOpRequest extends TaxStatusRequest {
/**
 *
 * Constructor to create a   TaxStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxStatusFindNoOpRequest(String id, TSObjectDataList noOpIn) {
    super(id, "TaxStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TSObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxStatus", noOpIn);
      }
      addInput("TaxStatus", mapList);
    }
  }
/**
 *
 * Retrieves the TSObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TSObjectDataList getOutput() {
    return TSObjectHelper.fromMapList(outputMap, "TaxStatusList");
  }
}
