/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeDeleteRequest.java
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
 * Class used to create a AccountCodeDeleteRequest Udt Request
 *
 */

public class AccountCodeDeleteRequest extends AccountCodeRequest {
/**
 *
 * Constructor to create a  AccountCodeDeleteRequest
 * @param id Unique request name
 * @param CACdeleteIn AccountCodeObjectKeyData for AccountCodeDeleteRequest
 *
 */
@JsonCreator
  public AccountCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountCode")AccountCodeObjectKeyData CACdeleteIn) {
    super(id, "AccountCodeDelete");
    if (CACdeleteIn != null) {
      addInput("AccountCode", AccountCodeObjectKeyHelper.toMap(CACdeleteIn, new HashMap(), "AccountCodeObjectKeyData").get("AccountCodeObjectKeyData"));
    }
  }

}
