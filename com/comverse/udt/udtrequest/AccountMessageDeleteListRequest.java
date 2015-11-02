/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageDeleteListRequest.java
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
 * Class used to create a AccountMessageDeleteListRequest Udt Request
 *
 */

public class AccountMessageDeleteListRequest extends AccountMessageRequest {
/**
 *
 * Constructor to create a  AccountMessageDeleteListRequest
 * @param id Unique request name
 * @param AMLdelIn AccountMessageObjectFilter for AccountMessageDeleteListRequest
 * @param AMDLInactiveDate Date for AccountMessageDeleteListRequest
 *
 */
@JsonCreator
  public AccountMessageDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountMessage")AccountMessageObjectFilter AMLdelIn, @JsonProperty("InactiveDate")Date AMDLInactiveDate) {
    super(id, "AccountMessageDeleteList");
    if (AMLdelIn != null) {
      Integer index =  AMLdelIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(AMLdelIn, new HashMap(), "Void").get("Void"));
    }
    if (AMDLInactiveDate != null) {
      addInput("InactiveDate", AMDLInactiveDate);
    }
  }

}
