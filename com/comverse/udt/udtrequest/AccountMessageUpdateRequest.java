/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageUpdateRequest.java
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
 * Class used to create a AccountMessageUpdateRequest Udt Request
 *
 */

public class AccountMessageUpdateRequest extends AccountMessageSubRequestParent {
/**
 *
 * Constructor to create a  AccountMessageUpdateRequest
 * @param id Unique request name
 * @param AMupdateIn AccountMessageObjectData for AccountMessageUpdateRequest
 *
 */
@JsonCreator
  public AccountMessageUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountMessage")AccountMessageObjectData AMupdateIn) {
    super(id, "AccountMessageUpdate");
    if (AMupdateIn != null) {
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(AMupdateIn, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }

/**
 *
 * Retrieves the AccountMessageObjectData that results from the AccountMessageUpdateRequest call
 * @return AccountMessageObjectData resulting from udt call
 *
 */

  public AccountMessageObjectData getOutput() {
    return AccountMessageObjectHelper.fromMap(outputMap, "AccountMessage");
  }
}
