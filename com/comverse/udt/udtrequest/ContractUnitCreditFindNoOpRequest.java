/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractUnitCreditFindNoOpRequest.java
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
 * NoOp class used to simulate a ContractUnitCreditFindNoOpRequest Udt Request/Response
 *
 */
public class ContractUnitCreditFindNoOpRequest extends ContractUnitCreditRequest {
/**
 *
 * Constructor to create a   ContractUnitCreditFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContractUnitCreditFindNoOpRequest(String id, ContractUnitCreditObjectDataList noOpIn) {
    super(id, "ContractUnitCreditFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ContractUnitCreditObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ContractUnitCredit", noOpIn);
      }
      addInput("ContractUnitCredit", mapList);
    }
  }
/**
 *
 * Retrieves the ContractUnitCreditObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ContractUnitCreditObjectDataList getOutput() {
    return ContractUnitCreditObjectHelper.fromMapList(outputMap, "ContractUnitCreditList");
  }
}
