/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractUpdateRequest.java
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
 * Class used to create a AccountHqContractUpdateRequest Udt Request
 *
 */

public class AccountHqContractUpdateRequest extends AccountHqContractSubRequestParent {
/**
 *
 * Constructor to create a  AccountHqContractUpdateRequest
 * @param id Unique request name
 * @param AHCupdateIn AccountHqContractObjectData for AccountHqContractUpdateRequest
 *
 */
@JsonCreator
  public AccountHqContractUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountHqContract")AccountHqContractObjectData AHCupdateIn) {
    super(id, "AccountHqContractUpdate");
    if (AHCupdateIn != null) {
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(AHCupdateIn, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }

/**
 *
 * Retrieves the AccountHqContractObjectData that results from the AccountHqContractUpdateRequest call
 * @return AccountHqContractObjectData resulting from udt call
 *
 */

  public AccountHqContractObjectData getOutput() {
    return AccountHqContractObjectHelper.fromMap(outputMap, "AccountHqContract");
  }
}
