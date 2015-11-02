/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkGetRequest.java
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
 * Class used to create a ItemMarketingDataLinkGetRequest Udt Request
 *
 */

public class ItemMarketingDataLinkGetRequest extends ItemMarketingDataLinkSubRequestParent {
/**
 *
 * Constructor to create a  ItemMarketingDataLinkGetRequest
 * @param id Unique request name
 * @param IMDLGetIn ItemMarketingDataLinkObjectKeyData for ItemMarketingDataLinkGetRequest
 *
 */
@JsonCreator
  public ItemMarketingDataLinkGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingDataLink")ItemMarketingDataLinkObjectKeyData IMDLGetIn) {
    super(id, "ItemMarketingDataLinkGet");
    if (IMDLGetIn != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectKeyHelper.toMap(IMDLGetIn, new HashMap(), "ItemMarketingDataLinkObjectKeyData").get("ItemMarketingDataLinkObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataLinkObjectData that results from the ItemMarketingDataLinkGetRequest call
 * @return ItemMarketingDataLinkObjectData resulting from udt call
 *
 */

  public ItemMarketingDataLinkObjectData getOutput() {
    return ItemMarketingDataLinkObjectHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
}
