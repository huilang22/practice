/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionFindRequest.java
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
 * Class used to create a AccountBonusPointTransactionFindRequest Udt Request
 *
 */

public class AccountBonusPointTransactionFindRequest extends AccountBonusPointTransactionRequest {
/**
 *
 * Constructor to create a  AccountBonusPointTransactionFindRequest
 * @param id Unique request name
 * @param findIn AccountBonusPointTransactionObjectFilter for AccountBonusPointTransactionFindRequest
 *
 */
@JsonCreator
  public AccountBonusPointTransactionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBonusPointTransaction")AccountBonusPointTransactionObjectFilter findIn) {
    super(id, "AccountBonusPointTransactionFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(findIn, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }

/**
 *
 * Retrieves the AccountBonusPointTransactionObjectDataList that results from the AccountBonusPointTransactionFindRequest call
 * @return AccountBonusPointTransactionObjectDataList resulting from udt call
 *
 */

  public AccountBonusPointTransactionObjectDataList getOutput() {
    return AccountBonusPointTransactionObjectHelper.fromMapList(outputMap, "AccountBonusPointTransactionList");
  }
}
