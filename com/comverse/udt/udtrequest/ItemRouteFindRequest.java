/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemRouteFindRequest.java
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
 * Class used to create a ItemRouteFindRequest Udt Request
 *
 */

public class ItemRouteFindRequest extends ItemRouteRequest {
/**
 *
 * Constructor to create a  ItemRouteFindRequest
 * @param id Unique request name
 * @param ItemRouteFindIn ItemRouteObjectFilter for ItemRouteFindRequest
 *
 */
@JsonCreator
  public ItemRouteFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemRoute")ItemRouteObjectFilter ItemRouteFindIn) {
    super(id, "ItemRouteFind");
    if (ItemRouteFindIn != null) {
      Integer index =  ItemRouteFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemRoute", ItemRouteObjectHelper.toMap(ItemRouteFindIn, new HashMap(), "ItemRoute").get("ItemRoute"));
    }
  }

/**
 *
 * Retrieves the ItemRouteObjectDataList that results from the ItemRouteFindRequest call
 * @return ItemRouteObjectDataList resulting from udt call
 *
 */

  public ItemRouteObjectDataList getOutput() {
    return ItemRouteObjectHelper.fromMapList(outputMap, "ItemRouteList");
  }
}
