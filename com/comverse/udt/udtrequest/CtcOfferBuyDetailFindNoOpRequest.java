/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferBuyDetailFindNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferBuyDetailFindNoOpRequest extends CtcOfferBuyRequest {
/**
 *
 * Constructor to create a   CtcOfferBuyDetailFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferBuyDetailFindNoOpRequest(String id, CtcOfferBuyDetailObjectDataList noOpIn) {
    super(id, "CtcOfferBuyDetailFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcOfferBuyDetailObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOfferBuy", noOpIn);
      }
      addInput("CtcOfferBuy", mapList);
    }
  }
/**
 *
 * Retrieves the CtcOfferBuyDetailObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyDetailObjectDataList getOutput() {
    return CtcOfferBuyDetailObjectHelper.fromMapList(outputMap, "CtcOfferBuyList");
  }
}
