/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractUnitCreditCreateNoOpRequest.java
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
 * NoOp class used to simulate a ContractUnitCreditCreateNoOpRequest Udt Request/Response
 *
 */
public class ContractUnitCreditCreateNoOpRequest extends ContractUnitCreditSubRequestParent {
/**
 *
 * Constructor to create a   ContractUnitCreditCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContractUnitCreditCreateNoOpRequest(String id, ContractUnitCreditObjectData noOpIn) {
    super(id, "ContractUnitCreditCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(noOpIn, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }
/**
 *
 * Retrieves the ContractUnitCreditObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ContractUnitCreditObjectData getOutput() {
    return ContractUnitCreditObjectHelper.fromMap(outputMap, "ContractUnitCredit");
  }
}
