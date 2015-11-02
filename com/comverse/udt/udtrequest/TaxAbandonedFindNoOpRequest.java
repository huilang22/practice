/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAbandonedFindNoOpRequest.java
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
 * NoOp class used to simulate a TaxAbandonedFindNoOpRequest Udt Request/Response
 *
 */
public class TaxAbandonedFindNoOpRequest extends TaxAbandonedRequest {
/**
 *
 * Constructor to create a   TaxAbandonedFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxAbandonedFindNoOpRequest(String id, TaxAbandonedObjectDataList noOpIn) {
    super(id, "TaxAbandonedFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TaxAbandonedObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxAbandoned", noOpIn);
      }
      addInput("TaxAbandoned", mapList);
    }
  }
/**
 *
 * Retrieves the TaxAbandonedObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TaxAbandonedObjectDataList getOutput() {
    return TaxAbandonedObjectHelper.fromMapList(outputMap, "TaxAbandonedList");
  }
}
