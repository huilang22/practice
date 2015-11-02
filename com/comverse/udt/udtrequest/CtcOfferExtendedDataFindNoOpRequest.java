/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcOfferExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class CtcOfferExtendedDataFindNoOpRequest extends CtcOfferExtendedDataRequest {
/**
 *
 * Constructor to create a   CtcOfferExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcOfferExtendedDataFindNoOpRequest(String id, CtcOfferExtendedDataObjectDataList noOpIn) {
    super(id, "CtcOfferExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcOfferExtendedDataObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOfferExtendedData", noOpIn);
      }
      addInput("CtcOfferExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the CtcOfferExtendedDataObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferExtendedDataObjectDataList getOutput() {
    return CtcOfferExtendedDataObjectHelper.fromMapList(outputMap, "CtcOfferExtendedDataList");
  }
}
