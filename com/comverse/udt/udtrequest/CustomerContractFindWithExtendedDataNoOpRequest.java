/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractFindWithExtendedDataNoOpRequest.java
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
 * NoOp class used to simulate a CustomerContractFindWithExtendedDataNoOpRequest Udt Request/Response
 *
 */
public class CustomerContractFindWithExtendedDataNoOpRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a   CustomerContractFindWithExtendedDataNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerContractFindWithExtendedDataNoOpRequest(String id, CustomerContractObjectDataList noOpIn) {
    super(id, "CustomerContractFindWithExtendedDataNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CustomerContractObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerContract", noOpIn);
      }
      addInput("CustomerContract", mapList);
    }
  }
/**
 *
 * Retrieves the CustomerContractObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerContractObjectDataList getOutput() {
    return CustomerContractObjectHelper.fromMapList(outputMap, "CustomerContractList");
  }
}
