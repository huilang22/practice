/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataLinkSequenceGetNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a ItemMarketingDataLinkSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class ItemMarketingDataLinkSequenceGetNoOpRequest extends ItemMarketingDataLinkSubRequestParent {
/**
 *
 * Constructor to create a   ItemMarketingDataLinkSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemMarketingDataLinkSequenceGetNoOpRequest(String id, ItemMarketingDataLinkObjectKeyData noOpIn) {
    super(id, "ItemMarketingDataLinkSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ItemMarketingDataLink", ItemMarketingDataLinkObjectKeyHelper.toMap(noOpIn, new HashMap(), "ItemMarketingDataLink").get("ItemMarketingDataLink"));
    }
  }
/**
 *
 * Retrieves the ItemMarketingDataLinkObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemMarketingDataLinkObjectKeyData getOutput() {
    return ItemMarketingDataLinkObjectKeyHelper.fromMap(outputMap, "ItemMarketingDataLink");
  }
}
