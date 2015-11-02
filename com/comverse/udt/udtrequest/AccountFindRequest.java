/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountFindRequest.java
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
 * Class used to create a AccountFindRequest Udt Request
 *
 */

public class AccountFindRequest extends AccountRequest {
/**
 *
 * Constructor to create a  AccountFindRequest
 * @param id Unique request name
 * @param afIn AccountXIDObjectFilter for AccountFindRequest
 *
 */
@JsonCreator
  public AccountFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountXIDObjectFilter afIn) {
    super(id, "AccountFind");
    if (afIn != null) {
      Integer index =  afIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Account", AccountXIDObjectHelper.toMap(afIn, new HashMap(), "Account").get("Account"));
    }
  }

/**
 *
 * Retrieves the AccountXIDObjectDataList that results from the AccountFindRequest call
 * @return AccountXIDObjectDataList resulting from udt call
 *
 */

  public AccountXIDObjectDataList getOutput() {
    return AccountXIDObjectHelper.fromMapList(outputMap, "AccountList");
  }
}
