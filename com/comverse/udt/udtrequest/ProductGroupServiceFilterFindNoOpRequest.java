/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupServiceFilterFindNoOpRequest.java
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
 * NoOp class used to simulate a ProductGroupServiceFilterFindNoOpRequest Udt Request/Response
 *
 */
public class ProductGroupServiceFilterFindNoOpRequest extends ProductGroupServiceFilterRequest {
/**
 *
 * Constructor to create a   ProductGroupServiceFilterFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductGroupServiceFilterFindNoOpRequest(String id, PGSFObjectDataList noOpIn) {
    super(id, "ProductGroupServiceFilterFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PGSFObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductGroupServiceFilter", noOpIn);
      }
      addInput("ProductGroupServiceFilter", mapList);
    }
  }
/**
 *
 * Retrieves the PGSFObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PGSFObjectDataList getOutput() {
    return PGSFObjectHelper.fromMapList(outputMap, "ProductGroupServiceFilterList");
  }
}
