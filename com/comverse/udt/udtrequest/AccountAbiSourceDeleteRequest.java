/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceDeleteRequest.java
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
 * Class used to create a AccountAbiSourceDeleteRequest Udt Request
 *
 */

public class AccountAbiSourceDeleteRequest extends AccountAbiSourceSubRequestParent {
/**
 *
 * Constructor to create a  AccountAbiSourceDeleteRequest
 * @param id Unique request name
 * @param ABIdelIn AccountAbiSourceObjectKeyData for AccountAbiSourceDeleteRequest
 * @param inactive_date Date for AccountAbiSourceDeleteRequest
 *
 */
@JsonCreator
  public AccountAbiSourceDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountAbiSource")AccountAbiSourceObjectKeyData ABIdelIn, @JsonProperty("InactiveDate")Date inactive_date) {
    super(id, "AccountAbiSourceDelete");
    if (ABIdelIn != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectKeyHelper.toMap(ABIdelIn, new HashMap(), "AccountAbiSourceObjectKeyData").get("AccountAbiSourceObjectKeyData"));
    }
    if (inactive_date != null) {
      addInput("InactiveDate", inactive_date);
    }
  }

/**
 *
 * Retrieves the AccountAbiSourceObjectData that results from the AccountAbiSourceDeleteRequest call
 * @return AccountAbiSourceObjectData resulting from udt call
 *
 */

  public AccountAbiSourceObjectData getOutput() {
    return AccountAbiSourceObjectHelper.fromMap(outputMap, "AccountAbiSource");
  }
}
