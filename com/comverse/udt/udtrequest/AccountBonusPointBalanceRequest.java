/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointBalanceRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AccountBonusPointBalance related UdtRequests
 *
 */

public abstract class AccountBonusPointBalanceRequest extends UdtRequest {

/**
 *
 * Constructor for AccountBonusPointBalanceRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AccountBonusPointBalanceRequest(String id, String method) {
    super(id, "AccountBonusPointBalance", method);
  }
}
