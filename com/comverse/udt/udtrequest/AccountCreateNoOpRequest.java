/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCreateNoOpRequest.java
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
 * NoOp class used to simulate a AccountCreateNoOpRequest Udt Request/Response
 *
 */
public class AccountCreateNoOpRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a   AccountCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountCreateNoOpRequest(String id, AccountCreateOutputData noOpIn) {
    super(id, "AccountCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountCreateOutputData", AccountCreateOutputHelper.toMap(noOpIn).get("AccountCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the AccountCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCreateOutputData getOutput() {
    return AccountCreateOutputHelper.fromMap(outputMap);
  }
}
