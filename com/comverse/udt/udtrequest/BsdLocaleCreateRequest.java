/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleCreateRequest.java
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
 * Class used to create a BsdLocaleCreateRequest Udt Request
 *
 */

public class BsdLocaleCreateRequest extends BsdLocaleSubRequestParent {
/**
 *
 * Constructor to create a  BsdLocaleCreateRequest
 * @param id Unique request name
 * @param bsdLocaleCreateIn BsdLocaleObjectData for BsdLocaleCreateRequest
 *
 */
@JsonCreator
  public BsdLocaleCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdLocale")BsdLocaleObjectData bsdLocaleCreateIn) {
    super(id, "BsdLocaleCreate");
    if (bsdLocaleCreateIn != null) {
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(bsdLocaleCreateIn, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }

/**
 *
 * Retrieves the BsdLocaleObjectData that results from the BsdLocaleCreateRequest call
 * @return BsdLocaleObjectData resulting from udt call
 *
 */

  public BsdLocaleObjectData getOutput() {
    return BsdLocaleObjectHelper.fromMap(outputMap, "BsdLocale");
  }
}
