/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all LanguageCode related UdtRequests
 *
 */

public abstract class LanguageCodeRequest extends UdtRequest {

/**
 *
 * Constructor for LanguageCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public LanguageCodeRequest(String id, String method) {
    super(id, "LanguageCode", method);
  }
}
