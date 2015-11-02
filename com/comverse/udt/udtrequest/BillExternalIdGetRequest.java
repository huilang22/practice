/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillExternalIdGetRequest.java
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

import com.csgsystems.si.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BillExternalIdGetRequest Udt Request
 *
 */

public class BillExternalIdGetRequest extends BillExternalIdSubRequestParent {
/**
 *
 * Constructor to create a  BillExternalIdGetRequest
 * @param id Unique request name
 * @param getIn BillExternalIdObjectKeyData for BillExternalIdGetRequest
 *
 */
@JsonCreator
  public BillExternalIdGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillExternalId")BillExternalIdObjectKeyData getIn) {
    super(id, "BillExternalIdGet");
    if (getIn != null) {
      addInput("BillExternalId", BillExternalIdObjectKeyHelper.toMap(getIn, new HashMap(), "BillExternalIdObjectKeyData").get("BillExternalIdObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillExternalIdObjectData that results from the BillExternalIdGetRequest call
 * @return BillExternalIdObjectData resulting from udt call
 *
 */

  public BillExternalIdObjectData getOutput() {
    return BillExternalIdObjectHelper.fromMap(outputMap, "BillExternalId");
  }
}
