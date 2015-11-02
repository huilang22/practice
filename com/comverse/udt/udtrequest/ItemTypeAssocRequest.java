/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ItemTypeAssoc related UdtRequests
 *
 */

public abstract class ItemTypeAssocRequest extends UdtRequest {

/**
 *
 * Constructor for ItemTypeAssocRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ItemTypeAssocRequest(String id, String method) {
    super(id, "ItemTypeAssoc", method);
  }
}
