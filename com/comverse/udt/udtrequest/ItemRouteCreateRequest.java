/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteCreateRequest.java
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
 * Class used to create a ItemRouteCreateRequest Udt Request
 *
 */

public class ItemRouteCreateRequest extends ItemRouteSubRequestParent {
/**
 *
 * Constructor to create a  ItemRouteCreateRequest
 * @param id Unique request name
 * @param ItemRouteCreateIn ItemRouteObjectData for ItemRouteCreateRequest
 *
 */
@JsonCreator
  public ItemRouteCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemRoute")ItemRouteObjectData ItemRouteCreateIn) {
    super(id, "ItemRouteCreate");
    if (ItemRouteCreateIn != null) {
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(ItemRouteCreateIn, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }

/**
 *
 * Retrieves the ItemRouteObjectData that results from the ItemRouteCreateRequest call
 * @return ItemRouteObjectData resulting from udt call
 *
 */

  public ItemRouteObjectData getOutput() {
    return ItemRouteObjectHelper.fromMap(outputMap, "ItemRoute");
  }
}
