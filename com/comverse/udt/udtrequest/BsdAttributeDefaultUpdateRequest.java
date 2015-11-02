/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultUpdateRequest.java
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
 * Class used to create a BsdAttributeDefaultUpdateRequest Udt Request
 *
 */

public class BsdAttributeDefaultUpdateRequest extends BsdAttributeDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeDefaultUpdateRequest
 * @param id Unique request name
 * @param bsdAttributeDefaultUpdateIn BsdAttributeDefaultObjectBaseData for BsdAttributeDefaultUpdateRequest
 *
 */
@JsonCreator
  public BsdAttributeDefaultUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeDefault")BsdAttributeDefaultObjectBaseData bsdAttributeDefaultUpdateIn) {
    super(id, "BsdAttributeDefaultUpdate");
    if (bsdAttributeDefaultUpdateIn != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseHelper.toMap(bsdAttributeDefaultUpdateIn, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeDefaultObjectBaseData that results from the BsdAttributeDefaultUpdateRequest call
 * @return BsdAttributeDefaultObjectBaseData resulting from udt call
 *
 */

  public BsdAttributeDefaultObjectBaseData getOutput() {
    return BsdAttributeDefaultObjectBaseHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
}
