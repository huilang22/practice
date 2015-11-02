/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryMarketingAssociationFindRequest.java
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
 * Class used to create a ItemCategoryMarketingAssociationFindRequest Udt Request
 *
 */

public class ItemCategoryMarketingAssociationFindRequest extends ItemCategoryMarketingAssociationRequest {
/**
 *
 * Constructor to create a  ItemCategoryMarketingAssociationFindRequest
 * @param id Unique request name
 * @param ICMFindIn ItemCategoryMarketingObjectFilter for ItemCategoryMarketingAssociationFindRequest
 *
 */
@JsonCreator
  public ItemCategoryMarketingAssociationFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemCategoryMarketingAssociation")ItemCategoryMarketingObjectFilter ICMFindIn) {
    super(id, "ItemCategoryMarketingAssociationFind");
    if (ICMFindIn != null) {
      Integer index =  ICMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectHelper.toMap(ICMFindIn, new HashMap(), "ItemCategoryMarketingAssociation").get("ItemCategoryMarketingAssociation"));
    }
  }

/**
 *
 * Retrieves the ItemCategoryMarketingObjectDataList that results from the ItemCategoryMarketingAssociationFindRequest call
 * @return ItemCategoryMarketingObjectDataList resulting from udt call
 *
 */

  public ItemCategoryMarketingObjectDataList getOutput() {
    return ItemCategoryMarketingObjectHelper.fromMapList(outputMap, "ItemCategoryMarketingAssociationList");
  }
}
