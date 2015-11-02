/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyFindNoOpRequest.java
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
 * NoOp class used to simulate a ProductRateKeyFindNoOpRequest Udt Request/Response
 *
 */
public class ProductRateKeyFindNoOpRequest extends ProductRateKeyRequest {
/**
 *
 * Constructor to create a   ProductRateKeyFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductRateKeyFindNoOpRequest(String id, ProductRateKeyObjectDataList noOpIn) {
    super(id, "ProductRateKeyFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProductRateKeyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductRateKey", noOpIn);
      }
      addInput("ProductRateKey", mapList);
    }
  }
/**
 *
 * Retrieves the ProductRateKeyObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProductRateKeyObjectDataList getOutput() {
    return ProductRateKeyObjectHelper.fromMapList(outputMap, "ProductRateKeyList");
  }
}
