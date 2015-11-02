/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleDeleteRequest.java
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
 * Class used to create a BsdLocaleDeleteRequest Udt Request
 *
 */

public class BsdLocaleDeleteRequest extends BsdLocaleSubRequestParent {
/**
 *
 * Constructor to create a  BsdLocaleDeleteRequest
 * @param id Unique request name
 * @param bsdLocaleDeleteIn BsdLocaleObjectKeyData for BsdLocaleDeleteRequest
 *
 */
@JsonCreator
  public BsdLocaleDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdLocale")BsdLocaleObjectKeyData bsdLocaleDeleteIn) {
    super(id, "BsdLocaleDelete");
    if (bsdLocaleDeleteIn != null) {
      addInput("BsdLocale", BsdLocaleObjectKeyHelper.toMap(bsdLocaleDeleteIn, new HashMap(), "BsdLocaleObjectKeyData").get("BsdLocaleObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdLocaleObjectData that results from the BsdLocaleDeleteRequest call
 * @return BsdLocaleObjectData resulting from udt call
 *
 */

  public BsdLocaleObjectData getOutput() {
    return BsdLocaleObjectHelper.fromMap(outputMap, "BsdLocale");
  }
}
