/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferPpvFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferPpvFindNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferPpvFindNoOpRequest extends CtcOfferRequest {
/**
 *
 * Constructor to create a   CtcOfferPpvFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferPpvFindNoOpRequest(String id, CtcOfferObjectDataList noOpIn) {
    super(id, "CtcOfferPpvFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcOfferObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOffer", noOpIn);
      }
      addInput("CtcOffer", mapList);
    }
  }
/**
 *
 * Retrieves the CtcOfferObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferObjectDataList getOutput() {
    return CtcOfferObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
}
