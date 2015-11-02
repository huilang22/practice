/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ProductLineFindNoOpRequest Udt Request/Response
 *
 */
public class ProductLineFindNoOpRequest extends ProductLineRequest {
/**
 *
 * Constructor to create a   ProductLineFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductLineFindNoOpRequest(String id, ProductLineObjectDataList noOpIn) {
    super(id, "ProductLineFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProductLineObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductLine", noOpIn);
      }
      addInput("ProductLine", mapList);
    }
  }
/**
 *
 * Retrieves the ProductLineObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProductLineObjectDataList getOutput() {
    return ProductLineObjectHelper.fromMapList(outputMap, "ProductLineList");
  }
}
