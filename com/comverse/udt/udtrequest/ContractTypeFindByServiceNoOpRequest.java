/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeFindByServiceNoOpRequest.java
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
 * NoOp class used to simulate a ContractTypeFindByServiceNoOpRequest Udt Request/Response
 *
 */
public class ContractTypeFindByServiceNoOpRequest extends ContractTypeRequest {
/**
 *
 * Constructor to create a   ContractTypeFindByServiceNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContractTypeFindByServiceNoOpRequest(String id, ContractTypeObjectDataList noOpIn) {
    super(id, "ContractTypeFindByServiceNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ContractTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ContractType", noOpIn);
      }
      addInput("ContractType", mapList);
    }
  }
/**
 *
 * Retrieves the ContractTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ContractTypeObjectDataList getOutput() {
    return ContractTypeObjectHelper.fromMapList(outputMap, "ContractTypeList");
  }
}
