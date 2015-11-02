/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardTypeCodeFindNoOpRequest.java
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
 * NoOp class used to simulate a CreditCardTypeCodeFindNoOpRequest Udt Request/Response
 *
 */
public class CreditCardTypeCodeFindNoOpRequest extends CreditCardTypeCodeRequest {
/**
 *
 * Constructor to create a   CreditCardTypeCodeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CreditCardTypeCodeFindNoOpRequest(String id, CreditCardTypeCodeObjectDataList noOpIn) {
    super(id, "CreditCardTypeCodeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CreditCardTypeCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CreditCardTypeCode", noOpIn);
      }
      addInput("CreditCardTypeCode", mapList);
    }
  }
/**
 *
 * Retrieves the CreditCardTypeCodeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CreditCardTypeCodeObjectDataList getOutput() {
    return CreditCardTypeCodeObjectHelper.fromMapList(outputMap, "CreditCardTypeCodeList");
  }
}
