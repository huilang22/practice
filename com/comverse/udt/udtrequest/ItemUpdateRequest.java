/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemUpdateRequest.java
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
 * Class used to create a ItemUpdateRequest Udt Request
 *
 */

public class ItemUpdateRequest extends ItemSubRequestParent {
/**
 *
 * Constructor to create a  ItemUpdateRequest
 * @param id Unique request name
 * @param ItemUpdateIn ItemObjectData for ItemUpdateRequest
 *
 */
@JsonCreator
  public ItemUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Item")ItemObjectData ItemUpdateIn) {
    super(id, "ItemUpdate");
    if (ItemUpdateIn != null) {
      addInput("Item", ItemObjectHelper.toMap(ItemUpdateIn, new HashMap(), "Item").get("Item"));
    }
  }

/**
 *
 * Retrieves the ItemObjectData that results from the ItemUpdateRequest call
 * @return ItemObjectData resulting from udt call
 *
 */

  public ItemObjectData getOutput() {
    return ItemObjectHelper.fromMap(outputMap, "Item");
  }
}
