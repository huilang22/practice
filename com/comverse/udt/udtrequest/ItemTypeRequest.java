/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ItemType related UdtRequests
 *
 */

public abstract class ItemTypeRequest extends UdtRequest {

/**
 *
 * Constructor for ItemTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ItemTypeRequest(String id, String method) {
    super(id, "ItemType", method);
  }
}
