/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdCreateNoOpRequest.java
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
 * NoOp class used to simulate a AccountIdCreateNoOpRequest Udt Request/Response
 *
 */
public class AccountIdCreateNoOpRequest extends AccountIdSubRequestParent {
/**
 *
 * Constructor to create a   AccountIdCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountIdCreateNoOpRequest(String id, AccountIdObjectData noOpIn) {
    super(id, "AccountIdCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountId", AccountIdObjectHelper.toMap(noOpIn, new HashMap(), "AccountId").get("AccountId"));
    }
  }
/**
 *
 * Retrieves the AccountIdObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountIdObjectData getOutput() {
    return AccountIdObjectHelper.fromMap(outputMap, "AccountId");
  }
}
