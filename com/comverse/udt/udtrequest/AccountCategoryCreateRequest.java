/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryCreateRequest.java
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
 * Class used to create a AccountCategoryCreateRequest Udt Request
 *
 */

public class AccountCategoryCreateRequest extends AccountCategorySubRequestParent {
/**
 *
 * Constructor to create a  AccountCategoryCreateRequest
 * @param id Unique request name
 * @param ACCreateIn ACObjectData for AccountCategoryCreateRequest
 *
 */
@JsonCreator
  public AccountCategoryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCategory")ACObjectData ACCreateIn) {
    super(id, "AccountCategoryCreate");
    if (ACCreateIn != null) {
      addInput("AccountCategory", ACObjectHelper.toMap(ACCreateIn, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }

/**
 *
 * Retrieves the ACObjectData that results from the AccountCategoryCreateRequest call
 * @return ACObjectData resulting from udt call
 *
 */

  public ACObjectData getOutput() {
    return ACObjectHelper.fromMap(outputMap, "AccountCategory");
  }
}
