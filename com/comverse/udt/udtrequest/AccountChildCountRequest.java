/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountChildCountRequest.java
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
 * Class used to create a AccountChildCountRequest Udt Request
 *
 */

public class AccountChildCountRequest extends AccountRequest {
/**
 *
 * Constructor to create a  AccountChildCountRequest
 * @param id Unique request name
 * @param accIn AccountObjectKeyData for AccountChildCountRequest
 *
 */
@JsonCreator
  public AccountChildCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectKeyData accIn) {
    super(id, "AccountChildCount");
    if (accIn != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(accIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the AccountChildCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("Count");
  }
}
