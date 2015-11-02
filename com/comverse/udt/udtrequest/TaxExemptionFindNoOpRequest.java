/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionFindNoOpRequest.java
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
 * NoOp class used to simulate a TaxExemptionFindNoOpRequest Udt Request/Response
 *
 */
public class TaxExemptionFindNoOpRequest extends TaxExemptionRequest {
/**
 *
 * Constructor to create a   TaxExemptionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxExemptionFindNoOpRequest(String id, TaxExemptionObjectDataList noOpIn) {
    super(id, "TaxExemptionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TaxExemptionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxExemption", noOpIn);
      }
      addInput("TaxExemption", mapList);
    }
  }
/**
 *
 * Retrieves the TaxExemptionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TaxExemptionObjectDataList getOutput() {
    return TaxExemptionObjectHelper.fromMapList(outputMap, "TaxExemptionList");
  }
}
