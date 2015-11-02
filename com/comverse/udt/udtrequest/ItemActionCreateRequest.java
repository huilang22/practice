/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemActionCreateRequest.java
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
 * Class used to create a ItemActionCreateRequest Udt Request
 *
 */

public class ItemActionCreateRequest extends ItemActionSubRequestParent {
/**
 *
 * Constructor to create a  ItemActionCreateRequest
 * @param id Unique request name
 * @param ItemActionCreateIn ItemActionObjectData for ItemActionCreateRequest
 *
 */
@JsonCreator
  public ItemActionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemAction")ItemActionObjectData ItemActionCreateIn) {
    super(id, "ItemActionCreate");
    if (ItemActionCreateIn != null) {
      addInput("ItemAction", ItemActionObjectHelper.toMap(ItemActionCreateIn, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }

/**
 *
 * Retrieves the ItemActionObjectData that results from the ItemActionCreateRequest call
 * @return ItemActionObjectData resulting from udt call
 *
 */

  public ItemActionObjectData getOutput() {
    return ItemActionObjectHelper.fromMap(outputMap, "ItemAction");
  }
}
