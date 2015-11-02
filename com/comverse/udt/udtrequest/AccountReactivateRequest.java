/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountReactivateRequest.java
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
 * Class used to create a AccountReactivateRequest Udt Request
 *
 */

public class AccountReactivateRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a  AccountReactivateRequest
 * @param id Unique request name
 * @param araIn AccountObjectKeyData for AccountReactivateRequest
 * @param ractReason Integer for AccountReactivateRequest
 * @param ractDate Date for AccountReactivateRequest
 *
 */
@JsonCreator
  public AccountReactivateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectKeyData araIn, @JsonProperty("RactReason")Integer ractReason, @JsonProperty("RactDate")Date ractDate) {
    super(id, "AccountReactivate");
    if (araIn != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(araIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
    if (ractReason != null) {
      addInput("RactReason", ractReason);
    }
    if (ractDate != null) {
      addInput("RactDate", ractDate);
    }
  }

/**
 *
 * Retrieves the AccountXIDObjectData that results from the AccountReactivateRequest call
 * @return AccountXIDObjectData resulting from udt call
 *
 */

  public AccountXIDObjectData getOutput() {
    return AccountXIDObjectHelper.fromMap(outputMap, "Account");
  }
}
