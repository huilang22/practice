/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTaxFindNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentTaxFindNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentTaxFindNoOpRequest extends AdjustmentTaxRequest {
/**
 *
 * Constructor to create a   AdjustmentTaxFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentTaxFindNoOpRequest(String id, AdjustmentTaxObjectDataList noOpIn) {
    super(id, "AdjustmentTaxFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AdjustmentTaxObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdjustmentTax", noOpIn);
      }
      addInput("AdjustmentTax", mapList);
    }
  }
/**
 *
 * Retrieves the AdjustmentTaxObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTaxObjectDataList getOutput() {
    return AdjustmentTaxObjectHelper.fromMapList(outputMap, "AdjustmentTaxList");
  }
}
