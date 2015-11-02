/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractCreateNoOpRequest.java
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
 * NoOp class used to simulate a AccountHqContractCreateNoOpRequest Udt Request/Response
 *
 */
public class AccountHqContractCreateNoOpRequest extends AccountHqContractSubRequestParent {
/**
 *
 * Constructor to create a   AccountHqContractCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountHqContractCreateNoOpRequest(String id, AccountHqContractObjectData noOpIn) {
    super(id, "AccountHqContractCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(noOpIn, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }
/**
 *
 * Retrieves the AccountHqContractObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountHqContractObjectData getOutput() {
    return AccountHqContractObjectHelper.fromMap(outputMap, "AccountHqContract");
  }
}
