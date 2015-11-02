/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesDeleteByAccountRequest.java
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
 * Class used to create a AccountBalancesDeleteByAccountRequest Udt Request
 *
 */

public class AccountBalancesDeleteByAccountRequest extends AccountBalancesRequest {
/**
 *
 * Constructor to create a  AccountBalancesDeleteByAccountRequest
 * @param id Unique request name
 * @param ABInObject AccountBalancesObjectData for AccountBalancesDeleteByAccountRequest
 * @param ABAInactiveDate Date for AccountBalancesDeleteByAccountRequest
 *
 */
@JsonCreator
  public AccountBalancesDeleteByAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBalances")AccountBalancesObjectData ABInObject, @JsonProperty("InactiveDate")Date ABAInactiveDate) {
    super(id, "AccountBalancesDeleteByAccount");
    if (ABInObject != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(ABInObject, new HashMap(), "Void").get("Void"));
    }
    if (ABAInactiveDate != null) {
      addInput("InactiveDate", ABAInactiveDate);
    }
  }

}
