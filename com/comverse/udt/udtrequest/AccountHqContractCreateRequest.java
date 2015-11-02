/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractCreateRequest.java
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
 * Class used to create a AccountHqContractCreateRequest Udt Request
 *
 */

public class AccountHqContractCreateRequest extends AccountHqContractSubRequestParent {
/**
 *
 * Constructor to create a  AccountHqContractCreateRequest
 * @param id Unique request name
 * @param AHCcreateIn AccountHqContractObjectData for AccountHqContractCreateRequest
 *
 */
@JsonCreator
  public AccountHqContractCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountHqContract")AccountHqContractObjectData AHCcreateIn) {
    super(id, "AccountHqContractCreate");
    if (AHCcreateIn != null) {
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(AHCcreateIn, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }

/**
 *
 * Retrieves the AccountHqContractObjectData that results from the AccountHqContractCreateRequest call
 * @return AccountHqContractObjectData resulting from udt call
 *
 */

  public AccountHqContractObjectData getOutput() {
    return AccountHqContractObjectHelper.fromMap(outputMap, "AccountHqContract");
  }
}
