/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdUpdateRequest.java
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
 * Class used to create a AccountIdUpdateRequest Udt Request
 *
 */

public class AccountIdUpdateRequest extends AccountIdSubRequestParent {
/**
 *
 * Constructor to create a  AccountIdUpdateRequest
 * @param id Unique request name
 * @param updateIn AccountIdObjectData for AccountIdUpdateRequest
 *
 */
@JsonCreator
  public AccountIdUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountId")AccountIdObjectData updateIn) {
    super(id, "AccountIdUpdate");
    if (updateIn != null) {
      addInput("AccountId", AccountIdObjectHelper.toMap(updateIn, new HashMap(), "AccountId").get("AccountId"));
    }
  }

/**
 *
 * Retrieves the AccountIdObjectData that results from the AccountIdUpdateRequest call
 * @return AccountIdObjectData resulting from udt call
 *
 */

  public AccountIdObjectData getOutput() {
    return AccountIdObjectHelper.fromMap(outputMap, "AccountId");
  }
}
