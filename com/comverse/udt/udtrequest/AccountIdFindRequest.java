/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdFindRequest.java
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
 * Class used to create a AccountIdFindRequest Udt Request
 *
 */

public class AccountIdFindRequest extends AccountIdRequest {
/**
 *
 * Constructor to create a  AccountIdFindRequest
 * @param id Unique request name
 * @param findIn AccountIdObjectFilter for AccountIdFindRequest
 *
 */
@JsonCreator
  public AccountIdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountId")AccountIdObjectFilter findIn) {
    super(id, "AccountIdFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountId", AccountIdObjectHelper.toMap(findIn, new HashMap(), "AccountId").get("AccountId"));
    }
  }

/**
 *
 * Retrieves the AccountIdObjectDataList that results from the AccountIdFindRequest call
 * @return AccountIdObjectDataList resulting from udt call
 *
 */

  public AccountIdObjectDataList getOutput() {
    return AccountIdObjectHelper.fromMapList(outputMap, "AccountIdList");
  }
}
