/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSequenceGetRequest.java
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
 * Class used to create a AccountSequenceGetRequest Udt Request
 *
 */

public class AccountSequenceGetRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a  AccountSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public AccountSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "AccountSequenceGet");
  }

/**
 *
 * Retrieves the AccountObjectKeyData that results from the AccountSequenceGetRequest call
 * @return AccountObjectKeyData resulting from udt call
 *
 */

  public AccountObjectKeyData getOutput() {
    return AccountObjectKeyHelper.fromMap(outputMap, "Account");
  }
}
