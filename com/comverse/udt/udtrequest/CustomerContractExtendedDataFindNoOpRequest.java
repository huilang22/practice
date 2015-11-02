/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a CustomerContractExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class CustomerContractExtendedDataFindNoOpRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a   CustomerContractExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerContractExtendedDataFindNoOpRequest(String id, CustomerContractEDObjectDataList noOpIn) {
    super(id, "CustomerContractExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CustomerContractEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerContractExtendedData", noOpIn);
      }
      addInput("CustomerContractExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the CustomerContractEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerContractEDObjectDataList getOutput() {
    return CustomerContractEDObjectHelper.fromMapList(outputMap, "CustomerContractExtendedDataList");
  }
}
