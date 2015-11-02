/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all EquipTypeCode related UdtRequests
 *
 */

public abstract class EquipTypeCodeRequest extends UdtRequest {

/**
 *
 * Constructor for EquipTypeCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public EquipTypeCodeRequest(String id, String method) {
    super(id, "EquipTypeCode", method);
  }
}
