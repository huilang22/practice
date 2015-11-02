/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultCreateRequest.java
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
 * Class used to create a BsdAttributeDefaultCreateRequest Udt Request
 *
 */

public class BsdAttributeDefaultCreateRequest extends BsdAttributeDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeDefaultCreateRequest
 * @param id Unique request name
 * @param bsdAttributeDefaultCreateIn BsdAttributeDefaultObjectBaseData for BsdAttributeDefaultCreateRequest
 *
 */
@JsonCreator
  public BsdAttributeDefaultCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeDefault")BsdAttributeDefaultObjectBaseData bsdAttributeDefaultCreateIn) {
    super(id, "BsdAttributeDefaultCreate");
    if (bsdAttributeDefaultCreateIn != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseHelper.toMap(bsdAttributeDefaultCreateIn, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeDefaultObjectBaseData that results from the BsdAttributeDefaultCreateRequest call
 * @return BsdAttributeDefaultObjectBaseData resulting from udt call
 *
 */

  public BsdAttributeDefaultObjectBaseData getOutput() {
    return BsdAttributeDefaultObjectBaseHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
}
