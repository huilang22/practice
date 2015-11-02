/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGetRequest.java
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
 * Class used to create a AccountCodeGetRequest Udt Request
 *
 */

public class AccountCodeGetRequest extends AccountCodeSubRequestParent {
/**
 *
 * Constructor to create a  AccountCodeGetRequest
 * @param id Unique request name
 * @param CACgetIn AccountCodeObjectKeyData for AccountCodeGetRequest
 *
 */
@JsonCreator
  public AccountCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCode")AccountCodeObjectKeyData CACgetIn) {
    super(id, "AccountCodeGet");
    if (CACgetIn != null) {
      addInput("AccountCode", AccountCodeObjectKeyHelper.toMap(CACgetIn, new HashMap(), "AccountCodeObjectKeyData").get("AccountCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountCodeObjectData that results from the AccountCodeGetRequest call
 * @return AccountCodeObjectData resulting from udt call
 *
 */

  public AccountCodeObjectData getOutput() {
    return AccountCodeObjectHelper.fromMap(outputMap, "AccountCode");
  }
}
