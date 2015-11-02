/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocFindRequest.java
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
 * Class used to create a ItemTypeAssocFindRequest Udt Request
 *
 */

public class ItemTypeAssocFindRequest extends ItemTypeAssocRequest {
/**
 *
 * Constructor to create a  ItemTypeAssocFindRequest
 * @param id Unique request name
 * @param findIn ItemTypeAssocObjFilter for ItemTypeAssocFindRequest
 *
 */
@JsonCreator
  public ItemTypeAssocFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemTypeAssoc")ItemTypeAssocObjFilter findIn) {
    super(id, "ItemTypeAssocFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(findIn, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }

/**
 *
 * Retrieves the ItemTypeAssocObjDataList that results from the ItemTypeAssocFindRequest call
 * @return ItemTypeAssocObjDataList resulting from udt call
 *
 */

  public ItemTypeAssocObjDataList getOutput() {
    return ItemTypeAssocObjHelper.fromMapList(outputMap, "ItemTypeAssocList");
  }
}
