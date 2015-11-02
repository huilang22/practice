/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountActivateRequest.java
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
 * Class used to create a AccountActivateRequest Udt Request
 *
 */

public class AccountActivateRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a  AccountActivateRequest
 * @param id Unique request name
 * @param aaIn AccountObjectKeyData for AccountActivateRequest
 * @param actDate Date for AccountActivateRequest
 * @param actReason Integer for AccountActivateRequest
 *
 */
@JsonCreator
  public AccountActivateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectKeyData aaIn, @JsonProperty("ActiveDate")Date actDate, @JsonProperty("ReasonCode")Integer actReason) {
    super(id, "AccountActivate");
    if (aaIn != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(aaIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
    if (actDate != null) {
      addInput("ActiveDate", actDate);
    }
    if (actReason != null) {
      addInput("ReasonCode", actReason);
    }
  }

/**
 *
 * Retrieves the AccountXIDObjectData that results from the AccountActivateRequest call
 * @return AccountXIDObjectData resulting from udt call
 *
 */

  public AccountXIDObjectData getOutput() {
    return AccountXIDObjectHelper.fromMap(outputMap, "Account");
  }
}
