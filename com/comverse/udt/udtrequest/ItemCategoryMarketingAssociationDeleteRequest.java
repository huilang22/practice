/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryMarketingAssociationDeleteRequest.java
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
 * Class used to create a ItemCategoryMarketingAssociationDeleteRequest Udt Request
 *
 */

public class ItemCategoryMarketingAssociationDeleteRequest extends ItemCategoryMarketingAssociationSubRequestParent {
/**
 *
 * Constructor to create a  ItemCategoryMarketingAssociationDeleteRequest
 * @param id Unique request name
 * @param ICMDeleteIn ItemCategoryMarketingObjectKeyData for ItemCategoryMarketingAssociationDeleteRequest
 *
 */
@JsonCreator
  public ItemCategoryMarketingAssociationDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemCategoryMarketingAssociation")ItemCategoryMarketingObjectKeyData ICMDeleteIn) {
    super(id, "ItemCategoryMarketingAssociationDelete");
    if (ICMDeleteIn != null) {
      addInput("ItemCategoryMarketingAssociation", ItemCategoryMarketingObjectKeyHelper.toMap(ICMDeleteIn, new HashMap(), "ItemCategoryMarketingObjectKeyData").get("ItemCategoryMarketingObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemCategoryMarketingObjectData that results from the ItemCategoryMarketingAssociationDeleteRequest call
 * @return ItemCategoryMarketingObjectData resulting from udt call
 *
 */

  public ItemCategoryMarketingObjectData getOutput() {
    return ItemCategoryMarketingObjectHelper.fromMap(outputMap, "ItemCategoryMarketingAssociation");
  }
}
