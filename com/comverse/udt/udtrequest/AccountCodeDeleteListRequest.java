/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeDeleteListRequest.java
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
 * Class used to create a AccountCodeDeleteListRequest Udt Request
 *
 */

public class AccountCodeDeleteListRequest extends AccountCodeRequest {
/**
 *
 * Constructor to create a  AccountCodeDeleteListRequest
 * @param id Unique request name
 * @param CACLdeleteIn AccountCodeObjectFilter for AccountCodeDeleteListRequest
 *
 */
@JsonCreator
  public AccountCodeDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCode")AccountCodeObjectFilter CACLdeleteIn) {
    super(id, "AccountCodeDeleteList");
    if (CACLdeleteIn != null) {
      Integer index =  CACLdeleteIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountCode", AccountCodeObjectHelper.toMap(CACLdeleteIn, new HashMap(), "Void").get("Void"));
    }
  }

}
