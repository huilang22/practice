/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceDeleteListRequest.java
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
 * Class used to create a AccountAbiSourceDeleteListRequest Udt Request
 *
 */

public class AccountAbiSourceDeleteListRequest extends AccountAbiSourceRequest {
/**
 *
 * Constructor to create a  AccountAbiSourceDeleteListRequest
 * @param id Unique request name
 * @param ABILdelIn AccountAbiSourceObjectFilter for AccountAbiSourceDeleteListRequest
 * @param InactiveDate Date for AccountAbiSourceDeleteListRequest
 *
 */
@JsonCreator
  public AccountAbiSourceDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountAbiSource")AccountAbiSourceObjectFilter ABILdelIn, @JsonProperty("InactiveDate")Date InactiveDate) {
    super(id, "AccountAbiSourceDeleteList");
    if (ABILdelIn != null) {
      Integer index =  ABILdelIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(ABILdelIn, new HashMap(), "Void").get("Void"));
    }
    if (InactiveDate != null) {
      addInput("InactiveDate", InactiveDate);
    }
  }

}
