/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryUpdateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a AccountCategoryUpdateNoOpRequest Udt Request/Response
 *
 */
public class AccountCategoryUpdateNoOpRequest extends AccountCategorySubRequestParent {
/**
 *
 * Constructor to create a   AccountCategoryUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountCategoryUpdateNoOpRequest(String id, ACObjectData noOpIn) {
    super(id, "AccountCategoryUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountCategory", ACObjectHelper.toMap(noOpIn, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }
/**
 *
 * Retrieves the ACObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ACObjectData getOutput() {
    return ACObjectHelper.fromMap(outputMap, "AccountCategory");
  }
}
