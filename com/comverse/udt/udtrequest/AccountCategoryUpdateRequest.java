/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AccountCategoryUpdateRequest Udt Request
 *
 */

public class AccountCategoryUpdateRequest extends AccountCategorySubRequestParent {
/**
 *
 * Constructor to create a  AccountCategoryUpdateRequest
 * @param id Unique request name
 * @param ACUpdateIn ACObjectData for AccountCategoryUpdateRequest
 *
 */
@JsonCreator
  public AccountCategoryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCategory")ACObjectData ACUpdateIn) {
    super(id, "AccountCategoryUpdate");
    if (ACUpdateIn != null) {
      addInput("AccountCategory", ACObjectHelper.toMap(ACUpdateIn, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }

/**
 *
 * Retrieves the ACObjectData that results from the AccountCategoryUpdateRequest call
 * @return ACObjectData resulting from udt call
 *
 */

  public ACObjectData getOutput() {
    return ACObjectHelper.fromMap(outputMap, "AccountCategory");
  }
}
