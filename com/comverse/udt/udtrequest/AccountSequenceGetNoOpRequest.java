/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class AccountSequenceGetNoOpRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a   AccountSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountSequenceGetNoOpRequest(String id, AccountObjectKeyData noOpIn) {
    super(id, "AccountSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(noOpIn, new HashMap(), "Account").get("Account"));
    }
  }
/**
 *
 * Retrieves the AccountObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountObjectKeyData getOutput() {
    return AccountObjectKeyHelper.fromMap(outputMap, "Account");
  }
}
