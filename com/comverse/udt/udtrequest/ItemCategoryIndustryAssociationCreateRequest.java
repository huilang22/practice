/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryIndustryAssociationCreateRequest.java
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
 * Class used to create a ItemCategoryIndustryAssociationCreateRequest Udt Request
 *
 */

public class ItemCategoryIndustryAssociationCreateRequest extends ItemCategoryIndustryAssociationSubRequestParent {
/**
 *
 * Constructor to create a  ItemCategoryIndustryAssociationCreateRequest
 * @param id Unique request name
 * @param ICICreateIn ItemCategoryIndustryObjectData for ItemCategoryIndustryAssociationCreateRequest
 *
 */
@JsonCreator
  public ItemCategoryIndustryAssociationCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemCategoryIndustryAssociation")ItemCategoryIndustryObjectData ICICreateIn) {
    super(id, "ItemCategoryIndustryAssociationCreate");
    if (ICICreateIn != null) {
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectHelper.toMap(ICICreateIn, new HashMap(), "ItemCategoryIndustryAssociation").get("ItemCategoryIndustryAssociation"));
    }
  }

/**
 *
 * Retrieves the ItemCategoryIndustryObjectData that results from the ItemCategoryIndustryAssociationCreateRequest call
 * @return ItemCategoryIndustryObjectData resulting from udt call
 *
 */

  public ItemCategoryIndustryObjectData getOutput() {
    return ItemCategoryIndustryObjectHelper.fromMap(outputMap, "ItemCategoryIndustryAssociation");
  }
}
