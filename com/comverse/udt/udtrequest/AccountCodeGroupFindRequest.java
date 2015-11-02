/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupFindRequest.java
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
 * Class used to create a AccountCodeGroupFindRequest Udt Request
 *
 */

public class AccountCodeGroupFindRequest extends AccountCodeGroupRequest {
/**
 *
 * Constructor to create a  AccountCodeGroupFindRequest
 * @param id Unique request name
 * @param CACGfindIn AccountCodeGroupObjectFilter for AccountCodeGroupFindRequest
 *
 */
@JsonCreator
  public AccountCodeGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCodeGroup")AccountCodeGroupObjectFilter CACGfindIn) {
    super(id, "AccountCodeGroupFind");
    if (CACGfindIn != null) {
      Integer index =  CACGfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(CACGfindIn, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }

/**
 *
 * Retrieves the AccountCodeGroupObjectDataList that results from the AccountCodeGroupFindRequest call
 * @return AccountCodeGroupObjectDataList resulting from udt call
 *
 */

  public AccountCodeGroupObjectDataList getOutput() {
    return AccountCodeGroupObjectHelper.fromMapList(outputMap, "AccountCodeGroupList");
  }
}
