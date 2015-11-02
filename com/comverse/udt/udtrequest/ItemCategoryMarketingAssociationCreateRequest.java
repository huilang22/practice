/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryMarketingAssociationCreateRequest.java
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
 * Class used to create a ItemCategoryMarketingAssociationCreateRequest Udt Request
 *
 */

public class ItemCategoryMarketingAssociationCreateRequest extends ItemCategoryMarketingAssociationSubRequestParent {
/**
 *
 * Constructor to create a  ItemCategoryMarketingAssociationCreateRequest
 * @param id Unique request name
 * @param ICMCreateIn ItemCategoryMarketingObjectData for ItemCategoryMarketingAssociationCreateRequest
 *
 */
@JsonCreator
  public ItemCategoryMarketingAssociationCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemCategoryMarketingAssociation")ItemCategoryMarketingObjectData ICMCreateIn) {
    super(id, "ItemCategoryMarketingAssociationCreate");
    if (ICMCreateIn != null) {
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectHelper.toMap(ICMCreateIn, new HashMap(), "ItemCategoryMarketingAssociation").get("ItemCategoryMarketingAssociation"));
    }
  }

/**
 *
 * Retrieves the ItemCategoryMarketingObjectData that results from the ItemCategoryMarketingAssociationCreateRequest call
 * @return ItemCategoryMarketingObjectData resulting from udt call
 *
 */

  public ItemCategoryMarketingObjectData getOutput() {
    return ItemCategoryMarketingObjectHelper.fromMap(outputMap, "ItemCategoryMarketingAssociation");
  }
}
