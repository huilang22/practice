/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupCreateNoOpRequest.java
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
 * NoOp class used to simulate a AccountCodeGroupCreateNoOpRequest Udt Request/Response
 *
 */
public class AccountCodeGroupCreateNoOpRequest extends AccountCodeGroupSubRequestParent {
/**
 *
 * Constructor to create a   AccountCodeGroupCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountCodeGroupCreateNoOpRequest(String id, AccountCodeGroupObjectData noOpIn) {
    super(id, "AccountCodeGroupCreateNoOpRequest");
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
