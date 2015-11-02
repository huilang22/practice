/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a ProductExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class ProductExtendedDataFindNoOpRequest extends ProductRequest {
/**
 *
 * Constructor to create a   ProductExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductExtendedDataFindNoOpRequest(String id, ProductEDObjectDataList noOpIn) {
    super(id, "ProductExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProductEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductExtendedData", noOpIn);
      }
      addInput("ProductExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the ProductEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProductEDObjectDataList getOutput() {
    return ProductEDObjectHelper.fromMapList(outputMap, "ProductExtendedDataList");
  }
}
