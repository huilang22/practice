/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateGetRequest.java
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
 * Class used to create a AccountLocateGetRequest Udt Request
 *
 */

public class AccountLocateGetRequest extends AccountLocateSubRequestParent {
/**
 *
 * Constructor to create a  AccountLocateGetRequest
 * @param id Unique request name
 * @param algIn AccountLocateObjectKeyData for AccountLocateGetRequest
 *
 */
@JsonCreator
  public AccountLocateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountLocate")AccountLocateObjectKeyData algIn) {
    super(id, "AccountLocateGet");
    if (algIn != null) {
      addInput("AccountLocate", AccountLocateObjectKeyHelper.toMap(algIn, new HashMap(), "AccountLocateObjectKeyData").get("AccountLocateObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountLocateObjectData that results from the AccountLocateGetRequest call
 * @return AccountLocateObjectData resulting from udt call
 *
 */

  public AccountLocateObjectData getOutput() {
    return AccountLocateObjectHelper.fromMap(outputMap, "AccountLocate");
  }
}
