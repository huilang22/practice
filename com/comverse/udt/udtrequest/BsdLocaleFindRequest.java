/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleFindRequest.java
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
 * Class used to create a BsdLocaleFindRequest Udt Request
 *
 */

public class BsdLocaleFindRequest extends BsdLocaleRequest {
/**
 *
 * Constructor to create a  BsdLocaleFindRequest
 * @param id Unique request name
 * @param bsdLocaleFindIn BsdLocaleObjectFilter for BsdLocaleFindRequest
 *
 */
@JsonCreator
  public BsdLocaleFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdLocale")BsdLocaleObjectFilter bsdLocaleFindIn) {
    super(id, "BsdLocaleFind");
    if (bsdLocaleFindIn != null) {
      Integer index =  bsdLocaleFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(bsdLocaleFindIn, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }

/**
 *
 * Retrieves the BsdLocaleObjectDataList that results from the BsdLocaleFindRequest call
 * @return BsdLocaleObjectDataList resulting from udt call
 *
 */

  public BsdLocaleObjectDataList getOutput() {
    return BsdLocaleObjectHelper.fromMapList(outputMap, "BsdLocaleList");
  }
}
