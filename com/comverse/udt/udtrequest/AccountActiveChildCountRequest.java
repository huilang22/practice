/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountActiveChildCountRequest.java
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
 * Class used to create a AccountActiveChildCountRequest Udt Request
 *
 */

public class AccountActiveChildCountRequest extends AccountRequest {
/**
 *
 * Constructor to create a  AccountActiveChildCountRequest
 * @param id Unique request name
 * @param aaccKeyIn AccountObjectKeyData for AccountActiveChildCountRequest
 * @param effective_date Date for AccountActiveChildCountRequest
 *
 */
@JsonCreator
  public AccountActiveChildCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectKeyData aaccKeyIn, @JsonProperty("EffectiveDate")Date effective_date) {
    super(id, "AccountActiveChildCount");
    if (aaccKeyIn != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(aaccKeyIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
  }

/**
 *
 * Retrieves the Integer that results from the AccountActiveChildCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("ActiveChildCount");
  }
}
