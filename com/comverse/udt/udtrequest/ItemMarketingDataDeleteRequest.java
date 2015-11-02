/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataDeleteRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ItemMarketingDataDeleteRequest Udt Request
 *
 */

public class ItemMarketingDataDeleteRequest extends ItemMarketingDataSubRequestParent {
/**
 *
 * Constructor to create a  ItemMarketingDataDeleteRequest
 * @param id Unique request name
 * @param itemMarketingDataDeleteIn ItemMarketingDataObjectKeyData for ItemMarketingDataDeleteRequest
 *
 */
@JsonCreator
  public ItemMarketingDataDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingData")ItemMarketingDataObjectKeyData itemMarketingDataDeleteIn) {
    super(id, "ItemMarketingDataDelete");
    if (itemMarketingDataDeleteIn != null) {
      addInput("ItemMarketingData", ItemMarketingDataObjectKeyHelper.toMap(itemMarketingDataDeleteIn, new HashMap(), "ItemMarketingDataObjectKeyData").get("ItemMarketingDataObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataObjectData that results from the ItemMarketingDataDeleteRequest call
 * @return ItemMarketingDataObjectData resulting from udt call
 *
 */

  public ItemMarketingDataObjectData getOutput() {
    return ItemMarketingDataObjectHelper.fromMap(outputMap, "ItemMarketingData");
  }
}
