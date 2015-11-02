/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointBalanceGetRequest.java
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
 * Class used to create a AccountBonusPointBalanceGetRequest Udt Request
 *
 */

public class AccountBonusPointBalanceGetRequest extends AccountBonusPointBalanceSubRequestParent {
/**
 *
 * Constructor to create a  AccountBonusPointBalanceGetRequest
 * @param id Unique request name
 * @param getIn AccountBonusPointBalanceObjectKeyData for AccountBonusPointBalanceGetRequest
 *
 */
@JsonCreator
  public AccountBonusPointBalanceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBonusPointBalance")AccountBonusPointBalanceObjectKeyData getIn) {
    super(id, "AccountBonusPointBalanceGet");
    if (getIn != null) {
      addInput("AccountBonusPointBalance", AccountBonusPointBalanceObjectKeyHelper.toMap(getIn, new HashMap(), "AccountBonusPointBalanceObjectKeyData").get("AccountBonusPointBalanceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountBonusPointBalanceObjectData that results from the AccountBonusPointBalanceGetRequest call
 * @return AccountBonusPointBalanceObjectData resulting from udt call
 *
 */

  public AccountBonusPointBalanceObjectData getOutput() {
    return AccountBonusPointBalanceObjectHelper.fromMap(outputMap, "AccountBonusPointBalance");
  }
}
