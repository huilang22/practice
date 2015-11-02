/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductJurisdictionFindNoOpRequest.java
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
 * NoOp class used to simulate a ProductJurisdictionFindNoOpRequest Udt Request/Response
 *
 */
public class ProductJurisdictionFindNoOpRequest extends ProductJurisdictionRequest {
/**
 *
 * Constructor to create a   ProductJurisdictionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductJurisdictionFindNoOpRequest(String id, ProductJurisdictionObjectDataList noOpIn) {
    super(id, "ProductJurisdictionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProductJurisdictionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductJurisdiction", noOpIn);
      }
      addInput("ProductJurisdiction", mapList);
    }
  }
/**
 *
 * Retrieves the ProductJurisdictionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProductJurisdictionObjectDataList getOutput() {
    return ProductJurisdictionObjectHelper.fromMapList(outputMap, "ProductJurisdictionList");
  }
}
