/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardFindNoOpRequest.java
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
 * NoOp class used to simulate a CreditCardFindNoOpRequest Udt Request/Response
 *
 */
public class CreditCardFindNoOpRequest extends CreditCardRequest {
/**
 *
 * Constructor to create a   CreditCardFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CreditCardFindNoOpRequest(String id, CreditCardObjectDataList noOpIn) {
    super(id, "CreditCardFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CreditCardObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CreditCard", noOpIn);
      }
      addInput("CreditCard", mapList);
    }
  }
/**
 *
 * Retrieves the CreditCardObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CreditCardObjectDataList getOutput() {
    return CreditCardObjectHelper.fromMapList(outputMap, "CreditCardList");
  }
}
