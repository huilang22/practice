/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeCreateRequest.java
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
 * Class used to create a BsdAttributeCreateRequest Udt Request
 *
 */

public class BsdAttributeCreateRequest extends BsdAttributeSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeCreateRequest
 * @param id Unique request name
 * @param bsdAttributeCreateIn BsdAttributeObjectData for BsdAttributeCreateRequest
 *
 */
@JsonCreator
  public BsdAttributeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttribute")BsdAttributeObjectData bsdAttributeCreateIn) {
    super(id, "BsdAttributeCreate");
    if (bsdAttributeCreateIn != null) {
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(bsdAttributeCreateIn, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeObjectData that results from the BsdAttributeCreateRequest call
 * @return BsdAttributeObjectData resulting from udt call
 *
 */

  public BsdAttributeObjectData getOutput() {
    return BsdAttributeObjectHelper.fromMap(outputMap, "BsdAttribute");
  }
}
