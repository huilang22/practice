/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AccountCategoryFindRequest Udt Request
 *
 */

public class AccountCategoryFindRequest extends AccountCategoryRequest {
/**
 *
 * Constructor to create a  AccountCategoryFindRequest
 * @param id Unique request name
 * @param ACFindIn ACObjectFilter for AccountCategoryFindRequest
 *
 */
@JsonCreator
  public AccountCategoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCategory")ACObjectFilter ACFindIn) {
    super(id, "AccountCategoryFind");
    if (ACFindIn != null) {
      Integer index =  ACFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountCategory", ACObjectHelper.toMap(ACFindIn, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }

/**
 *
 * Retrieves the ACObjectDataList that results from the AccountCategoryFindRequest call
 * @return ACObjectDataList resulting from udt call
 *
 */

  public ACObjectDataList getOutput() {
    return ACObjectHelper.fromMapList(outputMap, "AccountCategoryList");
  }
}
