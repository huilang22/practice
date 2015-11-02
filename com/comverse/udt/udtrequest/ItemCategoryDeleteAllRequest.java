/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemCategoryDeleteAllRequest.java
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
 * Class used to create a ItemCategoryDeleteAllRequest Udt Request
 *
 */

public class ItemCategoryDeleteAllRequest extends ItemCategoryRequest {
/**
 *
 * Constructor to create a  ItemCategoryDeleteAllRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public ItemCategoryDeleteAllRequest(@JsonProperty("RequestId") String id) {
    super(id, "ItemCategoryDeleteAll");
  }

}
