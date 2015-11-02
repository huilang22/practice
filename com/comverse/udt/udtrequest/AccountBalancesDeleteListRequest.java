/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesDeleteListRequest.java
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
 * Class used to create a AccountBalancesDeleteListRequest Udt Request
 *
 */

public class AccountBalancesDeleteListRequest extends AccountBalancesRequest {
/**
 *
 * Constructor to create a  AccountBalancesDeleteListRequest
 * @param id Unique request name
 * @param AccountBalancesFilter AccountBalancesObjectFilter for AccountBalancesDeleteListRequest
 * @param ABInactiveDate Date for AccountBalancesDeleteListRequest
 *
 */
@JsonCreator
  public AccountBalancesDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBalancesFilter")AccountBalancesObjectFilter AccountBalancesFilter, @JsonProperty("InactiveDate")Date ABInactiveDate) {
    super(id, "AccountBalancesDeleteList");
    if (AccountBalancesFilter != null) {
      Integer index =  AccountBalancesFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountBalancesFilter", AccountBalancesObjectHelper.toMap(AccountBalancesFilter, new HashMap(), "Void").get("Void"));
    }
    if (ABInactiveDate != null) {
      addInput("InactiveDate", ABInactiveDate);
    }
  }

}
