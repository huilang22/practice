/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCancelValidateRequest.java
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
 * Class used to create a ItemCancelValidateRequest Udt Request
 *
 */

public class ItemCancelValidateRequest extends ItemRequest {
/**
 *
 * Constructor to create a  ItemCancelValidateRequest
 * @param id Unique request name
 * @param ItemCancelValidateIn ItemObjectData for ItemCancelValidateRequest
 *
 */
@JsonCreator
  public ItemCancelValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Item")ItemObjectData ItemCancelValidateIn) {
    super(id, "ItemCancelValidate");
    if (ItemCancelValidateIn != null) {
      addInput("Item", ItemObjectHelper.toMap(ItemCancelValidateIn, new HashMap(), "Item").get("Item"));
    }
  }

/**
 *
 * Retrieves the ItemObjectDataList that results from the ItemCancelValidateRequest call
 * @return ItemObjectDataList resulting from udt call
 *
 */

  public ItemObjectDataList getOutput() {
    return ItemObjectHelper.fromMapList(outputMap, "ItemList");
  }
}
