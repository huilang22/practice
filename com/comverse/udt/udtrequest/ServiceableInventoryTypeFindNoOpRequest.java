/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableInventoryTypeFindNoOpRequest.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a ServiceableInventoryTypeFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceableInventoryTypeFindNoOpRequest extends ServiceableInventoryTypeRequest {
/**
 *
 * Constructor to create a   ServiceableInventoryTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceableInventoryTypeFindNoOpRequest(String id, InvsTypeObjectDataList noOpIn) {
    super(id, "ServiceableInventoryTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsType", noOpIn);
      }
      addInput("InvsType", mapList);
    }
  }
/**
 *
 * Retrieves the InvsTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeObjectDataList getOutput() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
}
