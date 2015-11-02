/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountStatusGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountStatusGetNoOpRequest Udt Request/Response
 *
 */
public class AccountStatusGetNoOpRequest extends AccountStatusSubRequestParent {
/**
 *
 * Constructor to create a   AccountStatusGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountStatusGetNoOpRequest(String id, AccountStatusObjectData noOpIn) {
    super(id, "AccountStatusGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountStatus", AccountStatusObjectHelper.toMap(noOpIn, new HashMap(), "AccountStatus").get("AccountStatus"));
    }
  }
/**
 *
 * Retrieves the AccountStatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountStatusObjectData getOutput() {
    return AccountStatusObjectHelper.fromMap(outputMap, "AccountStatus");
  }
}
