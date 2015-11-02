/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeRefGetRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a StatisticTypeRefGetRequest Udt Request
 *
 */

public class StatisticTypeRefGetRequest extends StatisticTypeRefSubRequestParent {
/**
 *
 * Constructor to create a  StatisticTypeRefGetRequest
 * @param id Unique request name
 * @param StatisticTypeRefGetIn StatisticTypeRefObjectKeyData for StatisticTypeRefGetRequest
 *
 */
@JsonCreator
  public StatisticTypeRefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatisticTypeRef")StatisticTypeRefObjectKeyData StatisticTypeRefGetIn) {
    super(id, "StatisticTypeRefGet");
    if (StatisticTypeRefGetIn != null) {
      addInput("StatisticTypeRef", StatisticTypeRefObjectKeyHelper.toMap(StatisticTypeRefGetIn, new HashMap(), "StatisticTypeRefObjectKeyData").get("StatisticTypeRefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the StatisticTypeRefObjectData that results from the StatisticTypeRefGetRequest call
 * @return StatisticTypeRefObjectData resulting from udt call
 *
 */

  public StatisticTypeRefObjectData getOutput() {
    return StatisticTypeRefObjectHelper.fromMap(outputMap, "StatisticTypeRef");
  }
}
