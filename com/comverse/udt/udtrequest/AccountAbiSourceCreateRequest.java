/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceCreateRequest.java
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
 * Class used to create a AccountAbiSourceCreateRequest Udt Request
 *
 */

public class AccountAbiSourceCreateRequest extends AccountAbiSourceSubRequestParent {
/**
 *
 * Constructor to create a  AccountAbiSourceCreateRequest
 * @param id Unique request name
 * @param ABIcreateIn AccountAbiSourceObjectData for AccountAbiSourceCreateRequest
 *
 */
@JsonCreator
  public AccountAbiSourceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountAbiSource")AccountAbiSourceObjectData ABIcreateIn) {
    super(id, "AccountAbiSourceCreate");
    if (ABIcreateIn != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(ABIcreateIn, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }

/**
 *
 * Retrieves the AccountAbiSourceObjectData that results from the AccountAbiSourceCreateRequest call
 * @return AccountAbiSourceObjectData resulting from udt call
 *
 */

  public AccountAbiSourceObjectData getOutput() {
    return AccountAbiSourceObjectHelper.fromMap(outputMap, "AccountAbiSource");
  }
}
