/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkFindRequest.java
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
 * Class used to create a ItemMarketingDataLinkFindRequest Udt Request
 *
 */

public class ItemMarketingDataLinkFindRequest extends ItemMarketingDataLinkRequest {
/**
 *
 * Constructor to create a  ItemMarketingDataLinkFindRequest
 * @param id Unique request name
 * @param IMDLFindIn ItemMarketingDataLinkObjectFilter for ItemMarketingDataLinkFindRequest
 *
 */
@JsonCreator
  public ItemMarketingDataLinkFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemMarketingDataLink")ItemMarketingDataLinkObjectFilter IMDLFindIn) {
    super(id, "ItemMarketingDataLinkFind");
    if (IMDLFindIn != null) {
      Integer index =  IMDLFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectHelper.toMap(IMDLFindIn, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }

/**
 *
 * Retrieves the ItemMarketingDataLinkObjectDataList that results from the ItemMarketingDataLinkFindRequest call
 * @return ItemMarketingDataLinkObjectDataList resulting from udt call
 *
 */

  public ItemMarketingDataLinkObjectDataList getOutput() {
    return ItemMarketingDataLinkObjectHelper.fromMapList(outputMap, "ItemMarketingDataLinkList");
  }
}
