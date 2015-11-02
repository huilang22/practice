/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemGetRequest.java
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
 * Class used to create a ItemGetRequest Udt Request
 *
 */

public class ItemGetRequest extends ItemSubRequestParent {
/**
 *
 * Constructor to create a  ItemGetRequest
 * @param id Unique request name
 * @param ItemGetIn ItemObjectKeyData for ItemGetRequest
 *
 */
@JsonCreator
  public ItemGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Item")ItemObjectKeyData ItemGetIn) {
    super(id, "ItemGet");
    if (ItemGetIn != null) {
      addInput("Item", ItemObjectKeyHelper.toMap(ItemGetIn, new HashMap(), "ItemObjectKeyData").get("ItemObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemObjectData that results from the ItemGetRequest call
 * @return ItemObjectData resulting from udt call
 *
 */

  public ItemObjectData getOutput() {
    return ItemObjectHelper.fromMap(outputMap, "Item");
  }
}
