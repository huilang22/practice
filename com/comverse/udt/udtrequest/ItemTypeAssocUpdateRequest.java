/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocUpdateRequest.java
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
 * Class used to create a ItemTypeAssocUpdateRequest Udt Request
 *
 */

public class ItemTypeAssocUpdateRequest extends ItemTypeAssocSubRequestParent {
/**
 *
 * Constructor to create a  ItemTypeAssocUpdateRequest
 * @param id Unique request name
 * @param updateIn ItemTypeAssocObjData for ItemTypeAssocUpdateRequest
 *
 */
@JsonCreator
  public ItemTypeAssocUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemTypeAssoc")ItemTypeAssocObjData updateIn) {
    super(id, "ItemTypeAssocUpdate");
    if (updateIn != null) {
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(updateIn, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }

/**
 *
 * Retrieves the ItemTypeAssocObjData that results from the ItemTypeAssocUpdateRequest call
 * @return ItemTypeAssocObjData resulting from udt call
 *
 */

  public ItemTypeAssocObjData getOutput() {
    return ItemTypeAssocObjHelper.fromMap(outputMap, "ItemTypeAssoc");
  }
}
