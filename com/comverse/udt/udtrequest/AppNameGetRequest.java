/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameGetRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AppNameGetRequest Udt Request
 *
 */

public class AppNameGetRequest extends AppNameSubRequestParent {
/**
 *
 * Constructor to create a  AppNameGetRequest
 * @param id Unique request name
 * @param AppNameGetIn AppNameObjectKeyData for AppNameGetRequest
 *
 */
@JsonCreator
  public AppNameGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AppName")AppNameObjectKeyData AppNameGetIn) {
    super(id, "AppNameGet");
    if (AppNameGetIn != null) {
      addInput("AppName", AppNameObjectKeyHelper.toMap(AppNameGetIn, new HashMap(), "AppNameObjectKeyData").get("AppNameObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AppNameObjectData that results from the AppNameGetRequest call
 * @return AppNameObjectData resulting from udt call
 *
 */

  public AppNameObjectData getOutput() {
    return AppNameObjectHelper.fromMap(outputMap, "AppName");
  }
}
