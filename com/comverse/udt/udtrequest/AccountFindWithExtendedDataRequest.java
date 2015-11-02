/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountFindWithExtendedDataRequest.java
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
 * Class used to create a AccountFindWithExtendedDataRequest Udt Request
 *
 */

public class AccountFindWithExtendedDataRequest extends AccountRequest {
/**
 *
 * Constructor to create a  AccountFindWithExtendedDataRequest
 * @param id Unique request name
 * @param afedIn AccountXIDObjectFilter for AccountFindWithExtendedDataRequest
 *
 */
@JsonCreator
  public AccountFindWithExtendedDataRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountXIDObjectFilter afedIn) {
    super(id, "AccountFindWithExtendedData");
    if (afedIn != null) {
      Integer index =  afedIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Account", AccountXIDObjectHelper.toMap(afedIn, new HashMap(), "Account").get("Account"));
    }
  }

/**
 *
 * Retrieves the AccountXIDObjectDataList that results from the AccountFindWithExtendedDataRequest call
 * @return AccountXIDObjectDataList resulting from udt call
 *
 */

  public AccountXIDObjectDataList getOutput() {
    return AccountXIDObjectHelper.fromMapList(outputMap, "AccountList");
  }
}
