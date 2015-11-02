/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCancelRequest.java
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
 * Class used to create a ItemCancelRequest Udt Request
 *
 */

public class ItemCancelRequest extends ItemRequest {
/**
 *
 * Constructor to create a  ItemCancelRequest
 * @param id Unique request name
 * @param ItemCancelIn ItemObjectData for ItemCancelRequest
 *
 */
@JsonCreator
  public ItemCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("Item")ItemObjectData ItemCancelIn) {
    super(id, "ItemCancel");
    if (ItemCancelIn != null) {
      addInput("Item", ItemObjectHelper.toMap(ItemCancelIn, new HashMap(), "Item").get("Item"));
    }
  }

/**
 *
 * Retrieves the ItemObjectDataList that results from the ItemCancelRequest call
 * @return ItemObjectDataList resulting from udt call
 *
 */

  public ItemObjectDataList getOutput() {
    return ItemObjectHelper.fromMapList(outputMap, "ItemList");
  }
}
