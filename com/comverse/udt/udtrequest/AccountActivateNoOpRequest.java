/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountActivateNoOpRequest.java
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
 * NoOp class used to simulate a AccountActivateNoOpRequest Udt Request/Response
 *
 */
public class AccountActivateNoOpRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a   AccountActivateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountActivateNoOpRequest(String id, AccountXIDObjectData noOpIn) {
    super(id, "AccountActivateNoOpRequest");
    if (noOpIn != null) {
      addInput("Account", AccountXIDObjectHelper.toMap(noOpIn, new HashMap(), "Account").get("Account"));
    }
  }
/**
 *
 * Retrieves the AccountXIDObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountXIDObjectData getOutput() {
    return AccountXIDObjectHelper.fromMap(outputMap, "Account");
  }
}
