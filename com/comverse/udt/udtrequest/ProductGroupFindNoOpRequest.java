/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a ProductGroupFindNoOpRequest Udt Request/Response
 *
 */
public class ProductGroupFindNoOpRequest extends ProductGroupRequest {
/**
 *
 * Constructor to create a   ProductGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductGroupFindNoOpRequest(String id, ProductGroupObjectDataList noOpIn) {
    super(id, "ProductGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProductGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductGroup", noOpIn);
      }
      addInput("ProductGroup", mapList);
    }
  }
/**
 *
 * Retrieves the ProductGroupObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProductGroupObjectDataList getOutput() {
    return ProductGroupObjectHelper.fromMapList(outputMap, "ProductGroupList");
  }
}
