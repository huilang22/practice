/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionUpdateUnredeemedRequest.java
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
 * Class used to create a AccountBonusPointTransactionUpdateUnredeemedRequest Udt Request
 *
 */

public class AccountBonusPointTransactionUpdateUnredeemedRequest extends AccountBonusPointTransactionRequest {
/**
 *
 * Constructor to create a  AccountBonusPointTransactionUpdateUnredeemedRequest
 * @param id Unique request name
 * @param ABPTO_In AccountBonusPointTransactionObjectData for AccountBonusPointTransactionUpdateUnredeemedRequest
 * @param ABPToDate_In Date for AccountBonusPointTransactionUpdateUnredeemedRequest
 * @param ABPFromDate_In Date for AccountBonusPointTransactionUpdateUnredeemedRequest
 *
 */
@JsonCreator
  public AccountBonusPointTransactionUpdateUnredeemedRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountBonusPointTransaction")AccountBonusPointTransactionObjectData ABPTO_In, @JsonProperty("ABPToDateIn")Date ABPToDate_In, @JsonProperty("ABPFromDateIn")Date ABPFromDate_In) {
    super(id, "AccountBonusPointTransactionUpdateUnredeemed");
    if (ABPTO_In != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(ABPTO_In, new HashMap(), "ABPUpdateUnredeemedCountOut").get("ABPUpdateUnredeemedCountOut"));
    }
    if (ABPToDate_In != null) {
      addInput("ABPToDateIn", ABPToDate_In);
    }
    if (ABPFromDate_In != null) {
      addInput("ABPFromDateIn", ABPFromDate_In);
    }
  }

/**
 *
 * Retrieves the Integer that results from the AccountBonusPointTransactionUpdateUnredeemedRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("ABPUpdateUnredeemedCountOut");
  }
}
