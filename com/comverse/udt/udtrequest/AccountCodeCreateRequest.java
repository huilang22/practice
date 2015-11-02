/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeCreateRequest.java
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
 * Class used to create a AccountCodeCreateRequest Udt Request
 *
 */

public class AccountCodeCreateRequest extends AccountCodeSubRequestParent {
/**
 *
 * Constructor to create a  AccountCodeCreateRequest
 * @param id Unique request name
 * @param CACcreateIn AccountCodeObjectData for AccountCodeCreateRequest
 *
 */
@JsonCreator
  public AccountCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCode")AccountCodeObjectData CACcreateIn) {
    super(id, "AccountCodeCreate");
    if (CACcreateIn != null) {
      addInput("AccountCode", AccountCodeObjectHelper.toMap(CACcreateIn, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }

/**
 *
 * Retrieves the AccountCodeObjectData that results from the AccountCodeCreateRequest call
 * @return AccountCodeObjectData resulting from udt call
 *
 */

  public AccountCodeObjectData getOutput() {
    return AccountCodeObjectHelper.fromMap(outputMap, "AccountCode");
  }
}
