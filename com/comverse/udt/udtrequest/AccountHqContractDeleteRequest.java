/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractDeleteRequest.java
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
 * Class used to create a AccountHqContractDeleteRequest Udt Request
 *
 */

public class AccountHqContractDeleteRequest extends AccountHqContractSubRequestParent {
/**
 *
 * Constructor to create a  AccountHqContractDeleteRequest
 * @param id Unique request name
 * @param AHCdeleteIn AccountHqContractObjectKeyData for AccountHqContractDeleteRequest
 * @param AHCInactiveDate Date for AccountHqContractDeleteRequest
 *
 */
@JsonCreator
  public AccountHqContractDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountHqContract")AccountHqContractObjectKeyData AHCdeleteIn, @JsonProperty("AHCInactiveDate")Date AHCInactiveDate) {
    super(id, "AccountHqContractDelete");
    if (AHCdeleteIn != null) {
      addInput("AccountHqContract", AccountHqContractObjectKeyHelper.toMap(AHCdeleteIn, new HashMap(), "AccountHqContractObjectKeyData").get("AccountHqContractObjectKeyData"));
    }
    if (AHCInactiveDate != null) {
      addInput("AHCInactiveDate", AHCInactiveDate);
    }
  }

/**
 *
 * Retrieves the AccountHqContractObjectData that results from the AccountHqContractDeleteRequest call
 * @return AccountHqContractObjectData resulting from udt call
 *
 */

  public AccountHqContractObjectData getOutput() {
    return AccountHqContractObjectHelper.fromMap(outputMap, "AccountHqContract");
  }
}
