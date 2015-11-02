/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractDeleteListNoOpRequest.java
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
 * NoOp class used to simulate a CustomerContractDeleteListNoOpRequest Udt Request/Response
 *
 */
public class CustomerContractDeleteListNoOpRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a   CustomerContractDeleteListNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerContractDeleteListNoOpRequest(String id, CustomerContractObjectBaseDataList noOpIn) {
    super(id, "CustomerContractDeleteListNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CustomerContractObjectBaseHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerContract", noOpIn);
      }
      addInput("CustomerContract", mapList);
    }
  }
/**
 *
 * Retrieves the CustomerContractObjectBaseDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerContractObjectBaseDataList getOutput() {
    return CustomerContractObjectBaseHelper.fromMapList(outputMap, "CustomerContractList");
  }
}
