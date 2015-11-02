/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountFindByOrderNumberRequest.java
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
 * Class used to create a AccountFindByOrderNumberRequest Udt Request
 *
 */

public class AccountFindByOrderNumberRequest extends AccountRequest {
/**
 *
 * Constructor to create a  AccountFindByOrderNumberRequest
 * @param id Unique request name
 * @param aofIn AccountXIDOrderObjectFilter for AccountFindByOrderNumberRequest
 *
 */
@JsonCreator
  public AccountFindByOrderNumberRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountXIDOrderObjectFilter aofIn) {
    super(id, "AccountFindByOrderNumber");
    if (aofIn != null) {
      Integer index =  aofIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Account", AccountXIDOrderObjectHelper.toMap(aofIn, new HashMap(), "Account").get("Account"));
    }
  }

/**
 *
 * Retrieves the AccountXIDObjectDataList that results from the AccountFindByOrderNumberRequest call
 * @return AccountXIDObjectDataList resulting from udt call
 *
 */

  public AccountXIDObjectDataList getOutput() {
    return AccountXIDObjectHelper.fromMapList(outputMap, "AccountList");
  }
}
