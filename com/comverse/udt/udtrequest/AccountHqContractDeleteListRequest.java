/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractDeleteListRequest.java
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
 * Class used to create a AccountHqContractDeleteListRequest Udt Request
 *
 */

public class AccountHqContractDeleteListRequest extends AccountHqContractRequest {
/**
 *
 * Constructor to create a  AccountHqContractDeleteListRequest
 * @param id Unique request name
 * @param AHCLdeleteIn AccountHqContractObjectFilter for AccountHqContractDeleteListRequest
 * @param AHCLInactiveDate Date for AccountHqContractDeleteListRequest
 *
 */
@JsonCreator
  public AccountHqContractDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountHqContract")AccountHqContractObjectFilter AHCLdeleteIn, @JsonProperty("AHCLInactiveDate")Date AHCLInactiveDate) {
    super(id, "AccountHqContractDeleteList");
    if (AHCLdeleteIn != null) {
      Integer index =  AHCLdeleteIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(AHCLdeleteIn, new HashMap(), "Void").get("Void"));
    }
    if (AHCLInactiveDate != null) {
      addInput("AHCLInactiveDate", AHCLInactiveDate);
    }
  }

}
