/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemActionFindRequest.java
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
 * Class used to create a ItemActionFindRequest Udt Request
 *
 */

public class ItemActionFindRequest extends ItemActionRequest {
/**
 *
 * Constructor to create a  ItemActionFindRequest
 * @param id Unique request name
 * @param ItemActionFindIn ItemActionObjectFilter for ItemActionFindRequest
 *
 */
@JsonCreator
  public ItemActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemAction")ItemActionObjectFilter ItemActionFindIn) {
    super(id, "ItemActionFind");
    if (ItemActionFindIn != null) {
      Integer index =  ItemActionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemAction", ItemActionObjectHelper.toMap(ItemActionFindIn, new HashMap(), "ItemAction").get("ItemAction"));
    }
  }

/**
 *
 * Retrieves the ItemActionObjectDataList that results from the ItemActionFindRequest call
 * @return ItemActionObjectDataList resulting from udt call
 *
 */

  public ItemActionObjectDataList getOutput() {
    return ItemActionObjectHelper.fromMapList(outputMap, "ItemActionList");
  }
}
