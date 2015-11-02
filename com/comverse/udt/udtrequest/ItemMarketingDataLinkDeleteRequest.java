/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkDeleteRequest.java
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
 * Class used to create a ItemMarketingDataLinkDeleteRequest Udt Request
 *
 */

public class ItemMarketingDataLinkDeleteRequest extends ItemMarketingDataLinkSubRequestParent {
/**
 *
 * Constructor to create a  ItemMarketingDataLinkDeleteRequest
 * @param id Unique request name
 * @param IMDLDeleteIn ItemMarketingDataLinkObjectKeyData for ItemMarketingDataLinkDeleteRequest
 *
 */
@JsonCreator
  public ItemMarketingDataLinkDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingDataLink")ItemMarketingDataLinkObjectKeyData IMDLDeleteIn) {
    super(id, "ItemMarketingDataLinkDelete");
    if (IMDLDeleteIn != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectKeyHelper.toMap(IMDLDeleteIn, new HashMap(), "ItemMarketingDataLinkObjectKeyData").get("ItemMarketingDataLinkObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataLinkObjectData that results from the ItemMarketingDataLinkDeleteRequest call
 * @return ItemMarketingDataLinkObjectData resulting from udt call
 *
 */

  public ItemMarketingDataLinkObjectData getOutput() {
    return ItemMarketingDataLinkObjectHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
}
