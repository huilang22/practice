/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageDeleteRequest.java
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
 * Class used to create a AccountMessageDeleteRequest Udt Request
 *
 */

public class AccountMessageDeleteRequest extends AccountMessageSubRequestParent {
/**
 *
 * Constructor to create a  AccountMessageDeleteRequest
 * @param id Unique request name
 * @param AMdelIn AccountMessageObjectKeyData for AccountMessageDeleteRequest
 * @param AMDInactiveDate Date for AccountMessageDeleteRequest
 *
 */
@JsonCreator
  public AccountMessageDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountMessage")AccountMessageObjectKeyData AMdelIn, @JsonProperty("InactiveDate")Date AMDInactiveDate) {
    super(id, "AccountMessageDelete");
    if (AMdelIn != null) {
      addInput("AccountMessage", AccountMessageObjectKeyHelper.toMap(AMdelIn, new HashMap(), "AccountMessageObjectKeyData").get("AccountMessageObjectKeyData"));
    }
    if (AMDInactiveDate != null) {
      addInput("InactiveDate", AMDInactiveDate);
    }
  }

/**
 *
 * Retrieves the AccountMessageObjectData that results from the AccountMessageDeleteRequest call
 * @return AccountMessageObjectData resulting from udt call
 *
 */

  public AccountMessageObjectData getOutput() {
    return AccountMessageObjectHelper.fromMap(outputMap, "AccountMessage");
  }
}
