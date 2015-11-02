/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertUpdateRequest.java
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
 * Class used to create a AccountInsertUpdateRequest Udt Request
 *
 */

public class AccountInsertUpdateRequest extends AccountInsertSubRequestParent {
/**
 *
 * Constructor to create a  AccountInsertUpdateRequest
 * @param id Unique request name
 * @param AIupdateIn AccountInsertObjectData for AccountInsertUpdateRequest
 *
 */
@JsonCreator
  public AccountInsertUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInsert")AccountInsertObjectData AIupdateIn) {
    super(id, "AccountInsertUpdate");
    if (AIupdateIn != null) {
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(AIupdateIn, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }

/**
 *
 * Retrieves the AccountInsertObjectData that results from the AccountInsertUpdateRequest call
 * @return AccountInsertObjectData resulting from udt call
 *
 */

  public AccountInsertObjectData getOutput() {
    return AccountInsertObjectHelper.fromMap(outputMap, "AccountInsert");
  }
}
