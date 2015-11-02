/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemFindRequest.java
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
 * Class used to create a ItemFindRequest Udt Request
 *
 */

public class ItemFindRequest extends ItemRequest {
/**
 *
 * Constructor to create a  ItemFindRequest
 * @param id Unique request name
 * @param ItemFindIn ItemObjectFilter for ItemFindRequest
 *
 */
@JsonCreator
  public ItemFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Item")ItemObjectFilter ItemFindIn) {
    super(id, "ItemFind");
    if (ItemFindIn != null) {
      Integer index =  ItemFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Item", ItemObjectHelper.toMap(ItemFindIn, new HashMap(), "Item").get("Item"));
    }
  }

/**
 *
 * Retrieves the ItemObjectDataList that results from the ItemFindRequest call
 * @return ItemObjectDataList resulting from udt call
 *
 */

  public ItemObjectDataList getOutput() {
    return ItemObjectHelper.fromMapList(outputMap, "ItemList");
  }
}
