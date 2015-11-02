/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdDeleteRequest.java
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
 * Class used to create a AccountIdDeleteRequest Udt Request
 *
 */

public class AccountIdDeleteRequest extends AccountIdSubRequestParent {
/**
 *
 * Constructor to create a  AccountIdDeleteRequest
 * @param id Unique request name
 * @param axIn AccountIdObjectKeyData for AccountIdDeleteRequest
 * @param AIDCeaseDate Date for AccountIdDeleteRequest
 *
 */
@JsonCreator
  public AccountIdDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountId")AccountIdObjectKeyData axIn, @JsonProperty("InactiveDate")Date AIDCeaseDate) {
    super(id, "AccountIdDelete");
    if (axIn != null) {
      addInput("AccountId", AccountIdObjectKeyHelper.toMap(axIn, new HashMap(), "AccountIdObjectKeyData").get("AccountIdObjectKeyData"));
    }
    if (AIDCeaseDate != null) {
      addInput("InactiveDate", AIDCeaseDate);
    }
  }

/**
 *
 * Retrieves the AccountIdObjectData that results from the AccountIdDeleteRequest call
 * @return AccountIdObjectData resulting from udt call
 *
 */

  public AccountIdObjectData getOutput() {
    return AccountIdObjectHelper.fromMap(outputMap, "AccountId");
  }
}
