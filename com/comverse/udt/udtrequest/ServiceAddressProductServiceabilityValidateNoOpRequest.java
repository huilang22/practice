/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressProductServiceabilityValidateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceAddressProductServiceabilityValidateNoOpRequest Udt Request/Response
 *
 */
public class ServiceAddressProductServiceabilityValidateNoOpRequest extends SvcAddrServiceabilityRequest {
/**
 *
 * Constructor to create a   ServiceAddressProductServiceabilityValidateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAddressProductServiceabilityValidateNoOpRequest(String id, ProductObjectDataList noOpIn) {
    super(id, "ServiceAddressProductServiceabilityValidateNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProductObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Product", noOpIn);
      }
      addInput("Product", mapList);
    }
  }
/**
 *
 * Retrieves the ProductObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProductObjectDataList getOutput() {
    return ProductObjectHelper.fromMapList(outputMap, "ProductList");
  }
}
