/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkSequenceGetRequest.java
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
 * Class used to create a ItemMarketingDataLinkSequenceGetRequest Udt Request
 *
 */

public class ItemMarketingDataLinkSequenceGetRequest extends ItemMarketingDataLinkSubRequestParent {
/**
 *
 * Constructor to create a  ItemMarketingDataLinkSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public ItemMarketingDataLinkSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "ItemMarketingDataLinkSequenceGet");
  }

/**
 *
 * Retrieves the ItemMarketingDataLinkObjectKeyData that results from the ItemMarketingDataLinkSequenceGetRequest call
 * @return ItemMarketingDataLinkObjectKeyData resulting from udt call
 *
 */

  public ItemMarketingDataLinkObjectKeyData getOutput() {
    return ItemMarketingDataLinkObjectKeyHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
}
