/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a ContractTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class ContractTypeCreateNoOpRequest extends ContractTypeSubRequestParent {
/**
 *
 * Constructor to create a   ContractTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContractTypeCreateNoOpRequest(String id, ContractTypeObjectData noOpIn) {
    super(id, "ContractTypeCreateNoOpRequest");
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
