/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataDeleteAllRequest.java
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
 * Class used to create a ItemMarketingDataDeleteAllRequest Udt Request
 *
 */

public class ItemMarketingDataDeleteAllRequest extends ItemMarketingDataRequest {
/**
 *
 * Constructor to create a  ItemMarketingDataDeleteAllRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public ItemMarketingDataDeleteAllRequest(@JsonProperty("RequestId") String id) {
    super(id, "ItemMarketingDataDeleteAll");
  }

}
