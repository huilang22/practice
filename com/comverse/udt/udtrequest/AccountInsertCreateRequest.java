/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertCreateRequest.java
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
 * Class used to create a AccountInsertCreateRequest Udt Request
 *
 */

public class AccountInsertCreateRequest extends AccountInsertSubRequestParent {
/**
 *
 * Constructor to create a  AccountInsertCreateRequest
 * @param id Unique request name
 * @param AIcreateIn AccountInsertObjectData for AccountInsertCreateRequest
 *
 */
@JsonCreator
  public AccountInsertCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInsert")AccountInsertObjectData AIcreateIn) {
    super(id, "AccountInsertCreate");
    if (AIcreateIn != null) {
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(AIcreateIn, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }

/**
 *
 * Retrieves the AccountInsertObjectData that results from the AccountInsertCreateRequest call
 * @return AccountInsertObjectData resulting from udt call
 *
 */

  public AccountInsertObjectData getOutput() {
    return AccountInsertObjectHelper.fromMap(outputMap, "AccountInsert");
  }
}
