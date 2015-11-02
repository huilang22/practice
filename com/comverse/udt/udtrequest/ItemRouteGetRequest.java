/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteGetRequest.java
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
 * Class used to create a ItemRouteGetRequest Udt Request
 *
 */

public class ItemRouteGetRequest extends ItemRouteSubRequestParent {
/**
 *
 * Constructor to create a  ItemRouteGetRequest
 * @param id Unique request name
 * @param ItemRouteGetIn ItemRouteObjectKeyData for ItemRouteGetRequest
 *
 */
@JsonCreator
  public ItemRouteGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemRoute")ItemRouteObjectKeyData ItemRouteGetIn) {
    super(id, "ItemRouteGet");
    if (ItemRouteGetIn != null) {
      addInput("ItemRoute", ItemRouteObjectKeyHelper.toMap(ItemRouteGetIn, new HashMap(), "ItemRouteObjectKeyData").get("ItemRouteObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemRouteObjectData that results from the ItemRouteGetRequest call
 * @return ItemRouteObjectData resulting from udt call
 *
 */

  public ItemRouteObjectData getOutput() {
    return ItemRouteObjectHelper.fromMap(outputMap, "ItemRoute");
  }
}
