/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertDeleteListRequest.java
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
 * Class used to create a AccountInsertDeleteListRequest Udt Request
 *
 */

public class AccountInsertDeleteListRequest extends AccountInsertRequest {
/**
 *
 * Constructor to create a  AccountInsertDeleteListRequest
 * @param id Unique request name
 * @param AILdelIn AccountInsertObjectFilter for AccountInsertDeleteListRequest
 * @param AIDLInactiveDate Date for AccountInsertDeleteListRequest
 *
 */
@JsonCreator
  public AccountInsertDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInsert")AccountInsertObjectFilter AILdelIn, @JsonProperty("InactiveDate")Date AIDLInactiveDate) {
    super(id, "AccountInsertDeleteList");
    if (AILdelIn != null) {
      Integer index =  AILdelIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(AILdelIn, new HashMap(), "Void").get("Void"));
    }
    if (AIDLInactiveDate != null) {
      addInput("InactiveDate", AIDLInactiveDate);
    }
  }

}
