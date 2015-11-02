/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeValidateCreateNoOpRequest.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ContractTypeValidateCreateNoOpRequest Udt Request/Response
 *
 */
public class ContractTypeValidateCreateNoOpRequest extends ContractTypeValidateSubRequestParent {
/**
 *
 * Constructor to create a   ContractTypeValidateCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContractTypeValidateCreateNoOpRequest(String id, ContractTypeObjectData noOpIn) {
    super(id, "ContractTypeValidateCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ContractTypeValidate", ContractTypeObjectHelper.toMap(noOpIn, new HashMap(), "ContractTypeValidate").get("ContractTypeValidate"));
    }
  }
/**
 *
 * Retrieves the ContractTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ContractTypeObjectData getOutput() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractTypeValidate");
  }
}
