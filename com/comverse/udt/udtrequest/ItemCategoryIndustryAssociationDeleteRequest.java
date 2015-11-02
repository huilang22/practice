/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryIndustryAssociationDeleteRequest.java
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
 * Class used to create a ItemCategoryIndustryAssociationDeleteRequest Udt Request
 *
 */

public class ItemCategoryIndustryAssociationDeleteRequest extends ItemCategoryIndustryAssociationSubRequestParent {
/**
 *
 * Constructor to create a  ItemCategoryIndustryAssociationDeleteRequest
 * @param id Unique request name
 * @param ICIDeleteIn ItemCategoryIndustryObjectKeyData for ItemCategoryIndustryAssociationDeleteRequest
 *
 */
@JsonCreator
  public ItemCategoryIndustryAssociationDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemCategoryIndustryAssociation")ItemCategoryIndustryObjectKeyData ICIDeleteIn) {
    super(id, "ItemCategoryIndustryAssociationDelete");
    if (ICIDeleteIn != null) {
      addInput("ItemCategoryIndustryAssociation", ItemCategoryIndustryObjectKeyHelper.toMap(ICIDeleteIn, new HashMap(), "ItemCategoryIndustryObjectKeyData").get("ItemCategoryIndustryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemCategoryIndustryObjectData that results from the ItemCategoryIndustryAssociationDeleteRequest call
 * @return ItemCategoryIndustryObjectData resulting from udt call
 *
 */

  public ItemCategoryIndustryObjectData getOutput() {
    return ItemCategoryIndustryObjectHelper.fromMap(outputMap, "ItemCategoryIndustryAssociation");
  }
}
