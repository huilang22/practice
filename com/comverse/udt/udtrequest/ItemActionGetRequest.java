/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemActionGetRequest.java
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
 * Class used to create a ItemActionGetRequest Udt Request
 *
 */

public class ItemActionGetRequest extends ItemActionSubRequestParent {
/**
 *
 * Constructor to create a  ItemActionGetRequest
 * @param id Unique request name
 * @param ItemActionGetIn ItemActionObjectKeyData for ItemActionGetRequest
 *
 */
@JsonCreator
  public ItemActionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemAction")ItemActionObjectKeyData ItemActionGetIn) {
    super(id, "ItemActionGet");
    if (ItemActionGetIn != null) {
      addInput("ItemAction", ItemActionObjectKeyHelper.toMap(ItemActionGetIn, new HashMap(), "ItemActionObjectKeyData").get("ItemActionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemActionObjectData that results from the ItemActionGetRequest call
 * @return ItemActionObjectData resulting from udt call
 *
 */

  public ItemActionObjectData getOutput() {
    return ItemActionObjectHelper.fromMap(outputMap, "ItemAction");
  }
}
