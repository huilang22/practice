/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemActionUpdateRequest.java
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
 * Class used to create a ItemActionUpdateRequest Udt Request
 *
 */

public class ItemActionUpdateRequest extends ItemActionSubRequestParent {
/**
 *
 * Constructor to create a  ItemActionUpdateRequest
 * @param id Unique request name
 * @param ItemActionUpdateIn ItemActionObjectData for ItemActionUpdateRequest
 *
 */
@JsonCreator
  public ItemActionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemAction")ItemActionObjectData ItemActionUpdateIn) {
    super(id, "ItemActionUpdate");
    if (ItemActionUpdateIn != null) {
      addInput("ItemAction", ItemActionObjectHelper.toMap(ItemActionUpdateIn, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }

/**
 *
 * Retrieves the ItemActionObjectData that results from the ItemActionUpdateRequest call
 * @return ItemActionObjectData resulting from udt call
 *
 */

  public ItemActionObjectData getOutput() {
    return ItemActionObjectHelper.fromMap(outputMap, "ItemAction");
  }
}
