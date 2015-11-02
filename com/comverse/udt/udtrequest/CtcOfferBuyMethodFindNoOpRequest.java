/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyMethodFindNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcOfferBuyMethodFindNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferBuyMethodFindNoOpRequest extends CtcOfferBuyMethodRequest {
/**
 *
 * Constructor to create a   CtcOfferBuyMethodFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferBuyMethodFindNoOpRequest(String id, CtcOfferBuyMethodObjectDataList noOpIn) {
    super(id, "CtcOfferBuyMethodFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcOfferBuyMethodObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOfferBuyMethod", noOpIn);
      }
      addInput("CtcOfferBuyMethod", mapList);
    }
  }
/**
 *
 * Retrieves the CtcOfferBuyMethodObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyMethodObjectDataList getOutput() {
    return CtcOfferBuyMethodObjectHelper.fromMapList(outputMap, "CtcOfferBuyMethodList");
  }
}
