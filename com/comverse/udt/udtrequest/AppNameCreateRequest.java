/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameCreateRequest.java
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
 * Class used to create a AppNameCreateRequest Udt Request
 *
 */

public class AppNameCreateRequest extends AppNameSubRequestParent {
/**
 *
 * Constructor to create a  AppNameCreateRequest
 * @param id Unique request name
 * @param AppNameCreateIn AppNameObjectData for AppNameCreateRequest
 *
 */
@JsonCreator
  public AppNameCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AppName")AppNameObjectData AppNameCreateIn) {
    super(id, "AppNameCreate");
    if (AppNameCreateIn != null) {
      addInput("AppName", AppNameObjectHelper.toMap(AppNameCreateIn, new HashMap(), "AppName").get("AppName"));
    }
  }

/**
 *
 * Retrieves the AppNameObjectData that results from the AppNameCreateRequest call
 * @return AppNameObjectData resulting from udt call
 *
 */

  public AppNameObjectData getOutput() {
    return AppNameObjectHelper.fromMap(outputMap, "AppName");
  }
}
