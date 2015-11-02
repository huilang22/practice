/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountCodeGroupGetNoOpRequest Udt Request/Response
 *
 */
public class AccountCodeGroupGetNoOpRequest extends AccountCodeGroupSubRequestParent {
/**
 *
 * Constructor to create a   AccountCodeGroupGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountCodeGroupGetNoOpRequest(String id, AccountCodeGroupObjectData noOpIn) {
    super(id, "AccountCodeGroupGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(noOpIn, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }
/**
 *
 * Retrieves the AccountCodeGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCodeGroupObjectData getOutput() {
    return AccountCodeGroupObjectHelper.fromMap(outputMap, "AccountCodeGroup");
  }
}
