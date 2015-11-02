/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeFindByAccountNoOpRequest.java
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
 * NoOp class used to simulate a ContractTypeFindByAccountNoOpRequest Udt Request/Response
 *
 */
public class ContractTypeFindByAccountNoOpRequest extends ContractTypeRequest {
/**
 *
 * Constructor to create a   ContractTypeFindByAccountNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContractTypeFindByAccountNoOpRequest(String id, ContractTypeObjectDataList noOpIn) {
    super(id, "ContractTypeFindByAccountNoOpRequest");
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
