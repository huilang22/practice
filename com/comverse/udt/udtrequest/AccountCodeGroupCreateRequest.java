/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupCreateRequest.java
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
 * Class used to create a AccountCodeGroupCreateRequest Udt Request
 *
 */

public class AccountCodeGroupCreateRequest extends AccountCodeGroupSubRequestParent {
/**
 *
 * Constructor to create a  AccountCodeGroupCreateRequest
 * @param id Unique request name
 * @param CACGcreateIn AccountCodeGroupObjectData for AccountCodeGroupCreateRequest
 *
 */
@JsonCreator
  public AccountCodeGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCodeGroup")AccountCodeGroupObjectData CACGcreateIn) {
    super(id, "AccountCodeGroupCreate");
    if (CACGcreateIn != null) {
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(CACGcreateIn, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }

/**
 *
 * Retrieves the AccountCodeGroupObjectData that results from the AccountCodeGroupCreateRequest call
 * @return AccountCodeGroupObjectData resulting from udt call
 *
 */

  public AccountCodeGroupObjectData getOutput() {
    return AccountCodeGroupObjectHelper.fromMap(outputMap, "AccountCodeGroup");
  }
}
