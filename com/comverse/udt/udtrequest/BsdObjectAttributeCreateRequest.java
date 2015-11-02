/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeCreateRequest.java
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

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdObjectAttributeCreateRequest Udt Request
 *
 */

public class BsdObjectAttributeCreateRequest extends BsdObjectAttributeSubRequestParent {
/**
 *
 * Constructor to create a  BsdObjectAttributeCreateRequest
 * @param id Unique request name
 * @param bsdObjectAttributeCreateIn BsdObjectAttributeObjectBaseData for BsdObjectAttributeCreateRequest
 *
 */
@JsonCreator
  public BsdObjectAttributeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdObjectAttribute")BsdObjectAttributeObjectBaseData bsdObjectAttributeCreateIn) {
    super(id, "BsdObjectAttributeCreate");
    if (bsdObjectAttributeCreateIn != null) {
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectBaseHelper.toMap(bsdObjectAttributeCreateIn, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }

/**
 *
 * Retrieves the BsdObjectAttributeObjectBaseData that results from the BsdObjectAttributeCreateRequest call
 * @return BsdObjectAttributeObjectBaseData resulting from udt call
 *
 */

  public BsdObjectAttributeObjectBaseData getOutput() {
    return BsdObjectAttributeObjectBaseHelper.fromMap(outputMap, "BsdObjectAttribute");
  }
}
