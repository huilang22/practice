/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementFindNoOpRequest.java
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
 * NoOp class used to simulate a ProductElementFindNoOpRequest Udt Request/Response
 *
 */
public class ProductElementFindNoOpRequest extends ProductElementRequest {
/**
 *
 * Constructor to create a   ProductElementFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductElementFindNoOpRequest(String id, ProductElementObjectDataList noOpIn) {
    super(id, "ProductElementFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProductElementObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductElement", noOpIn);
      }
      addInput("ProductElement", mapList);
    }
  }
/**
 *
 * Retrieves the ProductElementObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProductElementObjectDataList getOutput() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
}
