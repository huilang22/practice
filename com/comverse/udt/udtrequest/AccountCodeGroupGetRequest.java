/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupGetRequest.java
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
 * Class used to create a AccountCodeGroupGetRequest Udt Request
 *
 */

public class AccountCodeGroupGetRequest extends AccountCodeGroupSubRequestParent {
/**
 *
 * Constructor to create a  AccountCodeGroupGetRequest
 * @param id Unique request name
 * @param CACGgetIn AccountCodeGroupObjectKeyData for AccountCodeGroupGetRequest
 *
 */
@JsonCreator
  public AccountCodeGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCodeGroup")AccountCodeGroupObjectKeyData CACGgetIn) {
    super(id, "AccountCodeGroupGet");
    if (CACGgetIn != null) {
      addInput("AccountCodeGroup", AccountCodeGroupObjectKeyHelper.toMap(CACGgetIn, new HashMap(), "AccountCodeGroupObjectKeyData").get("AccountCodeGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountCodeGroupObjectData that results from the AccountCodeGroupGetRequest call
 * @return AccountCodeGroupObjectData resulting from udt call
 *
 */

  public AccountCodeGroupObjectData getOutput() {
    return AccountCodeGroupObjectHelper.fromMap(outputMap, "AccountCodeGroup");
  }
}
