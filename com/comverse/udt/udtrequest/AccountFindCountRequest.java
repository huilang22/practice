/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountFindCountRequest.java
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
 * Class used to create a AccountFindCountRequest Udt Request
 *
 */

public class AccountFindCountRequest extends AccountRequest {
/**
 *
 * Constructor to create a  AccountFindCountRequest
 * @param id Unique request name
 * @param afcIn AccountXIDObjectFilter for AccountFindCountRequest
 *
 */
@JsonCreator
  public AccountFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountXIDObjectFilter afcIn) {
    super(id, "AccountFindCount");
    if (afcIn != null) {
      Integer index =  afcIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Account", AccountXIDObjectHelper.toMap(afcIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the AccountFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
