/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountStatusFindRequest.java
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
 * Class used to create a AccountStatusFindRequest Udt Request
 *
 */

public class AccountStatusFindRequest extends AccountStatusRequest {
/**
 *
 * Constructor to create a  AccountStatusFindRequest
 * @param id Unique request name
 * @param AccountStatusfindIn AccountStatusObjectFilter for AccountStatusFindRequest
 *
 */
@JsonCreator
  public AccountStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountStatus")AccountStatusObjectFilter AccountStatusfindIn) {
    super(id, "AccountStatusFind");
    if (AccountStatusfindIn != null) {
      Integer index =  AccountStatusfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountStatus", AccountStatusObjectHelper.toMap(AccountStatusfindIn, new HashMap(), "AccountStatus").get("AccountStatus"));
    }
  }

/**
 *
 * Retrieves the AccountStatusObjectDataList that results from the AccountStatusFindRequest call
 * @return AccountStatusObjectDataList resulting from udt call
 *
 */

  public AccountStatusObjectDataList getOutput() {
    return AccountStatusObjectHelper.fromMapList(outputMap, "AccountStatusList");
  }
}
