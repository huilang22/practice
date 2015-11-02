/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountStatusGetRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AccountStatusGetRequest Udt Request
 *
 */

public class AccountStatusGetRequest extends AccountStatusSubRequestParent {
/**
 *
 * Constructor to create a  AccountStatusGetRequest
 * @param id Unique request name
 * @param AccountStatusgetIn AccountStatusObjectKeyData for AccountStatusGetRequest
 *
 */
@JsonCreator
  public AccountStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountStatus")AccountStatusObjectKeyData AccountStatusgetIn) {
    super(id, "AccountStatusGet");
    if (AccountStatusgetIn != null) {
      addInput("AccountStatus", AccountStatusObjectKeyHelper.toMap(AccountStatusgetIn, new HashMap(), "AccountStatusObjectKeyData").get("AccountStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountStatusObjectData that results from the AccountStatusGetRequest call
 * @return AccountStatusObjectData resulting from udt call
 *
 */

  public AccountStatusObjectData getOutput() {
    return AccountStatusObjectHelper.fromMap(outputMap, "AccountStatus");
  }
}
