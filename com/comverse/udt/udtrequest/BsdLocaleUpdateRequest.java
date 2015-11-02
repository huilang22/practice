/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleUpdateRequest.java
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
 * Class used to create a BsdLocaleUpdateRequest Udt Request
 *
 */

public class BsdLocaleUpdateRequest extends BsdLocaleSubRequestParent {
/**
 *
 * Constructor to create a  BsdLocaleUpdateRequest
 * @param id Unique request name
 * @param bsdLocaleUpdateIn BsdLocaleObjectData for BsdLocaleUpdateRequest
 *
 */
@JsonCreator
  public BsdLocaleUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdLocale")BsdLocaleObjectData bsdLocaleUpdateIn) {
    super(id, "BsdLocaleUpdate");
    if (bsdLocaleUpdateIn != null) {
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(bsdLocaleUpdateIn, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }

/**
 *
 * Retrieves the BsdLocaleObjectData that results from the BsdLocaleUpdateRequest call
 * @return BsdLocaleObjectData resulting from udt call
 *
 */

  public BsdLocaleObjectData getOutput() {
    return BsdLocaleObjectHelper.fromMap(outputMap, "BsdLocale");
  }
}
