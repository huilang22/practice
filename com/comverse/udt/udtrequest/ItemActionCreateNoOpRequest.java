/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemActionCreateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a ItemActionCreateNoOpRequest Udt Request/Response
 *
 */
public class ItemActionCreateNoOpRequest extends ItemActionSubRequestParent {
/**
 *
 * Constructor to create a   ItemActionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemActionCreateNoOpRequest(String id, ItemActionObjectData noOpIn) {
    super(id, "ItemActionCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ItemAction", ItemActionObjectHelper.toMap(noOpIn, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }
/**
 *
 * Retrieves the ItemActionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemActionObjectData getOutput() {
    return ItemActionObjectHelper.fromMap(outputMap, "ItemAction");
  }
}
