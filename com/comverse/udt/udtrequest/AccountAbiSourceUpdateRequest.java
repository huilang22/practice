/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceUpdateRequest.java
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
 * Class used to create a AccountAbiSourceUpdateRequest Udt Request
 *
 */

public class AccountAbiSourceUpdateRequest extends AccountAbiSourceSubRequestParent {
/**
 *
 * Constructor to create a  AccountAbiSourceUpdateRequest
 * @param id Unique request name
 * @param ABIupdateIn AccountAbiSourceObjectData for AccountAbiSourceUpdateRequest
 *
 */
@JsonCreator
  public AccountAbiSourceUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountAbiSource")AccountAbiSourceObjectData ABIupdateIn) {
    super(id, "AccountAbiSourceUpdate");
    if (ABIupdateIn != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(ABIupdateIn, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }

/**
 *
 * Retrieves the AccountAbiSourceObjectData that results from the AccountAbiSourceUpdateRequest call
 * @return AccountAbiSourceObjectData resulting from udt call
 *
 */

  public AccountAbiSourceObjectData getOutput() {
    return AccountAbiSourceObjectHelper.fromMap(outputMap, "AccountAbiSource");
  }
}
