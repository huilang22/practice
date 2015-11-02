/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameUpdateRequest.java
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
 * Class used to create a AppNameUpdateRequest Udt Request
 *
 */

public class AppNameUpdateRequest extends AppNameSubRequestParent {
/**
 *
 * Constructor to create a  AppNameUpdateRequest
 * @param id Unique request name
 * @param AppNameUpdateIn AppNameObjectData for AppNameUpdateRequest
 *
 */
@JsonCreator
  public AppNameUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AppName")AppNameObjectData AppNameUpdateIn) {
    super(id, "AppNameUpdate");
    if (AppNameUpdateIn != null) {
      addInput("AppName", AppNameObjectHelper.toMap(AppNameUpdateIn, new HashMap(), "AppName").get("AppName"));
    }
  }

/**
 *
 * Retrieves the AppNameObjectData that results from the AppNameUpdateRequest call
 * @return AppNameObjectData resulting from udt call
 *
 */

  public AppNameObjectData getOutput() {
    return AppNameObjectHelper.fromMap(outputMap, "AppName");
  }
}
