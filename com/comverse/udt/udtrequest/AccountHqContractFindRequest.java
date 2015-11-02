/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractFindRequest.java
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
 * Class used to create a AccountHqContractFindRequest Udt Request
 *
 */

public class AccountHqContractFindRequest extends AccountHqContractRequest {
/**
 *
 * Constructor to create a  AccountHqContractFindRequest
 * @param id Unique request name
 * @param AHCfindIn AccountHqContractObjectFilter for AccountHqContractFindRequest
 *
 */
@JsonCreator
  public AccountHqContractFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountHqContract")AccountHqContractObjectFilter AHCfindIn) {
    super(id, "AccountHqContractFind");
    if (AHCfindIn != null) {
      Integer index =  AHCfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(AHCfindIn, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }

/**
 *
 * Retrieves the AccountHqContractObjectDataList that results from the AccountHqContractFindRequest call
 * @return AccountHqContractObjectDataList resulting from udt call
 *
 */

  public AccountHqContractObjectDataList getOutput() {
    return AccountHqContractObjectHelper.fromMapList(outputMap, "AccountHqContractList");
  }
}
