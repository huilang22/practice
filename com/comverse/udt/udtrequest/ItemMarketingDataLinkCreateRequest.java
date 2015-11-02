/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkCreateRequest.java
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
 * Class used to create a ItemMarketingDataLinkCreateRequest Udt Request
 *
 */

public class ItemMarketingDataLinkCreateRequest extends ItemMarketingDataLinkSubRequestParent {
/**
 *
 * Constructor to create a  ItemMarketingDataLinkCreateRequest
 * @param id Unique request name
 * @param IMDLCreateIn ItemMarketingDataLinkObjectData for ItemMarketingDataLinkCreateRequest
 *
 */
@JsonCreator
  public ItemMarketingDataLinkCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingDataLink")ItemMarketingDataLinkObjectData IMDLCreateIn) {
    super(id, "ItemMarketingDataLinkCreate");
    if (IMDLCreateIn != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(IMDLCreateIn, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataLinkObjectData that results from the ItemMarketingDataLinkCreateRequest call
 * @return ItemMarketingDataLinkObjectData resulting from udt call
 *
 */

  public ItemMarketingDataLinkObjectData getOutput() {
    return ItemMarketingDataLinkObjectHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
}
