/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a ContractTypeGetNoOpRequest Udt Request/Response
 *
 */
public class ContractTypeGetNoOpRequest extends ContractTypeSubRequestParent {
/**
 *
 * Constructor to create a   ContractTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContractTypeGetNoOpRequest(String id, ContractTypeObjectData noOpIn) {
    super(id, "ContractTypeGetNoOpRequest");
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
