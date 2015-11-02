/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractGetRequest.java
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
 * Class used to create a AccountHqContractGetRequest Udt Request
 *
 */

public class AccountHqContractGetRequest extends AccountHqContractSubRequestParent {
/**
 *
 * Constructor to create a  AccountHqContractGetRequest
 * @param id Unique request name
 * @param AHCgetIn AccountHqContractObjectKeyData for AccountHqContractGetRequest
 *
 */
@JsonCreator
  public AccountHqContractGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountHqContract")AccountHqContractObjectKeyData AHCgetIn) {
    super(id, "AccountHqContractGet");
    if (AHCgetIn != null) {
      addInput("AccountHqContract", AccountHqContractObjectKeyHelper.toMap(AHCgetIn, new HashMap(), "AccountHqContractObjectKeyData").get("AccountHqContractObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountHqContractObjectData that results from the AccountHqContractGetRequest call
 * @return AccountHqContractObjectData resulting from udt call
 *
 */

  public AccountHqContractObjectData getOutput() {
    return AccountHqContractObjectHelper.fromMap(outputMap, "AccountHqContract");
  }
}
