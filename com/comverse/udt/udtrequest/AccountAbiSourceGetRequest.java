/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceGetRequest.java
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
 * Class used to create a AccountAbiSourceGetRequest Udt Request
 *
 */

public class AccountAbiSourceGetRequest extends AccountAbiSourceSubRequestParent {
/**
 *
 * Constructor to create a  AccountAbiSourceGetRequest
 * @param id Unique request name
 * @param ABIgetIn AccountAbiSourceObjectKeyData for AccountAbiSourceGetRequest
 *
 */
@JsonCreator
  public AccountAbiSourceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountAbiSource")AccountAbiSourceObjectKeyData ABIgetIn) {
    super(id, "AccountAbiSourceGet");
    if (ABIgetIn != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectKeyHelper.toMap(ABIgetIn, new HashMap(), "AccountAbiSourceObjectKeyData").get("AccountAbiSourceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountAbiSourceObjectData that results from the AccountAbiSourceGetRequest call
 * @return AccountAbiSourceObjectData resulting from udt call
 *
 */

  public AccountAbiSourceObjectData getOutput() {
    return AccountAbiSourceObjectHelper.fromMap(outputMap, "AccountAbiSource");
  }
}
