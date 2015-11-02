/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkUpdateRequest.java
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
 * Class used to create a ItemMarketingDataLinkUpdateRequest Udt Request
 *
 */

public class ItemMarketingDataLinkUpdateRequest extends ItemMarketingDataLinkSubRequestParent {
/**
 *
 * Constructor to create a  ItemMarketingDataLinkUpdateRequest
 * @param id Unique request name
 * @param IMDLUpdateIn ItemMarketingDataLinkObjectData for ItemMarketingDataLinkUpdateRequest
 *
 */
@JsonCreator
  public ItemMarketingDataLinkUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingDataLink")ItemMarketingDataLinkObjectData IMDLUpdateIn) {
    super(id, "ItemMarketingDataLinkUpdate");
    if (IMDLUpdateIn != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(IMDLUpdateIn, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataLinkObjectData that results from the ItemMarketingDataLinkUpdateRequest call
 * @return ItemMarketingDataLinkObjectData resulting from udt call
 *
 */

  public ItemMarketingDataLinkObjectData getOutput() {
    return ItemMarketingDataLinkObjectHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
}
