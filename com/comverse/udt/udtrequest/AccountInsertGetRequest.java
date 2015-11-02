/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertGetRequest.java
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
 * Class used to create a AccountInsertGetRequest Udt Request
 *
 */

public class AccountInsertGetRequest extends AccountInsertSubRequestParent {
/**
 *
 * Constructor to create a  AccountInsertGetRequest
 * @param id Unique request name
 * @param AIgetIn AccountInsertObjectKeyData for AccountInsertGetRequest
 *
 */
@JsonCreator
  public AccountInsertGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInsert")AccountInsertObjectKeyData AIgetIn) {
    super(id, "AccountInsertGet");
    if (AIgetIn != null) {
      addInput("AccountInsert", AccountInsertObjectKeyHelper.toMap(AIgetIn, new HashMap(), "AccountInsertObjectKeyData").get("AccountInsertObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountInsertObjectData that results from the AccountInsertGetRequest call
 * @return AccountInsertObjectData resulting from udt call
 *
 */

  public AccountInsertObjectData getOutput() {
    return AccountInsertObjectHelper.fromMap(outputMap, "AccountInsert");
  }
}
