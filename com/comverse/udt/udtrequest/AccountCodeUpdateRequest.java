/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeUpdateRequest.java
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
 * Class used to create a AccountCodeUpdateRequest Udt Request
 *
 */

public class AccountCodeUpdateRequest extends AccountCodeSubRequestParent {
/**
 *
 * Constructor to create a  AccountCodeUpdateRequest
 * @param id Unique request name
 * @param CACupdateIn AccountCodeObjectData for AccountCodeUpdateRequest
 *
 */
@JsonCreator
  public AccountCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCode")AccountCodeObjectData CACupdateIn) {
    super(id, "AccountCodeUpdate");
    if (CACupdateIn != null) {
      addInput("AccountCode", AccountCodeObjectHelper.toMap(CACupdateIn, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }

/**
 *
 * Retrieves the AccountCodeObjectData that results from the AccountCodeUpdateRequest call
 * @return AccountCodeObjectData resulting from udt call
 *
 */

  public AccountCodeObjectData getOutput() {
    return AccountCodeObjectHelper.fromMap(outputMap, "AccountCode");
  }
}
