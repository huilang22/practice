/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryIndustryAssociationFindRequest.java
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
 * Class used to create a ItemCategoryIndustryAssociationFindRequest Udt Request
 *
 */

public class ItemCategoryIndustryAssociationFindRequest extends ItemCategoryIndustryAssociationRequest {
/**
 *
 * Constructor to create a  ItemCategoryIndustryAssociationFindRequest
 * @param id Unique request name
 * @param ICIFindIn ItemCategoryIndustryObjectFilter for ItemCategoryIndustryAssociationFindRequest
 *
 */
@JsonCreator
  public ItemCategoryIndustryAssociationFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemCategoryIndustryAssociation")ItemCategoryIndustryObjectFilter ICIFindIn) {
    super(id, "ItemCategoryIndustryAssociationFind");
    if (ICIFindIn != null) {
      Integer index =  ICIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectHelper.toMap(ICIFindIn, new HashMap(), "ItemCategoryIndustryAssociation").get("ItemCategoryIndustryAssociation"));
    }
  }

/**
 *
 * Retrieves the ItemCategoryIndustryObjectDataList that results from the ItemCategoryIndustryAssociationFindRequest call
 * @return ItemCategoryIndustryObjectDataList resulting from udt call
 *
 */

  public ItemCategoryIndustryObjectDataList getOutput() {
    return ItemCategoryIndustryObjectHelper.fromMapList(outputMap, "ItemCategoryIndustryAssociationList");
  }
}
