/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapFindNoOpRequest.java
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
 * NoOp class used to simulate a ProductChargeMapFindNoOpRequest Udt Request/Response
 *
 */
public class ProductChargeMapFindNoOpRequest extends ProductChargeMapRequest {
/**
 *
 * Constructor to create a   ProductChargeMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductChargeMapFindNoOpRequest(String id, ProductChargeMapObjectDataList noOpIn) {
    super(id, "ProductChargeMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProductChargeMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductChargeMap", noOpIn);
      }
      addInput("ProductChargeMap", mapList);
    }
  }
/**
 *
 * Retrieves the ProductChargeMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProductChargeMapObjectDataList getOutput() {
    return ProductChargeMapObjectHelper.fromMapList(outputMap, "ProductChargeMapList");
  }
}
