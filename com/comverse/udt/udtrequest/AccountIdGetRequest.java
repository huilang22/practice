/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdGetRequest.java
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
 * Class used to create a AccountIdGetRequest Udt Request
 *
 */

public class AccountIdGetRequest extends AccountIdSubRequestParent {
/**
 *
 * Constructor to create a  AccountIdGetRequest
 * @param id Unique request name
 * @param getIn AccountIdObjectKeyData for AccountIdGetRequest
 *
 */
@JsonCreator
  public AccountIdGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountId")AccountIdObjectKeyData getIn) {
    super(id, "AccountIdGet");
    if (getIn != null) {
      addInput("AccountId", AccountIdObjectKeyHelper.toMap(getIn, new HashMap(), "AccountIdObjectKeyData").get("AccountIdObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountIdObjectData that results from the AccountIdGetRequest call
 * @return AccountIdObjectData resulting from udt call
 *
 */

  public AccountIdObjectData getOutput() {
    return AccountIdObjectHelper.fromMap(outputMap, "AccountId");
  }
}
