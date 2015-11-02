/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageFindNoOpRequest.java
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
 * NoOp class used to simulate a ProductPackageFindNoOpRequest Udt Request/Response
 *
 */
public class ProductPackageFindNoOpRequest extends ProductPackageRequest {
/**
 *
 * Constructor to create a   ProductPackageFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductPackageFindNoOpRequest(String id, ProductPackageObjectDataList noOpIn) {
    super(id, "ProductPackageFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProductPackageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductPackage", noOpIn);
      }
      addInput("ProductPackage", mapList);
    }
  }
/**
 *
 * Retrieves the ProductPackageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProductPackageObjectDataList getOutput() {
    return ProductPackageObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
}
