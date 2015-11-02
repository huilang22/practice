/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeFindRequest.java
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
 * Class used to create a AccountCodeFindRequest Udt Request
 *
 */

public class AccountCodeFindRequest extends AccountCodeRequest {
/**
 *
 * Constructor to create a  AccountCodeFindRequest
 * @param id Unique request name
 * @param CACfindIn AccountCodeObjectFilter for AccountCodeFindRequest
 *
 */
@JsonCreator
  public AccountCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCode")AccountCodeObjectFilter CACfindIn) {
    super(id, "AccountCodeFind");
    if (CACfindIn != null) {
      Integer index =  CACfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountCode", AccountCodeObjectHelper.toMap(CACfindIn, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }

/**
 *
 * Retrieves the AccountCodeObjectDataList that results from the AccountCodeFindRequest call
 * @return AccountCodeObjectDataList resulting from udt call
 *
 */

  public AccountCodeObjectDataList getOutput() {
    return AccountCodeObjectHelper.fromMapList(outputMap, "AccountCodeList");
  }
}
