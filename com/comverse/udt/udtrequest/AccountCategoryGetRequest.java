/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryGetRequest.java
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
 * Class used to create a AccountCategoryGetRequest Udt Request
 *
 */

public class AccountCategoryGetRequest extends AccountCategorySubRequestParent {
/**
 *
 * Constructor to create a  AccountCategoryGetRequest
 * @param id Unique request name
 * @param ACGetIn ACObjectKeyData for AccountCategoryGetRequest
 *
 */
@JsonCreator
  public AccountCategoryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCategory")ACObjectKeyData ACGetIn) {
    super(id, "AccountCategoryGet");
    if (ACGetIn != null) {
      addInput("AccountCategory", ACObjectKeyHelper.toMap(ACGetIn, new HashMap(), "ACObjectKeyData").get("ACObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ACObjectData that results from the AccountCategoryGetRequest call
 * @return ACObjectData resulting from udt call
 *
 */

  public ACObjectData getOutput() {
    return ACObjectHelper.fromMap(outputMap, "AccountCategory");
  }
}
