/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdCreateRequest.java
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
 * Class used to create a AccountIdCreateRequest Udt Request
 *
 */

public class AccountIdCreateRequest extends AccountIdSubRequestParent {
/**
 *
 * Constructor to create a  AccountIdCreateRequest
 * @param id Unique request name
 * @param createIn AccountIdObjectData for AccountIdCreateRequest
 *
 */
@JsonCreator
  public AccountIdCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountId")AccountIdObjectData createIn) {
    super(id, "AccountIdCreate");
    if (createIn != null) {
      addInput("AccountId", AccountIdObjectHelper.toMap(createIn, new HashMap(), "AccountId").get("AccountId"));
    }
  }

/**
 *
 * Retrieves the AccountIdObjectData that results from the AccountIdCreateRequest call
 * @return AccountIdObjectData resulting from udt call
 *
 */

  public AccountIdObjectData getOutput() {
    return AccountIdObjectHelper.fromMap(outputMap, "AccountId");
  }
}
