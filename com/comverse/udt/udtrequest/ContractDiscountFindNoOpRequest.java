/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractDiscountFindNoOpRequest.java
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
 * NoOp class used to simulate a ContractDiscountFindNoOpRequest Udt Request/Response
 *
 */
public class ContractDiscountFindNoOpRequest extends ContractDiscountRequest {
/**
 *
 * Constructor to create a   ContractDiscountFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContractDiscountFindNoOpRequest(String id, ContractDiscountObjectDataList noOpIn) {
    super(id, "ContractDiscountFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ContractDiscountObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ContractDiscount", noOpIn);
      }
      addInput("ContractDiscount", mapList);
    }
  }
/**
 *
 * Retrieves the ContractDiscountObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ContractDiscountObjectDataList getOutput() {
    return ContractDiscountObjectHelper.fromMapList(outputMap, "ContractDiscountList");
  }
}
