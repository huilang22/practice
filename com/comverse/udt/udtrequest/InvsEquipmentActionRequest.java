/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsEquipmentAction related UdtRequests
 *
 */

public abstract class InvsEquipmentActionRequest extends UdtRequest {

/**
 *
 * Constructor for InvsEquipmentActionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsEquipmentActionRequest(String id, String method) {
    super(id, "InvsEquipmentAction", method);
  }
}
