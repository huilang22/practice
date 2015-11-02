/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemActionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ItemAction related UdtRequests
 *
 */

public abstract class ItemActionRequest extends UdtRequest {

/**
 *
 * Constructor for ItemActionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ItemActionRequest(String id, String method) {
    super(id, "ItemAction", method);
  }
}
