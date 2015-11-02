/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemClearReviseFlagRequest.java
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
 * Class used to create a ItemClearReviseFlagRequest Udt Request
 *
 */

public class ItemClearReviseFlagRequest extends ItemRequest {
/**
 *
 * Constructor to create a  ItemClearReviseFlagRequest
 * @param id Unique request name
 * @param ItemClearRevisionsIn ItemObjectData for ItemClearReviseFlagRequest
 *
 */
@JsonCreator
  public ItemClearReviseFlagRequest(@JsonProperty("RequestId") String id, @JsonProperty("Item")ItemObjectData ItemClearRevisionsIn) {
    super(id, "ItemClearReviseFlag");
    if (ItemClearRevisionsIn != null) {
      addInput("Item", ItemObjectHelper.toMap(ItemClearRevisionsIn, new HashMap(), "Void").get("Void"));
    }
  }

}
