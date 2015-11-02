/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageCreateRequest.java
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
 * Class used to create a AccountMessageCreateRequest Udt Request
 *
 */

public class AccountMessageCreateRequest extends AccountMessageSubRequestParent {
/**
 *
 * Constructor to create a  AccountMessageCreateRequest
 * @param id Unique request name
 * @param AMcreateIn AccountMessageObjectData for AccountMessageCreateRequest
 *
 */
@JsonCreator
  public AccountMessageCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountMessage")AccountMessageObjectData AMcreateIn) {
    super(id, "AccountMessageCreate");
    if (AMcreateIn != null) {
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(AMcreateIn, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }

/**
 *
 * Retrieves the AccountMessageObjectData that results from the AccountMessageCreateRequest call
 * @return AccountMessageObjectData resulting from udt call
 *
 */

  public AccountMessageObjectData getOutput() {
    return AccountMessageObjectHelper.fromMap(outputMap, "AccountMessage");
  }
}
