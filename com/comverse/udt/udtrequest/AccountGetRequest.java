/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountGetRequest.java
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
 * Class used to create a AccountGetRequest Udt Request
 *
 */

public class AccountGetRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a  AccountGetRequest
 * @param id Unique request name
 * @param agIn AccountObjectKeyData for AccountGetRequest
 *
 */
@JsonCreator
  public AccountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectKeyData agIn) {
    super(id, "AccountGet");
    if (agIn != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(agIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountXIDObjectData that results from the AccountGetRequest call
 * @return AccountXIDObjectData resulting from udt call
 *
 */

  public AccountXIDObjectData getOutput() {
    return AccountXIDObjectHelper.fromMap(outputMap, "Account");
  }
}
