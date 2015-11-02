/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupUpdateNoOpRequest.java
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
 * NoOp class used to simulate a AccountCodeGroupUpdateNoOpRequest Udt Request/Response
 *
 */
public class AccountCodeGroupUpdateNoOpRequest extends AccountCodeGroupSubRequestParent {
/**
 *
 * Constructor to create a   AccountCodeGroupUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountCodeGroupUpdateNoOpRequest(String id, AccountCodeGroupObjectData noOpIn) {
    super(id, "AccountCodeGroupUpdateNoOpRequest");
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
