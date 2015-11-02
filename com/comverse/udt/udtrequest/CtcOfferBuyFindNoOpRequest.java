/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferBuyFindNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferBuyFindNoOpRequest extends CtcOfferBuyRequest {
/**
 *
 * Constructor to create a   CtcOfferBuyFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferBuyFindNoOpRequest(String id, CtcOfferBuyObjectDataList noOpIn) {
    super(id, "CtcOfferBuyFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcOfferBuyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOfferBuy", noOpIn);
      }
      addInput("CtcOfferBuy", mapList);
    }
  }
/**
 *
 * Retrieves the CtcOfferBuyObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferBuyObjectDataList getOutput() {
    return CtcOfferBuyObjectHelper.fromMapList(outputMap, "CtcOfferBuyList");
  }
}
