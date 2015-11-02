/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountUpdateRequest.java
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
 * Class used to create a AccountUpdateRequest Udt Request
 *
 */

public class AccountUpdateRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a  AccountUpdateRequest
 * @param id Unique request name
 * @param au2In AccountObjectData for AccountUpdateRequest
 *
 */
@JsonCreator
  public AccountUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectData au2In) {
    super(id, "AccountUpdate");
    if (au2In != null) {
      addInput("Account", AccountObjectHelper.toMap(au2In, new HashMap(), "Account").get("Account"));
    }
  }

/**
 *
 * Retrieves the AccountXIDObjectData that results from the AccountUpdateRequest call
 * @return AccountXIDObjectData resulting from udt call
 *
 */

  public AccountXIDObjectData getOutput() {
    return AccountXIDObjectHelper.fromMap(outputMap, "Account");
  }
}
