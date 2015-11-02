/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrivacyLevelRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PrivacyLevel related UdtRequests
 *
 */

public abstract class PrivacyLevelRequest extends UdtRequest {

/**
 *
 * Constructor for PrivacyLevelRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PrivacyLevelRequest(String id, String method) {
    super(id, "PrivacyLevel", method);
  }
}
