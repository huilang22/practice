/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LbxPaymentTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a LbxPaymentTypeFindNoOpRequest Udt Request/Response
 *
 */
public class LbxPaymentTypeFindNoOpRequest extends LbxPaymentTypeRequest {
/**
 *
 * Constructor to create a   LbxPaymentTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LbxPaymentTypeFindNoOpRequest(String id, LbxPaymentTypeObjectDataList noOpIn) {
    super(id, "LbxPaymentTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = LbxPaymentTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LbxPaymentType", noOpIn);
      }
      addInput("LbxPaymentType", mapList);
    }
  }
/**
 *
 * Retrieves the LbxPaymentTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public LbxPaymentTypeObjectDataList getOutput() {
    return LbxPaymentTypeObjectHelper.fromMapList(outputMap, "LbxPaymentTypeList");
  }
}
