/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertDeleteRequest.java
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
 * Class used to create a AccountInsertDeleteRequest Udt Request
 *
 */

public class AccountInsertDeleteRequest extends AccountInsertSubRequestParent {
/**
 *
 * Constructor to create a  AccountInsertDeleteRequest
 * @param id Unique request name
 * @param AIdelIn AccountInsertObjectKeyData for AccountInsertDeleteRequest
 * @param AIDInactiveDate Date for AccountInsertDeleteRequest
 *
 */
@JsonCreator
  public AccountInsertDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInsert")AccountInsertObjectKeyData AIdelIn, @JsonProperty("InactiveDate")Date AIDInactiveDate) {
    super(id, "AccountInsertDelete");
    if (AIdelIn != null) {
      addInput("AccountInsert", AccountInsertObjectKeyHelper.toMap(AIdelIn, new HashMap(), "AccountInsertObjectKeyData").get("AccountInsertObjectKeyData"));
    }
    if (AIDInactiveDate != null) {
      addInput("InactiveDate", AIDInactiveDate);
    }
  }

/**
 *
 * Retrieves the AccountInsertObjectData that results from the AccountInsertDeleteRequest call
 * @return AccountInsertObjectData resulting from udt call
 *
 */

  public AccountInsertObjectData getOutput() {
    return AccountInsertObjectHelper.fromMap(outputMap, "AccountInsert");
  }
}
