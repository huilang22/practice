/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdDeleteListRequest.java
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
 * Class used to create a AccountIdDeleteListRequest Udt Request
 *
 */

public class AccountIdDeleteListRequest extends AccountIdRequest {
/**
 *
 * Constructor to create a  AccountIdDeleteListRequest
 * @param id Unique request name
 * @param xlFilter AccountIdObjectFilter for AccountIdDeleteListRequest
 * @param AIDLCeaseDate Date for AccountIdDeleteListRequest
 *
 */
@JsonCreator
  public AccountIdDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountId")AccountIdObjectFilter xlFilter, @JsonProperty("InactiveDate")Date AIDLCeaseDate) {
    super(id, "AccountIdDeleteList");
    if (xlFilter != null) {
      Integer index =  xlFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountId", AccountIdObjectHelper.toMap(xlFilter, new HashMap(), "Void").get("Void"));
    }
    if (AIDLCeaseDate != null) {
      addInput("InactiveDate", AIDLCeaseDate);
    }
  }

}
