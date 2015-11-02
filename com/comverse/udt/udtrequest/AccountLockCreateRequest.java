/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLockCreateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AccountLockCreateRequest Udt Request
 *
 */

public class AccountLockCreateRequest extends LockManagerRequest {
/**
 *
 * Constructor to create a  AccountLockCreateRequest
 * @param id Unique request name
 * @param AccountInternalId Integer for AccountLockCreateRequest
 * @param ServiceOrderId String for AccountLockCreateRequest
 *
 */
@JsonCreator
  public AccountLockCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer AccountInternalId, @JsonProperty("ServiceOrderId")String ServiceOrderId) {
    super(id, "AccountLockCreate");
    if (AccountInternalId != null) {
      addInput("AccountInternalId", AccountInternalId);
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }

}
