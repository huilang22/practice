/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocCreateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ItemTypeAssocCreateRequest Udt Request
 *
 */

public class ItemTypeAssocCreateRequest extends ItemTypeAssocSubRequestParent {
/**
 *
 * Constructor to create a  ItemTypeAssocCreateRequest
 * @param id Unique request name
 * @param createIn ItemTypeAssocObjData for ItemTypeAssocCreateRequest
 *
 */
@JsonCreator
  public ItemTypeAssocCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemTypeAssoc")ItemTypeAssocObjData createIn) {
    super(id, "ItemTypeAssocCreate");
    if (createIn != null) {
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(createIn, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }

/**
 *
 * Retrieves the ItemTypeAssocObjData that results from the ItemTypeAssocCreateRequest call
 * @return ItemTypeAssocObjData resulting from udt call
 *
 */

  public ItemTypeAssocObjData getOutput() {
    return ItemTypeAssocObjHelper.fromMap(outputMap, "ItemTypeAssoc");
  }
}
