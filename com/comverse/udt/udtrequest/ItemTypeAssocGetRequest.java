/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocGetRequest.java
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
 * Class used to create a ItemTypeAssocGetRequest Udt Request
 *
 */

public class ItemTypeAssocGetRequest extends ItemTypeAssocSubRequestParent {
/**
 *
 * Constructor to create a  ItemTypeAssocGetRequest
 * @param id Unique request name
 * @param getIn ItemTypeAssocObjKeyData for ItemTypeAssocGetRequest
 *
 */
@JsonCreator
  public ItemTypeAssocGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ItemTypeAssoc")ItemTypeAssocObjKeyData getIn) {
    super(id, "ItemTypeAssocGet");
    if (getIn != null) {
      addInput("ItemTypeAssoc", ItemTypeAssocObjKeyHelper.toMap(getIn, new HashMap(), "ItemTypeAssocObjKeyData").get("ItemTypeAssocObjKeyData"));
    }
  }

/**
 *
 * Retrieves the ItemTypeAssocObjData that results from the ItemTypeAssocGetRequest call
 * @return ItemTypeAssocObjData resulting from udt call
 *
 */

  public ItemTypeAssocObjData getOutput() {
    return ItemTypeAssocObjHelper.fromMap(outputMap, "ItemTypeAssoc");
  }
}
