/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageGetRequest.java
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
 * Class used to create a AccountMessageGetRequest Udt Request
 *
 */

public class AccountMessageGetRequest extends AccountMessageSubRequestParent {
/**
 *
 * Constructor to create a  AccountMessageGetRequest
 * @param id Unique request name
 * @param AMgetIn AccountMessageObjectKeyData for AccountMessageGetRequest
 *
 */
@JsonCreator
  public AccountMessageGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountMessage")AccountMessageObjectKeyData AMgetIn) {
    super(id, "AccountMessageGet");
    if (AMgetIn != null) {
      addInput("AccountMessage", AccountMessageObjectKeyHelper.toMap(AMgetIn, new HashMap(), "AccountMessageObjectKeyData").get("AccountMessageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountMessageObjectData that results from the AccountMessageGetRequest call
 * @return AccountMessageObjectData resulting from udt call
 *
 */

  public AccountMessageObjectData getOutput() {
    return AccountMessageObjectHelper.fromMap(outputMap, "AccountMessage");
  }
}
