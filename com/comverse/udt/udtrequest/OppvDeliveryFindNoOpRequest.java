/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryFindNoOpRequest.java
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
 * NoOp class used to simulate a OppvDeliveryFindNoOpRequest Udt Request/Response
 *
 */
public class OppvDeliveryFindNoOpRequest extends OppvDeliveryRequest {
/**
 *
 * Constructor to create a   OppvDeliveryFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OppvDeliveryFindNoOpRequest(String id, OppvDeliveryExtObjDataList noOpIn) {
    super(id, "OppvDeliveryFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = OppvDeliveryExtObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OppvDelivery", noOpIn);
      }
      addInput("OppvDelivery", mapList);
    }
  }
/**
 *
 * Retrieves the OppvDeliveryExtObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public OppvDeliveryExtObjDataList getOutput() {
    return OppvDeliveryExtObjHelper.fromMapList(outputMap, "OppvDeliveryList");
  }
}
