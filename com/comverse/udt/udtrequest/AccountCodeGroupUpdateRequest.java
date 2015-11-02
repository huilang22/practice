/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupUpdateRequest.java
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
 * Class used to create a AccountCodeGroupUpdateRequest Udt Request
 *
 */

public class AccountCodeGroupUpdateRequest extends AccountCodeGroupSubRequestParent {
/**
 *
 * Constructor to create a  AccountCodeGroupUpdateRequest
 * @param id Unique request name
 * @param CACGupdateIn AccountCodeGroupObjectData for AccountCodeGroupUpdateRequest
 *
 */
@JsonCreator
  public AccountCodeGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCodeGroup")AccountCodeGroupObjectData CACGupdateIn) {
    super(id, "AccountCodeGroupUpdate");
    if (CACGupdateIn != null) {
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(CACGupdateIn, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }

/**
 *
 * Retrieves the AccountCodeGroupObjectData that results from the AccountCodeGroupUpdateRequest call
 * @return AccountCodeGroupObjectData resulting from udt call
 *
 */

  public AccountCodeGroupObjectData getOutput() {
    return AccountCodeGroupObjectHelper.fromMap(outputMap, "AccountCodeGroup");
  }
}
