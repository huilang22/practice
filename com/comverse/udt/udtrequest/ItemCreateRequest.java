/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCreateRequest.java
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
 * Class used to create a ItemCreateRequest Udt Request
 *
 */

public class ItemCreateRequest extends ItemSubRequestParent {
/**
 *
 * Constructor to create a  ItemCreateRequest
 * @param id Unique request name
 * @param ItemCreateIn ItemObjectData for ItemCreateRequest
 *
 */
@JsonCreator
  public ItemCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Item")ItemObjectData ItemCreateIn) {
    super(id, "ItemCreate");
    if (ItemCreateIn != null) {
      addInput("Item", ItemObjectHelper.toMap(ItemCreateIn, new HashMap(), "Item").get("Item"));
    }
  }

/**
 *
 * Retrieves the ItemObjectData that results from the ItemCreateRequest call
 * @return ItemObjectData resulting from udt call
 *
 */

  public ItemObjectData getOutput() {
    return ItemObjectHelper.fromMap(outputMap, "Item");
  }
}
