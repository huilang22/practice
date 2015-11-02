/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryDeleteRequest.java
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
 * Class used to create a AccountCategoryDeleteRequest Udt Request
 *
 */

public class AccountCategoryDeleteRequest extends AccountCategorySubRequestParent {
/**
 *
 * Constructor to create a  AccountCategoryDeleteRequest
 * @param id Unique request name
 * @param ACDeleteIn ACObjectKeyData for AccountCategoryDeleteRequest
 *
 */
@JsonCreator
  public AccountCategoryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCategory")ACObjectKeyData ACDeleteIn) {
    super(id, "AccountCategoryDelete");
    if (ACDeleteIn != null) {
      addInput("AccountCategory", ACObjectKeyHelper.toMap(ACDeleteIn, new HashMap(), "ACObjectKeyData").get("ACObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ACObjectData that results from the AccountCategoryDeleteRequest call
 * @return ACObjectData resulting from udt call
 *
 */

  public ACObjectData getOutput() {
    return ACObjectHelper.fromMap(outputMap, "AccountCategory");
  }
}
