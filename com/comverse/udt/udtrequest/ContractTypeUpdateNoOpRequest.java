/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ContractTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class ContractTypeUpdateNoOpRequest extends ContractTypeSubRequestParent {
/**
 *
 * Constructor to create a   ContractTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContractTypeUpdateNoOpRequest(String id, ContractTypeObjectData noOpIn) {
    super(id, "ContractTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ContractType", ContractTypeObjectHelper.toMap(noOpIn, new HashMap(), "ContractType").get("ContractType"));
    }
  }
/**
 *
 * Retrieves the ContractTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ContractTypeObjectData getOutput() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractType");
  }
}
