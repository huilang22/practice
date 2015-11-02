/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteUpdateRequest.java
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
 * Class used to create a ItemRouteUpdateRequest Udt Request
 *
 */

public class ItemRouteUpdateRequest extends ItemRouteSubRequestParent {
/**
 *
 * Constructor to create a  ItemRouteUpdateRequest
 * @param id Unique request name
 * @param ItemRouteUpdateIn ItemRouteObjectData for ItemRouteUpdateRequest
 *
 */
@JsonCreator
  public ItemRouteUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemRoute")ItemRouteObjectData ItemRouteUpdateIn) {
    super(id, "ItemRouteUpdate");
    if (ItemRouteUpdateIn != null) {
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(ItemRouteUpdateIn, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }

/**
 *
 * Retrieves the ItemRouteObjectData that results from the ItemRouteUpdateRequest call
 * @return ItemRouteObjectData resulting from udt call
 *
 */

  public ItemRouteObjectData getOutput() {
    return ItemRouteObjectHelper.fromMap(outputMap, "ItemRoute");
  }
}
