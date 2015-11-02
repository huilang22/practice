/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryNonCancelledFindNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OppvDeliveryNonCancelledFindNoOpRequest Udt Request/Response
 *
 */
public class OppvDeliveryNonCancelledFindNoOpRequest extends OppvDeliveryRequest {
/**
 *
 * Constructor to create a   OppvDeliveryNonCancelledFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OppvDeliveryNonCancelledFindNoOpRequest(String id, OppvOrderItemObjDataList noOpIn) {
    super(id, "OppvDeliveryNonCancelledFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = OppvOrderItemObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OppvDelivery", noOpIn);
      }
      addInput("OppvDelivery", mapList);
    }
  }
/**
 *
 * Retrieves the OppvOrderItemObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public OppvOrderItemObjDataList getOutput() {
    return OppvOrderItemObjHelper.fromMapList(outputMap, "OppvDeliveryList");
  }
}
