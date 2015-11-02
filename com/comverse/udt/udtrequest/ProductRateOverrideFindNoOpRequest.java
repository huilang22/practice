/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideFindNoOpRequest.java
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
 * NoOp class used to simulate a ProductRateOverrideFindNoOpRequest Udt Request/Response
 *
 */
public class ProductRateOverrideFindNoOpRequest extends ProductRateOverrideRequest {
/**
 *
 * Constructor to create a   ProductRateOverrideFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductRateOverrideFindNoOpRequest(String id, ProductRateOverrideObjectDataList noOpIn) {
    super(id, "ProductRateOverrideFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProductRateOverrideObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductRateOverride", noOpIn);
      }
      addInput("ProductRateOverride", mapList);
    }
  }
/**
 *
 * Retrieves the ProductRateOverrideObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProductRateOverrideObjectDataList getOutput() {
    return ProductRateOverrideObjectHelper.fromMapList(outputMap, "ProductRateOverrideList");
  }
}
